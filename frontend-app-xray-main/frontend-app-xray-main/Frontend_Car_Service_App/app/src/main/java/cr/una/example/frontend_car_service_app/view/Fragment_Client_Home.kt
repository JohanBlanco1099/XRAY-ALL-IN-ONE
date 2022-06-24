package cr.una.example.frontend_car_service_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation

import androidx.recyclerview.widget.LinearLayoutManager
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.databinding.FragmentClientHomeBinding
import cr.una.example.frontend_car_service_app.adapter.UserAdapter
import cr.una.example.frontend_car_service_app.viewmodel.*

//NUEVO
import androidx.appcompat.app.AppCompatActivity

class Fragment_Client_Home : Fragment() {
    // Definition of the binding variable
    private var _binding: FragmentClientHomeBinding? = null
    private val binding get() = _binding!!


    private val userViewModel: UserViewModel by activityViewModels{
        UserViewModelFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val adapter = UserAdapter()
        _binding = FragmentClientHomeBinding.inflate(inflater, container, false)
        binding.rvClientList.adapter = adapter
        binding.rvClientList.layoutManager = LinearLayoutManager(activity)
        userViewModel.findAllUser()
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
                is StateUser.SuccessList -> {

                    state.userList?.let { adapter.setUserList(it) }
                }
                else -> {
                    // TODO: Not state loaded
                }
            }
        }

        // NUEVO
        binding.SearchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return false
            }

        })
        //
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentClientHomeBinding.bind(view)
        binding.buttonMainAddClient.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragment_Client_Home_to_fragment_client)
        }
    }



}


