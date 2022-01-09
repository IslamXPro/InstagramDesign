package Adapter

import Models.SearchUser
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.search_item.view.*
import java.util.*

class SearchAdapter(itemview: View) : RecyclerView.ViewHolder(itemview) {

    private val random = Random()

    fun bindView(searchUser: SearchUser){
        searchUser.image?.let { itemView.image_search.setImageResource(it) }
        itemView.image_search.layoutParams.height = getRandomIntRange(250,250)
        itemView.text_search_name.text = searchUser.name
        itemView.text_search_small.text = searchUser.smname
    }

    private fun getRandomIntRange(max:Int,min:Int):Int{
        return random.nextInt(max - min + min) + min
    }

}