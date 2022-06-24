package cr.una.example.frontend_car_service_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.adapter.ServiceSelectAdapter
import cr.una.example.frontend_car_service_app.databinding.FragmentSelectServiceBinding
import cr.una.example.frontend_car_service_app.model.ServiceResponse
import cr.una.example.frontend_car_service_app.viewmodel.*


class SelectServiceFragment : Fragment() {


    // Definition of the binding variable
    private var _binding: FragmentSelectServiceBinding? = null
    private val binding get() = _binding!!


    private val serviceViewModel: ServiceViewModel by activityViewModels{
        ServiceViewModelFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {





        val adapter = ServiceSelectAdapter()

        var last_selected_services = arguments?.getStringArrayList(ServiceSelectAdapter.SERVICES_ID)?: mutableListOf<ServiceResponse>()

        adapter.selectedServicesList = last_selected_services as MutableList<ServiceResponse>


        _binding = FragmentSelectServiceBinding.inflate(inflater, container, false)
        binding.rvServiceListSelect.adapter = adapter
        binding.rvServiceListSelect.layoutManager = LinearLayoutManager(activity)
        serviceViewModel.findAllServices()




        serviceViewModel.state.observe(viewLifecycleOwner) { state ->
            when (state) {
                // just checking equality because Loading is a -singleton object instance-
                StateService.Loading -> {
                    // TODO: If you need do something in loading
                }
                // Error and Success are both -classes- so we need to check their type with 'is'
                is StateService.Error -> {
                    // TODO: If you need do something in error
                }
                is StateService.SuccessList -> {
                    state.serviceList?.let { adapter.setserviceList(it) }
                }
                else -> {
                    // TODO: Not state loaded
                }
            }
        }


        binding.doneButton.setOnClickListener() {
            val bundle = bundleOf(ServiceSelectAdapter.SERVICES_ID to adapter.selectedServicesList)
            findNavController().navigate(R.id.action_selectServiceFragment_to_repairAddFragment, bundle)
        }




        return binding.root
    }

}