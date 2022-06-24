package cr.una.example.frontend_car_service_app.view

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.adapter.UserAdapter
import cr.una.example.frontend_car_service_app.databinding.FragmentUserDetailsBinding
import cr.una.example.frontend_car_service_app.viewmodel.StateUser
import cr.una.example.frontend_car_service_app.viewmodel.UserViewModel

class UserDetailsFragment : Fragment() {

    // Definition of the binding variable
    private var _binding: FragmentUserDetailsBinding? = null
    private val binding get() = _binding!!

    // Shared view model
    private val userViewModel: UserViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentUserDetailsBinding.inflate(inflater, container, false)

        val userId: String = arguments?.getString(UserAdapter.USER_ID) ?: "0"

        // Observer method to bind data of task into text views
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
                            binding.txtUserFirstName.text = it.firstName
                            binding.txtUserLastName.text = it.lastName
                            binding.txtUserEmail.text = it.email
                        }
                    }
                    else -> {
                        // TODO: Not state loaded
                    }
                }
            }
        }

        binding.btnDelete.setOnClickListener {
            val dialogBuilder = AlertDialog.Builder(requireActivity())
            dialogBuilder.setMessage("Are you sure?")
                // if the dialog is cancelable
                .setCancelable(true)
                .setPositiveButton("YES") { dialog, _ ->
                    userViewModel.deleteUserById(userId.toLong())

                    findNavController().navigate(R.id.fragment_Client_Home)

                    dialog.dismiss()

                }
                .setNegativeButton("NO") { dialog, _ ->
                    dialog.dismiss()

                }
            val alert = dialogBuilder.create()
            alert.setTitle("Delete Client")
            alert.show()
        }

        // FOR UPDATE CREATE A NEW FRAGMENT
        binding.btnUpdate.setOnClickListener {
            val bundle = bundleOf(UserAdapter.USER_ID to userId)

            findNavController().navigate(R.id.action_userDetailsFragment_to_userUpdateFragment, bundle)
        }
        userViewModel.getUser(userId.toLong())
        // Inflate the layout for this fragment
        return binding.root
    }
}