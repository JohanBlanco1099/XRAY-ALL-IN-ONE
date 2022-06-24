package cr.una.example.frontend_car_service_app.model

data class VehicleResponse ( //Response
    var id: Long? = null,
    var vin_num: Int? = null,
    var serial_num: Int? = null,
    var brand: String? = null,
    var car_type: String? = null,
    var engine_type: String? = null,
)

data class VehicleRequest(
    var id: Long? = null,
    var vin_num: Int? = null,
    var serial_num: Int? = null,
    var brand: String? = null,
    var car_type: String? = null,
    var engine_type: String? = null,
)
