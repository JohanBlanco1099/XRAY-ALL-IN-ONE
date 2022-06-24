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
import cr.una.example.frontend_car_service_app.adapter.VehicleAdapter.Companion.VEHICLE_ID
import cr.una.example.frontend_car_service_app.databinding.FragmentVehicleDetailsBinding
import cr.una.example.frontend_car_service_app.viewmodel.StateVehicle
import cr.una.example.frontend_car_service_app.viewmodel.VehicleViewModel

class VehicleDetailsFragment : Fragment() {

    // Definition of the binding variable
    private var _binding: FragmentVehicleDetailsBinding? = null
    private val binding get() = _binding!!

    // Shared view model
    private val vehicleViewModel: VehicleViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentVehicleDetailsBinding.inflate(inflater, container, false)

        val vehicleId: String = arguments?.getString(VEHICLE_ID) ?: "0"

        // Observer method to bind data of task into text views
        vehicleViewModel.state.observe(viewLifecycleOwner) { state ->
            // this lets us avoid repeating 'binding.frameNews' before everything
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
                            binding.txtVehicleVIN.text = it.vin_num.toString()
                            binding.txtVehicleSerialNumber.text = it.serial_num.toString()
                            binding.txtVehicleBrand.text = it.brand
                            binding.txtVehicleCarType.text = it.car_type
                            binding.txtVehicleEngineType.text = it.engine_type
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
                    vehicleViewModel.deleteVehicleById(vehicleId.toLong())

                    findNavController().navigate(R.id.vehicleMainFragment)

                    dialog.dismiss()

                }
                .setNegativeButton("NO") { dialog, _ ->
                    dialog.dismiss()

                }
            val alert = dialogBuilder.create()
            alert.setTitle("Delete Vehicle")
            alert.show()
        }

        binding.btnUpdate.setOnClickListener {
            val bundle = bundleOf(VEHICLE_ID to vehicleId)

            findNavController().navigate(R.id.action_vehicleDetailsFragment_to_vehicleUpdateFragment, bundle)
        }

        vehicleViewModel.getVehicle(vehicleId.toLong())
        // Inflate the layout for this fragment
        return binding.root

    }
}