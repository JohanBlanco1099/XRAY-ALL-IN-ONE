package cr.una.example.frontend_car_service_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.databinding.FragmentClientBinding
import cr.una.example.frontend_car_service_app.model.RoleDetails
import cr.una.example.frontend_car_service_app.model.UserRequest
import cr.una.example.frontend_car_service_app.viewmodel.UserViewModel

class fragment_client : Fragment() {
    // TODO: Rename and change types of parameters
    // Definition of the binding variable
    private var _binding: FragmentClientBinding? = null
    private val binding get() = _binding!!

    // View model
    private val userViewModel: UserViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentClientBinding.inflate(inflater, container, false)

        binding.btnRegisterClient.setOnClickListener {

            userViewModel.createUser(
                UserRequest(
                   firstName =  binding.ClientFirstName.text.toString() ,
                    lastName = binding.ClientLastName.text.toString(),
                    email = binding.Email.text.toString(),
                    roleList = List<RoleDetails>(1){RoleDetails(3,null,null)}

                    )
            )

            findNavController().navigate(R.id.action_fragment_client_to_fragment_Client_Home)
        }

        // Inflate the layout for this fragment
        return binding.root
    }
}