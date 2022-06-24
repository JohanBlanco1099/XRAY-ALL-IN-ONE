package cr.una.example.frontend_car_service_app.model



data class StatusDetails(
    var id: Long? = null,
    var description: String? = null,
) {
    override fun toString(): String {
        return "$description"
    }
}