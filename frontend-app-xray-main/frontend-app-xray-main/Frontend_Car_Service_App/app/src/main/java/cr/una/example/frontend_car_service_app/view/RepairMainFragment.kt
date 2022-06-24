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
import cr.una.example.frontend_car_service_app.adapter.RepairAdapter
import cr.una.example.frontend_car_service_app.databinding.FragmentRepairMainBinding
import cr.una.example.frontend_car_service_app.viewmodel.*

class RepairMainFragment : Fragment() {



    // Definition of the binding variable
    private var _binding: FragmentRepairMainBinding? = null
    private val binding get() = _binding!!

    private val repairViewModel: RepairViewModel by activityViewModels{
        RepairViewModelFactory()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val adapter = RepairAdapter()
        _binding = FragmentRepairMainBinding.inflate(inflater, container, false)
        binding.rvRepairList.adapter = adapter
        binding.rvRepairList.layoutManager = LinearLayoutManager(activity)
        repairViewModel.findAllRepair()
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
                is StateRepair.SuccessList -> {
                    state.repairList?.let { adapter.setrepairList(it) }
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
        _binding = FragmentRepairMainBinding.bind(view)
        binding.buttonMainAddRepair.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_repairMainFragment_to_repairAddFragment)
        }
    }

}