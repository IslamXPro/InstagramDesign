package Adapter

import Models.User
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram_pro.R
import kotlinx.android.synthetic.main.my_history_rv.view.*

class MyAdapter (val userList:List<User>) : RecyclerView.Adapter<MyAdapter.Vh>() {

    inner class Vh(var itemRV: View) : RecyclerView.ViewHolder(itemRV){
        fun onBind(user:User){
            itemRV.txt_myhistory.text = user.name
            itemRV.image_myhistory.setImageResource(user.image!!)
        }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.my_history_rv,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount(): Int = userList.size
}