package cr.una.example.frontend_car_service_app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cr.una.example.frontend_car_service_app.repository.RepairRepository
import cr.una.example.frontend_car_service_app.service.RepairService

@Suppress("UNCHECKED_CAST")
class RepairViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(RepairViewModel::class.java)) {
            RepairViewModel(
                repairRepository = RepairRepository(
                    repairService = RepairService.getInstance()
                )
            ) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}