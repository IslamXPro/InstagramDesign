package Adapter

import Models.MainUser
import Models.User
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram_pro.R
import kotlinx.android.synthetic.main.main_lenta_rv.view.*
import kotlinx.android.synthetic.main.my_history_rv.view.*

class MainmenuAdapter (val userList:List<MainUser>) : RecyclerView.Adapter<MainmenuAdapter.Vh>() {

    inner class Vh(var itemRV: View) : RecyclerView.ViewHolder(itemRV){
        @SuppressLint("ResourceAsColor")
        fun onBind(user: MainUser){
            user.thisImage?.let { itemRV.this_image.setImageResource(it) }
            itemRV.this_name.text = user.thisName
            itemRV.this_name_place.text = user.thisPlace
            user.thisMainImage?.let { itemRV.this_image_main.setImageResource(it) }
            user.thisImage1?.let { itemRV.this_image1.setImageResource(it) }
            itemRV.this_bookmark.setOnClickListener {
                itemRV.this_bookmark.setBackgroundColor(R.color.black)
            }
            itemRV.this_like.setOnClickListener {
                itemRV.like_red.visibility = View.VISIBLE
            }


            itemRV.this_like.setOnLongClickListener {
                itemRV.like_red.visibility = View.GONE
                true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.main_lenta_rv,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount(): Int = userList.size
}