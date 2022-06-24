package cr.una.example.frontend_car_service_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.adapter.UserAdapter
import cr.una.example.frontend_car_service_app.databinding.FragmentUserUpdateBinding
import cr.una.example.frontend_car_service_app.model.UserRequest
import cr.una.example.frontend_car_service_app.model.UserResponse
import cr.una.example.frontend_car_service_app.viewmodel.StateUser
import cr.una.example.frontend_car_service_app.viewmodel.UserViewModel


class UserUpdateFragment : Fragment() {

    // Definition of the binding variable
    private var _binding: FragmentUserUpdateBinding? = null
    private val binding get() = _binding!!

    // Late init var
    private lateinit var userResponse: UserResponse
    private lateinit var userId: String


    // Shared view model
    private val userViewModel: UserViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserUpdateBinding.inflate(inflater, container, false)
        userId = arguments?.getString(UserAdapter.USER_ID) ?: "0"

        /// Observer method to bind data of task into text views
        userViewModel.state.observe(viewLifecycleOwner) { state ->
            // this lets us avoid repeating 'binding.frameNews' before everything
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
                          binding.formFirstNameUpdate.setText(it.firstName)
                          binding.formLastNameUpdate.setText(it.lastName)
                          binding.formEmailUpdate.setText(it.email)
                        }
                    }
                    else -> {
                        // TODO: Not state loaded
                    }
                }
            }
        }

        binding.btnUpdate.setOnClickListener {

            val userUpdated = UserRequest(
                id = userResponse.id,
                firstName = binding.formFirstNameUpdate.text.toString(),
                lastName = binding.formLastNameUpdate.text.toString(),
                email = binding.formEmailUpdate.text.toString(),
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
                        findNavController().navigate(R.id.action_userUpdateFragment_to_fragment_Client_Home)
                    } //navigation
                    else -> {
                        // TODO: Not state loaded
                    }
                }
            }
        }


        // Inflate the layout for this fragment
       return binding.root
    }
}