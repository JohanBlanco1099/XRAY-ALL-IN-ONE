package cr.una.example.frontend_car_service_app.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.adapter.UserAdapter
import cr.una.example.frontend_car_service_app.adapter.VehicleAdapter
import cr.una.example.frontend_car_service_app.adapter.ServiceSelectAdapter
import cr.una.example.frontend_car_service_app.databinding.FragmentRepairAddBinding
import cr.una.example.frontend_car_service_app.model.*
import cr.una.example.frontend_car_service_app.utils.MyApplication
import cr.una.example.frontend_car_service_app.viewmodel.*


class RepairAddFragment : Fragment() {

    // Definition of the binding variable
    private var _binding: FragmentRepairAddBinding? = null
    private val binding get() = _binding!!

    private val userViewModel: UserViewModel by activityViewModels{
        UserViewModelFactory()
    }

    private val vehicleViewModel: VehicleViewModel by activityViewModels{
        VehicleViewModelFactory()
    }

    private val serviceViewModel: ServiceViewModel by activityViewModels{
        ServiceViewModelFactory()
    }

    // View model
    private val repairViewModel: RepairViewModel by activityViewModels()


    var selected = mutableListOf<ServiceResponse>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRepairAddBinding.inflate(inflater, container, false)

        val userId: String = arguments?.getString(UserAdapter.USER_ID) ?: "0"
        if(userId!="0") userViewModel.getUser(userId.toLong())

        val vehicleId: String = arguments?.getString(VehicleAdapter.VEHICLE_ID) ?: "0"
        if(vehicleId!="0") vehicleViewModel.getVehicle(vehicleId.toLong())

        var selectVoC = vehicleId!="0" || userId!="0"
        var services_id = arguments?.getStringArrayList(ServiceSelectAdapter.SERVICES_ID)?: mutableListOf<ServiceResponse>()
        selected = serviceViewModel.getSelectedServices()
        if (services_id.size != 0){
            serviceViewModel.setSelectedServices(services_id)
            selected = serviceViewModel.getSelectedServices()
        }


        var s : String =""
        for(item in selected){
            s+=item.description+"\n"
        }
        if(s!="") binding.result.setText(s)

        // Observer method to bind data of task into text views
        userViewModel.state.observe(viewLifecycleOwner) { state ->
            // this lets us avoid repeating 'binding.frameNews' before everything
            with(binding.root) {
                when (state) {
                    // just checking equality because Loading is a -singleton object instance-
                    StateUser.Loading -> {
                        // TODO: If you need do something in loading
                    }
                    // Error and Success are both -classes- so we need to check their type with 'is'
                    is StateUser.Error -> {
                        // TODO: If you need do something in error
                    }
                    is StateUser.Success -> {
                        state.user?.let {
                            binding.clientSelectInfo.text = it.firstName+" "+it.lastName
                        }
                    }
                    else -> {
                        // TODO: Not state loaded
                    }
                }
            }
        }
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
                            binding.vehicleSelectInfo.text = it.vin_num.toString()

                        }
                    }
                    else -> {
                        // TODO: Not state loaded
                    }
                }
            }
        }

        binding.btnCreateRepair.setOnClickListener {

            val vehicleSelected: VehicleResponse = VehicleResponse(0)
            val clientSelected: UserResponse = UserResponse(0)
            val mechanicSelected: UserResponse = UserResponse(0)
            vehicleViewModel.state.observe(viewLifecycleOwner) { state ->
                // this lets us avoid repeating 'binding.frameNews' before everything
                with(binding.root) {
                    when (state) {
                        is StateVehicle.Success -> {
                            state.vehicle?.let {
                                vehicleSelected.id= it.id
                            }
                        }
                        else -> {}
                    }
                }
            }
            userViewModel.state.observe(viewLifecycleOwner) { state ->
                // this lets us avoid repeating 'binding.frameNews' before everything
                with(binding.root) {
                    when (state) {
                        is StateUser.Success -> {
                            state.user?.let {
                                clientSelected.id= it.id
                            }
                        }
                        else -> {}
                    }
                }
            }
            var id = MyApplication.sessionManager?.fetchUserIdLogged()
            if (id != null) {
                mechanicSelected.id=id
            }

            val list: MutableList<UserResponse> = mutableListOf(clientSelected,mechanicSelected)



            repairViewModel.createRepair(
                RepairRequest(
                    vehicle =  vehicleSelected,
                    userList = list,
                    serviceList = serviceViewModel.getSelectedServices(),
                    status = StatusDetails(1)

                    )
            )
            findNavController().navigate(R.id.action_repairAddFragment_to_repairMainFragment)
        }




        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentRepairAddBinding.bind(view)
        binding.buttonPickClient.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_repairAddFragment_to_clientSelectFragment)
        }
        binding.buttonPickVehicle.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_repairAddFragment_to_vehicleSelectFragment)
        }
        binding.buttonPickServices.setOnClickListener{
            val bundle = bundleOf(ServiceSelectAdapter.SERVICES_ID to selected)
            Navigation.findNavController(view).navigate(R.id.action_repairAddFragment_to_selectServiceFragment,bundle)
        }
    }



}