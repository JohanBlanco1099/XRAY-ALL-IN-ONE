package cr.una.example.frontend_car_service_app.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cr.una.example.frontend_car_service_app.model.StatusDetails
import cr.una.example.frontend_car_service_app.repository.StatusRepository
import kotlinx.coroutines.*



class StatusViewModel constructor(
    private val statusRepository: StatusRepository,
) : ViewModel() {

    val statusList = MutableLiveData<List<StatusDetails>>()

    private var job: Job? = null
    private val errorMessage = MutableLiveData<String>()
    private val loading = MutableLiveData<Boolean>()

    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        onError("Exception handled: ${throwable.localizedMessage}")
    }


    fun findAllStatus() {
        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            loading.postValue(true)
            val response = statusRepository.getAllStatus()
            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {
                    statusList.postValue(response.body())
                    loading.value = false
                } else {
                    onError("Error : ${response.message()}")
                }
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