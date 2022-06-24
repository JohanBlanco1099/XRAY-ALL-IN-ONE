package cr.una.example.frontend_car_service_app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cr.una.example.frontend_car_service_app.repository.ServiceRepository
import cr.una.example.frontend_car_service_app.service.ServiceService


@Suppress("UNCHECKED_CAST")
class ServiceViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(ServiceViewModel::class.java)) {
            ServiceViewModel(
                serviceRepository = ServiceRepository(
                    serviceService = ServiceService.getInstance()
                )
            ) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}