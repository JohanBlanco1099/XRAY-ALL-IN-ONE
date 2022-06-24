package cr.una.example.frontend_car_service_app.service


import cr.una.example.frontend_car_service_app.model.VehicleRequest
import cr.una.example.frontend_car_service_app.model.VehicleResponse
import retrofit2.Response
import retrofit2.http.*

interface VehicleService {
    @GET("v1/vehicles")
    suspend fun getAllVehicles() : Response<List<VehicleResponse>>

    @GET("v1/vehicles/{id}")
    suspend fun getVehicleById(@Path("id") id: Long) : Response<VehicleResponse>

    @DELETE("v1/vehicles/{id}")
    suspend fun deleteVehicleById(@Path("id") id: Long): Response<Void>

    @POST("v1/vehicles")
    suspend fun createVehicle(@Body VehicleRequest: VehicleRequest) : Response<VehicleResponse>

    @PUT("v1/vehicles")
    suspend fun updateVehicle(@Body VehicleRequest: VehicleRequest) : Response<VehicleResponse>

    /*
     * Function or any member of the class that can be called without having the instance of the
     * class then you can write the same as a member of a companion object inside the class
     */
    companion object{
        private var vehicleService : VehicleService? = null
        fun getInstance() : VehicleService {
            if (vehicleService == null) {
                vehicleService = ServiceBuilder.buildService(VehicleService::class.java)
            }
            return vehicleService!!
        }
    }

}