package cr.una.example.frontend_car_service_app.repository

import cr.una.example.frontend_car_service_app.service.StatusService

class StatusRepository constructor(
    private val statusService: StatusService
){
    suspend fun getAllStatus() = statusService.getAllStatus()

    suspend fun getStatusById(id : Long) = statusService.getStatusById(id)
}