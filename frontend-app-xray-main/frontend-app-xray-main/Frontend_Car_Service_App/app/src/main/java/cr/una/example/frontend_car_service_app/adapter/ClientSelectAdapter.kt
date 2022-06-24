package cr.una.example.frontend_car_service_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.databinding.ClientItemBinding
import cr.una.example.frontend_car_service_app.model.UserResponse

class ClientSelectAdapter : RecyclerView.Adapter<ClientSelectAdapter.MainViewHolder>(), Filterable {

    var userFilterList = mutableListOf<UserResponse>()
    private var userList = mutableListOf<UserResponse>()

    fun setUserList(userResponseList: List<UserResponse>) {
        this.userList.clear()
        var aux = 3
        var userResponseListClient = mutableListOf<UserResponse>()
        for (x in userResponseList){
            if(x.roleList?.find { it.id == aux.toLong()} != null){
                userResponseListClient.add(x)
            }
        }
        this.userList.addAll(userResponseListClient)
        this.userFilterList.addAll(userList) //NUEVO
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClientSelectAdapter.MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ClientItemBinding.inflate(inflater, parent, false)
        return ClientSelectAdapter.MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ClientSelectAdapter.MainViewHolder, position: Int) {
        val user = userFilterList[position]
        holder.binding.clientFirstName.text = user.firstName.toString()
        holder.binding.clientLastName.text = user.lastName.toString()
        holder.binding.clientEmail.text = user.email.toString()

        holder.itemView.setOnClickListener() {
            val bundle = bundleOf(USER_ID to userFilterList[position].id.toString())

            holder.itemView.findNavController().navigate(
                R.id.action_clientSelectFragment_to_repairAddFragment,bundle
            )
        }

    }
    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if (!charSearch.isEmpty()) {
                    val resultList = mutableListOf<UserResponse>()
                    for (row in userList) {
                        if (row.firstName?.lowercase()?.contains(charSearch.lowercase()) == true ||
                            row.lastName?.lowercase()?.contains(charSearch.lowercase()) == true  ||
                            row.email?.lowercase()?.contains(charSearch.lowercase()) == true)
                        {
                            resultList.add(row)
                        }
                    }
                    userFilterList= resultList
                }else{
                    userFilterList = userList
                }
                val filterResults = FilterResults()
                filterResults.values = userFilterList
                return filterResults
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                userFilterList = results?.values as MutableList<UserResponse>
                notifyDataSetChanged()
            }

        }
    }

    override fun getItemCount(): Int {
        return userFilterList.size
    }

    companion object {
        const val USER_ID = "user_id"
    }
    class MainViewHolder(
        val binding: ClientItemBinding
    ) : RecyclerView.ViewHolder(binding.root)

}
