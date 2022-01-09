package Adapter
import Models.UserPhoto
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram_pro.R
import kotlinx.android.synthetic.main.my_history_rv.view.*
import kotlinx.android.synthetic.main.user_photo_rv.view.*

class Adapteruserphoto (val userList:List<UserPhoto>) : RecyclerView.Adapter<Adapteruserphoto.Vh>() {

    inner class Vh(var itemRV: View) : RecyclerView.ViewHolder(itemRV){
        fun onBind(user: UserPhoto){
            user.userimage?.let { itemRV.image_user.setImageResource(it) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.user_photo_rv,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount(): Int = userList.size
}