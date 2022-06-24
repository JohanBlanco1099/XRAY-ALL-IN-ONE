package cr.una.example.frontend_car_service_app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cr.una.example.frontend_car_service_app.repository.VehicleRepository
import cr.una.example.frontend_car_service_app.service.VehicleService

@Suppress("UNCHECKED_CAST")
class VehicleViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(VehicleViewModel::class.java)) {
            VehicleViewModel(
                vehicleRepository = VehicleRepository(
                    vehicleService = VehicleService.getInstance()
                )
            ) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}