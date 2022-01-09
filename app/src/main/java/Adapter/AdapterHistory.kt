package Adapter

import Models.User
import Models.User_account
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram_pro.R
import kotlinx.android.synthetic.main.account_history_rv.view.*
import kotlinx.android.synthetic.main.my_history_rv.view.*

class AdapterMyHistory (val userList:List<User_account>) : RecyclerView.Adapter<AdapterMyHistory.Vh>() {

    inner class Vh(var itemRV: View) : RecyclerView.ViewHolder(itemRV){
        fun onBind(user: User_account){
            user.image?.let { itemRV.this_image_history.setImageResource(it) }
            itemRV.this_txt_history.text = user.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.account_history_rv,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount(): Int = userList.size
}