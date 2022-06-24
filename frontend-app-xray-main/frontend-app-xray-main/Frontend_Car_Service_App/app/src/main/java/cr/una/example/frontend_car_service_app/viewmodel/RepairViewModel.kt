package cr.una.example.frontend_car_service_app.viewmodel

import cr.una.example.frontend_car_service_app.model.RepairRequest
import cr.una.example.frontend_car_service_app.model.RepairResponse
import cr.una.example.frontend_car_service_app.repository.RepairRepository
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*

sealed class StateRepair {
    object Loading : StateRepair()
    data class Success(val repair: RepairResponse?) : StateRepair()
    data class SuccessDelete(val deleted: Boolean?) : StateRepair()
    data class SuccessList(val repairList: List<RepairResponse>?) : StateRepair()
    data class Error(val message: String) : StateRepair()

}

class RepairViewModel constructor(
    private val repairRepository: RepairRepository,
) : ViewModel() {

    // this is just a way to keep the mutable LiveData private, so it can't be updated
    private val _state = MutableLiveData<StateRepair>()
    val state: LiveData<StateRepair> get() = _state

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
    fun getRepair(id: Long) {
        _state.value = StateRepair.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = repairRepository.getRepairById(id)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateRepair.Success(response.body())
                    else StateRepair.Error("Error : ${response.message()} ")
                )
            }
        }
    }

    /**
     * When we call findAllTask() suspend method, then it suspends our coroutine.
     * The coroutine on the main thread will be resumed with the result as soon as the
     * withContext block is complete.
     */
    fun findAllRepair() {
        _state.value = StateRepair.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = repairRepository.getAllRepairs()
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateRepair.SuccessList(response.body())
                    else StateRepair.Error("Error : ${response.message()} ")
                )
            }
        }
    }

    fun deleteRepairById(id: Long) {
        _state.value = StateRepair.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = repairRepository.deleteRepairById(id)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateRepair.SuccessDelete(true)
                    else StateRepair.Error("Error : ${response.message()} ")
                )
            }
        }
    }

    fun createRepair(repairRequest: RepairRequest) {
        _state.value = StateRepair.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = repairRepository.createRepair(repairRequest)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    (if (response.isSuccessful) {
                        StateRepair.Success(response.body() as RepairResponse)
                    } else {
                        StateRepair.Error("Error : ${response.message()} ")
                        onError("Error : ${response.message()}")
                    }) as StateRepair?
                )
            }
        }
    }

    fun updateRepair(repairRequest: RepairRequest) {
        _state.value = StateRepair.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = repairRepository.updateRepair(repairRequest)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateRepair.Success(response.body())
                    else StateRepair.Error("Error : ${response.message()} ")
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