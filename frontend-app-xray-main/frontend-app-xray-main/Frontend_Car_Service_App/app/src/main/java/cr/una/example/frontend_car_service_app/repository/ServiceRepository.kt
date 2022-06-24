package cr.una.example.frontend_car_service_app.repository

import cr.una.example.frontend_car_service_app.model.ServiceRequest
import cr.una.example.frontend_car_service_app.service.ServiceService


class ServiceRepository constructor(
    private val serviceService: ServiceService
){
    suspend fun getAllServices() = serviceService.getAllServices()
    suspend fun getServiceById(id : Long) = serviceService.getServiceById(id)
    suspend fun deleteServiceById(id : Long) = serviceService.deleteServiceById(id)
    suspend fun createService(serviceRequest: ServiceRequest) = serviceService.createService(serviceRequest)
    suspend fun updateService(serviceRequest: ServiceRequest) = serviceService.updateService(serviceRequest)
}