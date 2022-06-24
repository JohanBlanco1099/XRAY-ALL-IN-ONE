package cr.una.example.frontend_car_service_app.service

import cr.una.example.frontend_car_service_app.model.StatusDetails

import retrofit2.Response
import retrofit2.http.*

interface StatusService {
    @GET("v1/status")
    suspend fun getAllStatus() : Response<List<StatusDetails>>

    @GET("v1/status/{id}")
    suspend fun getStatusById(@Path("id") id: Long) : Response<StatusDetails>


    companion object{
        private var statusService : StatusService? = null
        fun getInstance() : StatusService {
            if (statusService == null) {
                statusService = ServiceBuilder.buildService(StatusService::class.java)
            }
            return statusService!!
        }
    }
}