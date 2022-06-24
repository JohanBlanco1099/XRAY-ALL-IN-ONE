package cr.una.example.frontend_car_service_app.repository

import cr.una.example.frontend_car_service_app.model.VehicleRequest
import cr.una.example.frontend_car_service_app.service.VehicleService

class VehicleRepository constructor(
    private val vehicleService: VehicleService
){
    suspend fun getAllVehicles() = vehicleService.getAllVehicles()

    suspend fun getVehicleById(id : Long) = vehicleService.getVehicleById(id)

    suspend fun deleteVehicleById(id : Long) = vehicleService.deleteVehicleById(id)

    suspend fun createVehicle(vehicleRequest: VehicleRequest) = vehicleService.createVehicle(vehicleRequest)

    suspend fun updateVehicle(vehicleRequest: VehicleRequest) = vehicleService.updateVehicle(vehicleRequest)
}