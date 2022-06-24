package cr.una.example.frontend_car_service_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cr.una.example.frontend_car_service_app.databinding.StatusItemBinding
import cr.una.example.frontend_car_service_app.model.StatusDetails


class StatusAdapter: RecyclerView.Adapter<StatusAdapter.MainViewHolder>() {
    private var statusList = mutableListOf<StatusDetails>()

    fun setStatusList(statusRequestList: List<StatusDetails>) {
        this.statusList.clear()
        this.statusList.addAll(statusRequestList.toMutableList())
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = StatusItemBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        //val vehicle = statusList[position]
        //holder.binding.vin.text = vehicle.vin_num.toString()
        //holder.binding.serial.text = vehicle.serial_num.toString()
        //holder.binding.brand.text = vehicle.brand
        //holder.binding.type.text = vehicle.car_type.toString()

       // holder.itemView.setOnClickListener() {
            //val bundle = bundleOf(VEHICLE_ID to vehicleList[position].id.toString())

            //holder.itemView.findNavController().navigate(
               // R.id.action_vehicleMainFragment_to_vehicleDetailsFragment, bundle
           // )
       // }

    }

    override fun getItemCount(): Int {
        return statusList.size
    }

    companion object {
        const val STATUS_ID = "status_id"
    }
    class MainViewHolder(
        val binding: StatusItemBinding
    ) : RecyclerView.ViewHolder(binding.root)
}