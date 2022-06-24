package edu.mike.education.Backend_Car_Service_App

import java.util.*


data class UserInput(
    var id: Long? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var email: String? = null,
    var password: String? = null,
    var enabled: Boolean? = null,
    var roleList: List<RoleDetails>? = null,
    var createDate: Date?=null,
)

data class UserLoginInput(
    var username: String = "",
    var password: String = "",
)

data class UserResult(
    var id: Long? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var email: String? = null,
    var password: String? = null,
    var enabled: Boolean? = null,
    var tokenExpired: Boolean? = null,
    var createDate: Date? = null,
    var roleList: List<RoleDetails>?=null,
)

data class UserSignUpInput(
    var firstName: String? = null,
    var lastName: String? = null,
    var email: String? = null,
    var password: String? = null,
)


data class StatusDetails(
    var id: Long? = null,
    var description: String? = null,
)
data class PrivilegeInput(
    var id: Long? = null,
    var name: String? = null,
)

data class PrivilegeDetails(
    var id: Long? = null,
    var name: String? = null,
)

data class RoleDetails(
    var id: Long? = null,
    var name: String? = null,
    var privilegeList: List<PrivilegeDetails>? = null,
)


data class VehicleInput(
    var id: Long? = null,
    var vin_num: Int? = null,
    var serial_num: Int? = null,
    var brand: String? = null,
    var car_type: String? = null,
    var engine_type: String? = null,

)

data class VehicleResult(
    var id: Long? = null,
    var vin_num: Int? = null,
    var serial_num: Int? = null,
    var brand: String? = null,
    var car_type: String? = null,
    var engine_type: String? = null,
)


/** Repair **/
data class RepairInput(
    var id: Long? = null,
    var vehicle: VehicleResult?=null,
    var status: StatusDetails?=null,
    var userList: List<UserResult>?=null,
    var serviceList : List<ServiceResult>?=null
)
data class RepairResult(
    var id: Long? = null,
    var vehicle: VehicleResult?=null,
    var status: StatusDetails?=null,
    var userList: List<UserResult>?=null,
    var serviceList : List<ServiceResult>?=null
)


data class ServiceInput(
    var id: Long? = null,
    var description: String?=null,
)


data class ServiceResult(
    var id: Long? = null,
    var description: String?=null,
    //var repairs: List<RepairResult>? = null
)

data class RoleInput(
    var id: Long? = null,
    var name: String?=null,
   // var privileges: List<PrivilegeDetails>
)

