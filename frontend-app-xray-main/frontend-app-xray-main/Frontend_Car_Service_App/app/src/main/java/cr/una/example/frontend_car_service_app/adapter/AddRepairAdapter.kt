package cr.una.example.frontend_car_service_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import cr.una.example.frontend_car_service_app.R
import cr.una.example.frontend_car_service_app.databinding.ClientItemBinding
import cr.una.example.frontend_car_service_app.model.UserResponse

class AddRepairAdapter : RecyclerView.Adapter<AddRepairAdapter.MainViewHolder>(){

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
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddRepairAdapter.MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ClientItemBinding.inflate(inflater, parent, false)
        return AddRepairAdapter.MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AddRepairAdapter.MainViewHolder, position: Int) {
        val user = userList[position]
        holder.binding.clientFirstName.text = user.firstName.toString()
        holder.binding.clientLastName.text = user.lastName.toString()
        holder.binding.clientEmail.text = user.email.toString()

        holder.itemView.setOnClickListener() {
            val bundle = bundleOf(USER_ID to userList[position].id.toString())

            holder.itemView.findNavController().navigate(
                R.id.action_clientSelectFragment_to_repairAddFragment,bundle
            )
        }

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    companion object {
        const val USER_ID = "user_id"
    }
    class MainViewHolder(
        val binding: ClientItemBinding
    ) : RecyclerView.ViewHolder(binding.root)

}
