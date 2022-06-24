package cr.una.example.frontend_car_service_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.adapter.VehicleAdapter
import cr.una.example.frontend_car_service_app.databinding.FragmentVehicleMainBinding
import cr.una.example.frontend_car_service_app.viewmodel.StateVehicle
import cr.una.example.frontend_car_service_app.viewmodel.VehicleViewModel
import cr.una.example.frontend_car_service_app.viewmodel.VehicleViewModelFactory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class VehicleMainFragment : Fragment() {

    // Definition of the binding variable
    private var _binding: FragmentVehicleMainBinding? = null
    private val binding get() = _binding!!


    private val vehicleViewModel: VehicleViewModel by activityViewModels{
        VehicleViewModelFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val adapter = VehicleAdapter()
        _binding = FragmentVehicleMainBinding.inflate(inflater, container, false)
        binding.rvVehicleList.adapter = adapter
        binding.rvVehicleList.layoutManager = LinearLayoutManager(activity)
        vehicleViewModel.findAllVehicle()
        vehicleViewModel.state.observe(viewLifecycleOwner) { state ->
            when (state) {
                // just checking equality because Loading is a -singleton object instance-
                StateVehicle.Loading -> {
                    // TODO: If you need do something in loading
                }
                // Error and Success are both -classes- so we need to check their type with 'is'
                is StateVehicle.Error -> {
                    // TODO: If you need do something in error
                }
                is StateVehicle.SuccessList -> {
                    state.vehicleList?.let { adapter.setVehicleList(it) }
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

        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentVehicleMainBinding.bind(view)
        binding.buttonMainAddVehicle.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_vehicleMainFragment_to_vehicleAddFragment)
        }
    }
}


