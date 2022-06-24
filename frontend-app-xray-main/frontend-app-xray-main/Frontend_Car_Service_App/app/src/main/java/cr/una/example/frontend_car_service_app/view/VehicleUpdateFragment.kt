package cr.una.example.frontend_car_service_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.adapter.VehicleAdapter
import cr.una.example.frontend_car_service_app.databinding.FragmentVehicleUpdateBinding
import cr.una.example.frontend_car_service_app.model.VehicleRequest
import cr.una.example.frontend_car_service_app.model.VehicleResponse
import cr.una.example.frontend_car_service_app.viewmodel.StateVehicle
import cr.una.example.frontend_car_service_app.viewmodel.VehicleViewModel

class VehicleUpdateFragment : Fragment() {

    // Definition of the binding variable
    private var _binding: FragmentVehicleUpdateBinding? = null
    private val binding get() = _binding!!

    // Late init var
    private lateinit var vehicleResponse: VehicleResponse
    private lateinit var vehicleId: String


    // Shared view model
    private val vehicleViewModel: VehicleViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        _binding = FragmentVehicleUpdateBinding.inflate(inflater, container, false)
        vehicleId = arguments?.getString(VehicleAdapter.VEHICLE_ID) ?: "0"

        // Observer method to bind data of task into text views
        vehicleViewModel.state.observe(viewLifecycleOwner) { state ->
            with(binding.root) {
                when (state) {
                    // just checking equality because Loading is a -singleton object instance-
                    StateVehicle.Loading -> {
                        // TODO: If you need do something in loading
                    }
                    // Error and Success are both -classes- so we need to check their type with 'is'
                    is StateVehicle.Error -> {
                        // TODO: If you need do something in error
                    }
                    is StateVehicle.Success -> {
                        state.vehicle?.let {
                            vehicleResponse = it
                            binding.formVinNumberUpdate.setText(it.vin_num.toString())
                            binding.formBrandUpdate.setText(it.brand)
                            binding.formSeriesUpdate.setText(it.serial_num.toString())
                            binding.formTypeUpdate.setText(it.car_type)
                            binding.formEngineUpdate.setText(it.engine_type)
                        }

                    }
                    else -> {
                        // TODO: Not state loaded
                    }
                }
            }
        }

        binding.btnUpdate.setOnClickListener {

            val vehicleUpdated = VehicleRequest(
                id = vehicleResponse.id,
                vin_num =  Integer.parseInt(binding.formVinNumberUpdate.text.toString()) ,
                serial_num = Integer.parseInt(binding.formSeriesUpdate.text.toString()),
                brand = binding.formBrandUpdate.text.toString(),
                car_type = binding.formTypeUpdate.text.toString(),
                engine_type = binding.formEngineUpdate.text.toString(),
            )

            vehicleViewModel.updateVehicle(vehicleUpdated)
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
                    is StateVehicle.Success -> {
                        findNavController().navigate(R.id.action_vehicleUpdateFragment_to_vehicleMainFragment)
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