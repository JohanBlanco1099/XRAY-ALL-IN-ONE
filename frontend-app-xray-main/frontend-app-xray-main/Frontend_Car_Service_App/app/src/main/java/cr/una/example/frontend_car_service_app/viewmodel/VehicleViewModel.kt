package cr.una.example.frontend_car_service_app.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cr.una.example.frontend_car_service_app.model.VehicleRequest
import cr.una.example.frontend_car_service_app.model.VehicleResponse
import cr.una.example.frontend_car_service_app.repository.VehicleRepository
import kotlinx.coroutines.*

sealed class StateVehicle {
    object Loading : StateVehicle()
    data class Success(val vehicle: VehicleResponse?) : StateVehicle()
    data class SuccessDelete(val deleted: Boolean?) : StateVehicle()
    data class SuccessList(val vehicleList: List<VehicleResponse>?) : StateVehicle()
    data class Error(val message: String) : StateVehicle()
}

class VehicleViewModel constructor(
    private val vehicleRepository: VehicleRepository,
) : ViewModel() {

    // this is just a way to keep the mutable LiveData private, so it can't be updated
    private val _state = MutableLiveData<StateVehicle>()
    val state: LiveData<StateVehicle> get() = _state

    private var job: Job? = null
    private val errorMessage = MutableLiveData<String>()
    private val loading = MutableLiveData<Boolean>()

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        onError("Exception handled: ${throwable.localizedMessage}")
    }

    /**
     * When we call getTask() suspend method, then it suspends our coroutine.
     * The coroutine on the main thread will be resumed with the result as soon as the
     * withContext block is complete.
     */
    fun getVehicle(id: Long) {
        _state.value = StateVehicle.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = vehicleRepository.getVehicleById(id)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateVehicle.Success(response.body())
                    else StateVehicle.Error("Error : ${response.message()} ")
                )
            }
        }
    }

    /**
     * When we call findAllTask() suspend method, then it suspends our coroutine.
     * The coroutine on the main thread will be resumed with the result as soon as the
     * withContext block is complete.
     */
    fun findAllVehicle() {
        _state.value = StateVehicle.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = vehicleRepository.getAllVehicles()
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateVehicle.SuccessList(response.body())
                    else StateVehicle.Error("Error : ${response.message()} ")
                )
            }
        }
    }

    fun deleteVehicleById(id: Long) {
        _state.value = StateVehicle.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = vehicleRepository.deleteVehicleById(id)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateVehicle.SuccessDelete(true)
                    else StateVehicle.Error("Error : ${response.message()} ")
                )
            }
        }
    }

    fun createVehicle(vehicleRequest: VehicleRequest) {
        _state.value = StateVehicle.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = vehicleRepository.createVehicle(vehicleRequest)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    (if (response.isSuccessful) {
                        StateVehicle.Success(response.body() as VehicleResponse)
                    } else {
                        StateVehicle.Error("Error : ${response.message()} ")
                        onError("Error : ${response.message()}")
                    }) as StateVehicle?
                )
            }
        }
    }

    fun updateVehicle(vehicleRequest: VehicleRequest) {
        _state.value = StateVehicle.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = vehicleRepository.updateVehicle(vehicleRequest)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateVehicle.Success(response.body())
                    else StateVehicle.Error("Error : ${response.message()} ")
                )
            }
        }
    }

    private fun onError(message: String) {
        errorMessage.value = message
        loading.value = false
    }

    override fun onCleared() {
        super.onCleared()
        job?.cancel()
    }
}