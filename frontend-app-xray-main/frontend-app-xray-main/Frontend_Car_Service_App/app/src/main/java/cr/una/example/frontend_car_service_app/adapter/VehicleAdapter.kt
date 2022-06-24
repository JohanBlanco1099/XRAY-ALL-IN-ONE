package cr.una.example.frontend_car_service_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.databinding.VehicleItemBinding
import cr.una.example.frontend_car_service_app.model.VehicleResponse

class VehicleAdapter : RecyclerView.Adapter<VehicleAdapter.MainViewHolder>(),
Filterable{

    var vehicleFilterList = mutableListOf<VehicleResponse>()
    private var vehicleList = mutableListOf<VehicleResponse>()

    fun setVehicleList(vehicleResponseList: List<VehicleResponse>) {
        this.vehicleList.clear()
        this.vehicleList.addAll(vehicleResponseList.toMutableList())
        this.vehicleFilterList.addAll(vehicleList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = VehicleItemBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val vehicle = vehicleFilterList[position]
        holder.binding.vin.text = vehicle.vin_num.toString()
        holder.binding.serial.text = vehicle.serial_num.toString()
        holder.binding.brand.text = vehicle.brand
        holder.binding.type.text = vehicle.car_type.toString()

        holder.itemView.setOnClickListener() {
            val bundle = bundleOf(VEHICLE_ID to vehicleFilterList[position].id.toString())

            holder.itemView.findNavController().navigate(
                R.id.action_vehicleMainFragment_to_vehicleDetailsFragment, bundle
            )
        }

    }

    // NUEVO
    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (!charSearch.isEmpty()) {
                    val resultList = mutableListOf<VehicleResponse>()
                    for (row in vehicleList) {
                        if (row.vin_num.toString().lowercase()?.contains(charSearch.lowercase()) == true ||
                            row.brand?.lowercase()?.contains(charSearch.lowercase()) == true  ||
                            row.car_type?.lowercase()?.contains(charSearch.lowercase()) == true ||
                            row.engine_type?.lowercase()?.contains(charSearch.lowercase()) == true)
                        {
                            resultList.add(row)
                        }
                    }
                    vehicleFilterList= resultList
                }else{
                    vehicleFilterList = vehicleList
                }
                val filterResults = FilterResults()
                filterResults.values = vehicleFilterList
                return filterResults
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                vehicleFilterList = results?.values as MutableList<VehicleResponse>
                notifyDataSetChanged()
            }

        }
    }
    //

    override fun getItemCount(): Int {
        return vehicleFilterList.size
    }

    companion object {
        const val VEHICLE_ID = "vehicle_id"
    }
    class MainViewHolder(
        val binding: VehicleItemBinding
    ) : RecyclerView.ViewHolder(binding.root)
}

