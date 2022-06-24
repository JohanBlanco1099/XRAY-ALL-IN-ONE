package cr.una.example.frontend_car_service_app.repository

import cr.una.example.frontend_car_service_app.model.UserRequest
import cr.una.example.frontend_car_service_app.service.UserService

class UserRepository constructor(
    private val userService: UserService
){
    suspend fun getAllUsers() = userService.getAllUsers()

    suspend fun getUserById(id : Long) = userService.getUserById(id)

    suspend fun deleteUserById(id : Long) = userService.deleteUserById(id)

    suspend fun createUser(userRequest: UserRequest) = userService.createUser(userRequest)

    suspend fun updateUser(userRequest: UserRequest) = userService.updateUser(userRequest)


}