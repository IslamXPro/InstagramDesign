package com.example.instagram_pro

import Adapter.AdapterSearch2
import Adapter.SearchAdapter
import Models.SearchUser
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.android.synthetic.main.fragment_search.view.*


class SearchFragment : Fragment() {

    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_search, container, false)
        initView()
        return root
    }

    private fun initView() {
        root.recycle_search.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        val adapterSearch2 = AdapterSearch2()
        adapterSearch2.listSearch = generate()
        root.recycle_search.adapter = adapterSearch2
    }
    private fun generate() : List<SearchUser>{
        val listSearch = mutableListOf<SearchUser>()
        listSearch.add(SearchUser(R.drawable.pic1,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic2,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic3,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic4,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic5,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic6,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic7,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic8,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic9,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic10,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic11,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic12,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic13,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic14,"Tom hatson", "Maybe ahto "))
        listSearch.add(SearchUser(R.drawable.pic15,"Tom hatson", "Maybe ahto "))
        return listSearch
    }
}