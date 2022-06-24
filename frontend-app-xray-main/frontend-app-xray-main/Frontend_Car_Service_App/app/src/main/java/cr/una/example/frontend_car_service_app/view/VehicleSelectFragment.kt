package cr.una.example.frontend_car_service_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import cr.una.example.frontend_car_service_app.adapter.VehicleSelectAdapter
import cr.una.example.frontend_car_service_app.databinding.FragmentVehicleSelectBinding
import cr.una.example.frontend_car_service_app.viewmodel.StateVehicle
import cr.una.example.frontend_car_service_app.viewmodel.VehicleViewModel
import cr.una.example.frontend_car_service_app.viewmodel.VehicleViewModelFactory

class VehicleSelectFragment : Fragment() {


    // Definition of the binding variable
    private var _binding: FragmentVehicleSelectBinding? = null
    private val binding get() = _binding!!


    private val vehicleViewModel: VehicleViewModel by activityViewModels{
        VehicleViewModelFactory()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val adapter = VehicleSelectAdapter()
        _binding = FragmentVehicleSelectBinding.inflate(inflater, container, false)
        binding.rvVehicleListSelect.adapter = adapter
        binding.rvVehicleListSelect.layoutManager = LinearLayoutManager(activity)
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

        binding.SearchViewVehicleSelect.setOnQueryTextListener(object: SearchView.OnQueryTextListener,
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