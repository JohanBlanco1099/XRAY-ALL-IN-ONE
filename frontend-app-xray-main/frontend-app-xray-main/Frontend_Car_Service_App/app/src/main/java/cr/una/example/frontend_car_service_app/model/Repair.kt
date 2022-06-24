package cr.una.example.frontend_car_service_app.model

data class RepairRequest(
    var id: Long? = null,
    var vehicle: VehicleResponse?=null,
    var status: StatusDetails?=null,
    var userList: List<UserResponse>?=null,
    var serviceList : List<ServiceResponse>?=null
)

data class RepairResponse(
    var id: Long? = null,
    var vehicle: VehicleResponse?=null,
    var status: StatusDetails?=null,
    var userList: List<UserResponse>?=null,
    var serviceList : List<ServiceResponse>?=null
)