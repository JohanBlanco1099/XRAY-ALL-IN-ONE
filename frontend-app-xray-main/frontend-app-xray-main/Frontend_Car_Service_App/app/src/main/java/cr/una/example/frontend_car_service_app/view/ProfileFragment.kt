package cr.una.example.frontend_car_service_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.databinding.FragmentProfileBinding
import cr.una.example.frontend_car_service_app.model.UserRequest
import cr.una.example.frontend_car_service_app.model.UserResponse
import cr.una.example.frontend_car_service_app.utils.MyApplication
import cr.una.example.frontend_car_service_app.viewmodel.StateUser
import cr.una.example.frontend_car_service_app.viewmodel.UserViewModel
import cr.una.example.frontend_car_service_app.viewmodel.UserViewModelFactory


class ProfileFragment : Fragment() {


    // Definition of the binding variable
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private val userViewModel: UserViewModel by activityViewModels{
        UserViewModelFactory()
    }
    private lateinit var userResponse: UserResponse

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        var id = MyApplication.sessionManager?.fetchUserIdLogged()
        if (id != null) {
            userViewModel.getUser(id)
        }
        // Observer method to bind data of task into text views
        userViewModel.state.observe(viewLifecycleOwner) { state ->
            with(binding.root) {
                when (state) {
                    // just checking equality because Loading is a -singleton object instance-
                    StateUser.Loading -> {
                        // TODO: If you need do something in loading
                    }
                    // Error and Success are both -classes- so we need to check their type with 'is'
                    is StateUser.Error -> {
                        // TODO: If you need do something in error
                    }
                    is StateUser.Success -> {
                        state.user?.let {
                            userResponse = it
                            binding.formProfileEmail.setText(it.email)
                            binding.formProfileFirst.setText(it.firstName)
                            binding.formProfileLast.setText(it.lastName)
                        }

                    }
                    else -> {
                        // TODO: Not state loaded
                    }
                }
            }
        }

        binding.btnUpdateProfile.setOnClickListener {

            val userUpdated = UserRequest(
                id = userResponse.id,
                email =  binding.formProfileEmail.text.toString() ,
                firstName = binding.formProfileFirst.text.toString(),
                lastName =binding.formProfileLast.text.toString()
            )

            userViewModel.updateUser(userUpdated)
            userViewModel.state.observe(viewLifecycleOwner) { state ->
                when (state) {
                    // just checking equality because Loading is a -singleton object instance-
                    StateUser.Loading -> {
                        // TODO: If you need do something in loading
                    }
                    // Error and Success are both -classes- so we need to check their type with 'is'
                    is StateUser.Error -> {
                        // TODO: If you need do something in error
                    }
                    is StateUser.Success -> {
                        findNavController().navigate(R.id.action_profileFragment_to_homeFragment)
                    }
                    else -> {
                        // TODO: Not state loaded
                    }
                }
            }
        }


        return binding.root
    }

}