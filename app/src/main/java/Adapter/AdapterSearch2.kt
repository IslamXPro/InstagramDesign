package Adapter

import Models.SearchUser
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram_pro.R

class AdapterSearch2 : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var listSearch = listOf<SearchUser>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SearchAdapter(LayoutInflater.from(parent.context).inflate(R.layout.search_item,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as SearchAdapter).bindView(listSearch[position])
    }

    override fun getItemCount(): Int {
        return listSearch.size
    }
}