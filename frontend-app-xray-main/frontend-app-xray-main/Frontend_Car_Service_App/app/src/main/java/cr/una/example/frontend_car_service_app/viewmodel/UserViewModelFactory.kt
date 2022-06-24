package cr.una.example.frontend_car_service_app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cr.una.example.frontend_car_service_app.repository.UserRepository
import cr.una.example.frontend_car_service_app.service.UserService

@Suppress("UNCHECKED_CAST")
class UserViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            UserViewModel(
                userRepository = UserRepository(
                    userService = UserService.getInstance()
                )
            ) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}