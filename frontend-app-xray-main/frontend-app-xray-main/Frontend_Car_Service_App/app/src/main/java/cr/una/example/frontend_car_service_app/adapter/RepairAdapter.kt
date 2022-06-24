package cr.una.example.frontend_car_service_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.databinding.RepairItemBinding
import cr.una.example.frontend_car_service_app.model.RepairResponse

class RepairAdapter : RecyclerView.Adapter<RepairAdapter.MainViewHolder>(), Filterable { //NUEVO


    private var repairList = mutableListOf<RepairResponse>()
    var repairFilterList = mutableListOf<RepairResponse>()


    fun setrepairList(repairResponseList: List<RepairResponse>) {
        this.repairList.clear()
        this.repairList.addAll(repairResponseList.toMutableList())
        this.repairFilterList.addAll(repairList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RepairItemBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val repair = repairFilterList[position]
        holder.binding.RepairVehicleSerialNumber.text = repair.vehicle?.serial_num.toString()
        holder.binding.RepairStatus.text = repair.status?.description.toString()
        holder.binding.RepairClient.text = repair.userList?.get(0)?.firstName.toString() + " " + repair.userList?.get(0)?.lastName.toString()

        holder.itemView.setOnClickListener() {
            val bundle = bundleOf(repair_ID to repairFilterList[position].id.toString())

                holder.itemView.findNavController().navigate(
                    R.id.action_repairMainFragment_to_repairDetailFragment, bundle
                )
        }

    }

    // NUEVO
    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (!charSearch.isEmpty()) {
                    val resultList = mutableListOf<RepairResponse>()
                    for (row in repairList) {
                        if (
                            row.vehicle?.serial_num.toString().lowercase().contains(charSearch.lowercase()) ||
                            row.status?.description.toString().lowercase().contains(charSearch.lowercase()) ||
                            row.userList?.get(0)?.firstName.toString().lowercase().contains(charSearch.lowercase()) ||
                            row.userList?.get(0)?.lastName.toString().lowercase().contains(charSearch.lowercase())
                            )
                        {
                            resultList.add(row)
                        }
                    }
                    repairFilterList= resultList
                }else{
                    repairFilterList = repairList
                }
                val filterResults = FilterResults()
                filterResults.values = repairFilterList
                return filterResults
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                repairFilterList = results?.values as MutableList<RepairResponse>
                notifyDataSetChanged()
            }

        }
    }
    //

    override fun getItemCount(): Int {
        return repairFilterList.size
    }

    companion object {
        const val repair_ID = "repair_id"
    }
    class MainViewHolder(
        val binding: RepairItemBinding
    ) : RecyclerView.ViewHolder(binding.root)

}