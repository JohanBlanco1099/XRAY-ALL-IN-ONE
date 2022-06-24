package cr.una.example.frontend_car_service_app.service
import cr.una.example.frontend_car_service_app.model.ServiceRequest
import cr.una.example.frontend_car_service_app.model.ServiceResponse
import retrofit2.Response
import retrofit2.http.*

interface ServiceService {
    @GET("v1/services")
    suspend fun getAllServices() : Response<List<ServiceResponse>>
    @GET("v1/services/{id}")
    suspend fun getServiceById(@Path("id") id: Long) : Response<ServiceResponse>
    @DELETE("v1/services/{id}")
    suspend fun deleteServiceById(@Path("id") id: Long): Response<Void>
    @POST("v1/services")
    suspend fun createService(@Body ServiceRequest: ServiceRequest) : Response<ServiceResponse>
    @PUT("v1/services")
    suspend fun updateService(@Body ServiceRequest: ServiceRequest) : Response<ServiceResponse>

    companion object{
        private var serviceService : ServiceService? = null
        fun getInstance() : ServiceService {
            if (serviceService == null) {
                serviceService = ServiceBuilder.buildService(ServiceService::class.java)
            }
            return serviceService!!
        }
    }

}