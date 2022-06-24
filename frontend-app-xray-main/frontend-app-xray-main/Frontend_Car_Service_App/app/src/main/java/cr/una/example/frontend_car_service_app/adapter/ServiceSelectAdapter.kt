package cr.una.example.frontend_car_service_app.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cr.una.example.frontend_car_service_app.databinding.ServiceItemBinding
import cr.una.example.frontend_car_service_app.model.ServiceResponse


class ServiceSelectAdapter : RecyclerView.Adapter<ServiceSelectAdapter.MainViewHolder>(){
    private var serviceList = mutableListOf<ServiceResponse>()
    private var selectedItemID: ServiceResponse = ServiceResponse(0,"")
    var selectedServicesList = mutableListOf<ServiceResponse>()


    fun setserviceList(serviceSelectResponseList: List<ServiceResponse>) {
        this.serviceList.clear()
        this.serviceList.addAll(serviceSelectResponseList.toMutableList())
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ServiceItemBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val service = serviceList[position]
        holder.binding.ServiceDescription.text = service.description

        if(service in selectedServicesList){
            holder.binding.checkBox.isChecked=true
        }
        holder.binding.checkBox.setOnClickListener() {
            selectedItemID = serviceList[position]
            if(this.selectedServicesList.indexOf(selectedItemID) < 0){
                this.selectedServicesList.add(selectedItemID)
            } else {
                if(this.selectedServicesList.size != 0){
                    selectedServicesList.remove(selectedItemID)
                }
            }
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return serviceList.size
    }

    companion object {
        const val SERVICES_ID = "services_id"
    }
    class MainViewHolder(
        val binding: ServiceItemBinding
    ) : RecyclerView.ViewHolder(binding.root)
}