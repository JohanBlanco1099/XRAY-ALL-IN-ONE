package cr.una.example.frontend_car_service_app.model

data class RoleDetails(
    var id: Long? = null,
    var name: String? = null,
    var privilegeList: List<PrivilegeDetails>? = null,
)