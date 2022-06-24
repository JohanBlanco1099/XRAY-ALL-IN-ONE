package cr.una.example.frontend_car_service_app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cr.una.example.frontend_car_service_app.repository.StatusRepository
import cr.una.example.frontend_car_service_app.service.StatusService

@Suppress("UNCHECKED_CAST")
class StatusViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(StatusViewModel::class.java)) {
            StatusViewModel(
                statusRepository = StatusRepository(
                    statusService = StatusService.getInstance()
                )
            ) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}