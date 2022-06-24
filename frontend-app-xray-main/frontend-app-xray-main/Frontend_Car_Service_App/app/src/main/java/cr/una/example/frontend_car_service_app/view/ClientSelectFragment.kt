package cr.una.example.frontend_car_service_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import cr.una.example.frontend_car_service_app.adapter.ClientSelectAdapter
import cr.una.example.frontend_car_service_app.databinding.FragmentClientSelectBinding
import cr.una.example.frontend_car_service_app.viewmodel.StateUser
import cr.una.example.frontend_car_service_app.viewmodel.UserViewModel
import cr.una.example.frontend_car_service_app.viewmodel.UserViewModelFactory


class ClientSelectFragment : Fragment() {


    private var _binding: FragmentClientSelectBinding? = null
    private val binding get() = _binding!!


    private val userViewModel: UserViewModel by activityViewModels{
        UserViewModelFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val adapter = ClientSelectAdapter()
        _binding = FragmentClientSelectBinding.inflate(inflater, container, false)
        binding.rvClientListSelect.adapter = adapter
        binding.rvClientListSelect.layoutManager = LinearLayoutManager(activity)
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
        return binding.root
    }


}