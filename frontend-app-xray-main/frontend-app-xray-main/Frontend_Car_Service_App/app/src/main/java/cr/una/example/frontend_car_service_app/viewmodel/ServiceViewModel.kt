package cr.una.example.frontend_car_service_app.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cr.una.example.frontend_car_service_app.model.ServiceRequest
import cr.una.example.frontend_car_service_app.model.ServiceResponse
import cr.una.example.frontend_car_service_app.repository.ServiceRepository
import kotlinx.coroutines.*

sealed class StateService {
    object Loading : StateService()
    data class Success(val service: ServiceResponse?) : StateService()
    data class SuccessDelete(val deleted: Boolean?) : StateService()
    data class SuccessList(val serviceList: List<ServiceResponse>?) : StateService()
    data class Error(val message: String) : StateService()
    data class SuccessListSelected(val serviceListSelected: List<ServiceResponse>?) : StateService()
}

class ServiceViewModel constructor(
    private val serviceRepository: ServiceRepository,
) : ViewModel() {

    // this is just a way to keep the mutable LiveData private, so it can't be updated
    private val _state = MutableLiveData<StateService>()
    val state: LiveData<StateService> get() = _state

    private var job: Job? = null
    private val errorMessage = MutableLiveData<String>()
    private val loading = MutableLiveData<Boolean>()
    private var selected = mutableListOf<ServiceResponse>()

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        onError("Exception handled: ${throwable.localizedMessage}")
    }

    fun getService(id: Long) {
        _state.value = StateService.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = serviceRepository.getServiceById(id)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateService.Success(response.body())
                    else StateService.Error("Error : ${response.message()} ")
                )
            }
        }
    }

    fun setSelectedServices(services_id: MutableList<out Any>) {
        var s = mutableListOf<ServiceResponse>()
        for(item in services_id){
            var d :ServiceResponse = item as ServiceResponse
            s.add(d)
        }
        selected = s
    }

    fun getSelectedServices(): MutableList<ServiceResponse> {
        return this.selected
    }



    fun findAllServices() {
        _state.value = StateService.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = serviceRepository.getAllServices()
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateService.SuccessList(response.body())
                    else StateService.Error("Error : ${response.message()} ")
                )
            }
        }
    }

    fun deleteServiceById(id: Long) {
        _state.value = StateService.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = serviceRepository.deleteServiceById(id)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateService.SuccessDelete(true)
                    else StateService.Error("Error : ${response.message()} ")
                )
            }
        }
    }

    fun createService(serviceRequest: ServiceRequest) {
        _state.value = StateService.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = serviceRepository.createService(serviceRequest)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    (if (response.isSuccessful) {
                        StateService.Success(response.body() as ServiceResponse)
                    } else {
                        StateService.Error("Error : ${response.message()} ")
                        onError("Error : ${response.message()}")
                    }) as StateService?
                )
            }
        }
    }

    fun updateService(serviceRequest: ServiceRequest) {
        _state.value = StateService.Loading
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = serviceRepository.updateService(serviceRequest)
            withContext(Dispatchers.Main) {
                // if you're using postValue I don't think you need to switch to Dispatchers.Main?
                _state.postValue(
                    // when you get a response, the state is now either Success or Error
                    if (response.isSuccessful) StateService.Success(response.body())
                    else StateService.Error("Error : ${response.message()} ")
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