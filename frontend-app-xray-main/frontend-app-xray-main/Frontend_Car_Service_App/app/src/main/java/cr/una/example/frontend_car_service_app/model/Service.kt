package cr.una.example.frontend_car_service_app.model

data class ServiceRequest(
    var id: Long? = null,
    var description: String?=null,
)


data class ServiceResponse(
    var id: Long? = null,
    var description: String?=null,
    //var repairs: List<RepairResult>? = null
)