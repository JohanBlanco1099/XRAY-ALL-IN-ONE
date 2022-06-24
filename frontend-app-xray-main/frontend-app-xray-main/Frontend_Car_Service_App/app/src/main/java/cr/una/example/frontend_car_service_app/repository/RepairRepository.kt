package cr.una.example.frontend_car_service_app.repository

import cr.una.example.frontend_car_service_app.model.RepairRequest
import cr.una.example.frontend_car_service_app.service.RepairService

class RepairRepository constructor(
    private val repairService: RepairService
){
    suspend fun getAllRepairs() = repairService.getAllRepairs()
    suspend fun getRepairById(id : Long) = repairService.getRepairById(id)
    suspend fun deleteRepairById(id : Long) = repairService.deleteRepairById(id)
    suspend fun createRepair(repairRequest: RepairRequest) = repairService.createRepair(repairRequest)
    suspend fun updateRepair(repairRequest: RepairRequest) = repairService.updateRepair(repairRequest)
}