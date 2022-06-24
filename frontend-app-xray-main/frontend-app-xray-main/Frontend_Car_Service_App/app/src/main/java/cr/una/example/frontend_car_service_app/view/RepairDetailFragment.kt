package cr.una.example.frontend_car_service_app.view

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.adapter.RepairAdapter
import cr.una.example.frontend_car_service_app.databinding.FragmentRepairDetailBinding
import cr.una.example.frontend_car_service_app.model.RepairRequest
import cr.una.example.frontend_car_service_app.model.RepairResponse
import cr.una.example.frontend_car_service_app.model.StatusDetails
import cr.una.example.frontend_car_service_app.viewmodel.*


class RepairDetailFragment : Fragment() {
    // Definition of the binding variable
    private var _binding: FragmentRepairDetailBinding? = null
    private val binding get() = _binding!!

    // Late init var
    private lateinit var status: List<StatusDetails>
    private lateinit var repairResponse: RepairResponse
    private lateinit var statusSelected : StatusDetails
    private lateinit var repairId: String
    private lateinit var spinnerAdapter : ArrayAdapter<StatusDetails>

    // Shared view model
    private val repairViewModel: RepairViewModel by activityViewModels()
    private val statusViewModel: StatusViewModel by activityViewModels() {
        StatusViewModelFactory()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRepairDetailBinding.inflate(inflater, container, false)

        repairId = arguments?.getString(RepairAdapter.repair_ID) ?: "0"
       // repairViewModel.getRepair(repairId.toLong())


        // Observer method to bind data of task into text views
        repairViewModel.state.observe(viewLifecycleOwner) { state ->
            // this lets us avoid repeating 'binding.frameNews' before everything
            with(binding.root) {
                when (state) {
                    // just checking equality because Loading is a -singleton object instance-
                    StateRepair.Loading -> {
                        // TODO: If you need do something in loading
                    }
                    // Error and Success are both -classes- so we need to check their type with 'is'
                    is StateRepair.Error -> {
                        // TODO: If you need do something in error
                    }
                    is StateRepair.Success -> {
                        state.repair?.let {
                            repairResponse = it
                            binding.ClientName.text = it.userList?.get(0)?.firstName.toString() + " " + it.userList?.get(0)?.lastName.toString()
                            if(it.userList!!.size > 1) {
                                binding.mecanicNam.text = it.userList?.get(1)?.firstName.toString()
                            }
                            binding.carName.text = it.vehicle!!.serial_num.toString()

                            var s : String =""
                            for(item in it.serviceList!!){
                                s+=item.description+"\n"
                            }
                            if(s!="") binding.servicesList.setText(s)
                            if (it.status != null && ::spinnerAdapter.isInitialized) {
                                val spinnerPosition: Int = spinnerAdapter.getPosition(it.status)
                                binding.spinnerStatus.setSelection(spinnerPosition)
                            }

                        }
                    }
                    else -> {
                        // TODO: Not state loaded
                    }
                }
            }
        }

        binding.buttonDeleteReppair.setOnClickListener {
            val dialogBuilder = AlertDialog.Builder(requireActivity())
            dialogBuilder.setMessage("Are you sure?")
                // if the dialog is cancelable
                .setCancelable(true)
                .setPositiveButton("YES") { dialog, _ ->
                    repairViewModel.deleteRepairById(repairId.toLong())

                    findNavController().navigate(R.id.repairMainFragment)

                    dialog.dismiss()

                }
                .setNegativeButton("NO") { dialog, _ ->
                    dialog.dismiss()

                }
            val alert = dialogBuilder.create()
            alert.setTitle("Delete Repair")
            alert.show()
        }

        // Observer method to bind data
        statusViewModel.statusList.observe(viewLifecycleOwner) {
            status = it

            // access the spinner
            spinnerAdapter = ArrayAdapter<StatusDetails>(
                activity?.applicationContext!!,
                android.R.layout.simple_spinner_item,
                status
            )

            binding.spinnerStatus.adapter = spinnerAdapter

            binding.spinnerStatus.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?, position: Int, id: Long
                ) {
                    if (parent != null) {
                        if (parent.selectedItem != null) {
                            statusSelected = parent.selectedItem as StatusDetails
                        }
                    }

                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        binding.btnUpdate.setOnClickListener {

            val repairUpdated = RepairRequest(
                id = repairResponse.id,
                status = statusSelected
            )
            repairViewModel.updateRepair(repairUpdated)
            repairViewModel.state.observe(viewLifecycleOwner) { state ->
                when (state) {
                    // just checking equality because Loading is a -singleton object instance-
                    StateRepair.Loading -> {
                        // TODO: If you need do something in loading
                    }
                    // Error and Success are both -classes- so we need to check their type with 'is'
                    is StateRepair.Error -> {
                        // TODO: If you need do something in error
                    }
                    is StateRepair.Success -> {
                        findNavController().navigate(R.id.action_repairDetailFragment_to_repairMainFragment)
                    }
                    else -> {
                        // TODO: Not state loaded
                    }
                }
            }
        }







        statusViewModel.findAllStatus()
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        repairViewModel.getRepair(repairId.toLong())
    }
}
