package cr.una.example.frontend_car_service_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.databinding.FragmentVehicleAddBinding
import cr.una.example.frontend_car_service_app.model.VehicleRequest
import cr.una.example.frontend_car_service_app.viewmodel.VehicleViewModel


class VehicleAddFragment : Fragment() {

    // Definition of the binding variable
    private var _binding: FragmentVehicleAddBinding? = null
    private val binding get() = _binding!!

    // View model
    private val vehicleViewModel: VehicleViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentVehicleAddBinding.inflate(inflater, container, false)

        binding.btnCreate.setOnClickListener {

            vehicleViewModel.createVehicle(
                VehicleRequest(
                    vin_num =  Integer.parseInt(binding.formVinNumber.text.toString()) ,
                    serial_num = Integer.parseInt(binding.formSeries.text.toString()),
                    brand = binding.formBrand.text.toString(),
                    car_type = binding.formType.text.toString(),
                    engine_type = binding.formEngine.text.toString(),

                )
            )



            findNavController().navigate(R.id.action_vehicleAddFragment_to_vehicleMainFragment)
        }

        // Inflate the layout for this fragment
        return binding.root
    }

}
