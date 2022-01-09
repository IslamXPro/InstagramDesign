package com.example.instagram_pro

import Adapter.MainmenuAdapter
import Adapter.MyAdapter
import Models.MainUser
import Models.User
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main_menu.*
import kotlinx.android.synthetic.main.fragment_main_menu.view.*

class Main_menu : Fragment() {

    lateinit var root:View
    lateinit var userList : ArrayList<User>
    lateinit var myAdapter: MyAdapter
    lateinit var userlist1 : ArrayList<MainUser>
    lateinit var mainmenuAdapter: MainmenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        root = inflater.inflate(R.layout.fragment_main_menu, container, false)
        userList = ArrayList()
        userList.add(User(R.drawable.pic1,"Your story"))
        userList.add(User(R.drawable.pic2,"karenne"))
        userList.add(User(R.drawable.pic3,"zackjohn"))
        userList.add(User(R.drawable.pic4,"kieron_d"))
        userList.add(User(R.drawable.pic5,"islamxrpo"))
        userList.add(User(R.drawable.pic6,"craig_for"))
        userList.add(User(R.drawable.pic7,"kenzoere"))
        userList.add(User(R.drawable.pic9,"eloears"))
        userList.add(User(R.drawable.pic10,"therow"))
        userList.add(User(R.drawable.pic11,"doyoutravel"))
        userList.add(User(R.drawable.pic12,"satiregram"))
        userList.add(User(R.drawable.pic13,"car_lux"))
        userList.add(User(R.drawable.pic14,"xeonix"))
        userList.add(User(R.drawable.pic15,"workparty"))
        userList.add(User(R.drawable.pic8,"english_edu"))
        myAdapter = MyAdapter(userList)
        root.main_hystory.adapter = myAdapter

        userlist1 = ArrayList()
        userlist1.add(MainUser(R.drawable.tom,"royalmotors","Italy,Rim",R.drawable.tom,R.drawable.tom))
        userlist1.add(MainUser(R.drawable.pic15,"karenne","Russia,Moscow",R.drawable.pic15,R.drawable.pic15))
        userlist1.add(MainUser(R.drawable.pic14,"zackjohn","Rio-Dajanere",R.drawable.pic14,R.drawable.pic14))
        userlist1.add(MainUser(R.drawable.pic13,"therow","Tashkent,Hilton",R.drawable.pic13,R.drawable.pic13))
        userlist1.add(MainUser(R.drawable.pic12,"codial_uz","Margilan,Center",R.drawable.pic12,R.drawable.pic12))
        userlist1.add(MainUser(R.drawable.pic11,"xeonix","Columbia",R.drawable.pic11,R.drawable.pic11))
        userlist1.add(MainUser(R.drawable.pic10,"eleoras","Michigan",R.drawable.pic10,R.drawable.pic10))
        userlist1.add(MainUser(R.drawable.pic9,"asder_123","Huston",R.drawable.pic9,R.drawable.pic9))
        userlist1.add(MainUser(R.drawable.pic8,"epic_pro","North Carolina",R.drawable.pic8,R.drawable.pic8))
        userlist1.add(MainUser(R.drawable.pic7,"a_nissano","Epic city",R.drawable.pic7,R.drawable.pic7))
        userlist1.add(MainUser(R.drawable.pic6,"yamamato","New York, New York",R.drawable.pic6,R.drawable.pic6))
        userlist1.add(MainUser(R.drawable.pic5,"thispage","City Center",R.drawable.pic5,R.drawable.pic5))
        mainmenuAdapter = MainmenuAdapter(userlist1)
        root.recycle_lenta_main.adapter = mainmenuAdapter
        return root
    }

    companion object {
        @JvmStatic
        fun newInstance(){}
    }
}