package cr.una.example.frontend_car_service_app.service

import cr.una.example.frontend_car_service_app.model.RepairRequest
import cr.una.example.frontend_car_service_app.model.RepairResponse
import retrofit2.Response
import retrofit2.http.*

interface RepairService {
    @GET("v1/repairs")
    suspend fun getAllRepairs() : Response<List<RepairResponse>>

    @GET("v1/repairs/{id}")
    suspend fun getRepairById(@Path("id") id: Long) : Response<RepairResponse>

    @DELETE("v1/repairs/{id}")
    suspend fun deleteRepairById(@Path("id") id: Long): Response<Void>

    @POST("v1/repairs")
    suspend fun createRepair(@Body RepairRequest: RepairRequest) : Response<RepairResponse>

    @PUT("v1/repairs")
    suspend fun updateRepair(@Body RepairRequest: RepairRequest) : Response<RepairResponse>

    /*
     * Function or any member of the class that can be called without having the instance of the
     * class then you can write the same as a member of a companion object inside the class
     */
    companion object{
        private var repairService : RepairService? = null
        fun getInstance() : RepairService {
            if (repairService == null) {
                repairService = ServiceBuilder.buildService(RepairService::class.java)
            }
            return repairService!!
        }
    }

}