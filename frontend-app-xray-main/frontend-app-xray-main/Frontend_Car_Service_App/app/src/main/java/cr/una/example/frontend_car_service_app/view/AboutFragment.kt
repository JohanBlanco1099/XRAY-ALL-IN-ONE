package cr.una.example.frontend_car_service_app.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import cr.una.example.frontend_car_service_app.databinding.FragmentAboutBinding
import cr.una.example.frontend_car_service_app.viewmodel.LoginViewModel
import cr.una.example.frontend_car_service_app.viewmodel.LoginViewModelFactory

class AboutFragment : Fragment() {

    private var _binding : FragmentAboutBinding ?= null
    private val binding get() = _binding!!
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)

        // LoginViewModelFactory
        loginViewModel =
            ViewModelProvider(this, LoginViewModelFactory())[LoginViewModel::class.java]

        binding.btnLogout.setOnClickListener(){
            loginViewModel.logout()
            activity?.finish()
        }


        return binding.root
    }

}