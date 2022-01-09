package com.example.instagram_pro

import Adapter.AdapterMyHistory
import Adapter.Adapteruserphoto
import Models.UserPhoto
import Models.User_account
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_account_.*
import kotlinx.android.synthetic.main.fragment_account_.view.*

class Account_Fragment : Fragment() {

    lateinit var root1:View
    lateinit var adapterMyHistory : AdapterMyHistory
    lateinit var userlist : ArrayList<User_account>
    lateinit var adapteruserphoto : Adapteruserphoto
    lateinit var userphotolist : ArrayList<UserPhoto>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        root1 = inflater.inflate(R.layout.fragment_account_, container, false)

        userlist = ArrayList()
        userlist.add(User_account(R.drawable.add1,"New"))
        userlist.add(User_account(R.drawable.pic1,"Friends"))
        userlist.add(User_account(R.drawable.pic2,"Sport"))
        userlist.add(User_account(R.drawable.pic3,"Movie"))
        userlist.add(User_account(R.drawable.pic4,"Street"))
        userlist.add(User_account(R.drawable.pic5,"Action"))
        userlist.add(User_account(R.drawable.pic6,"Foods"))
        userlist.add(User_account(R.drawable.pic7,"Little"))
        userlist.add(User_account(R.drawable.pic8,"Show"))
        userlist.add(User_account(R.drawable.pic9,"Cars"))
        userlist.add(User_account(R.drawable.pic10,"Insta"))

        adapterMyHistory = AdapterMyHistory(userlist)
        root1.account_history_adapter.adapter = adapterMyHistory

        root1.image_with_people.setOnClickListener {
            root1.line_account1.visibility = View.GONE
            root1.line_account2.visibility = View.VISIBLE
        }
        root1.image_account.setOnClickListener {
            root1.line_account2.visibility = View.GONE
            root1.line_account1.visibility = View.VISIBLE
        }

        userphotolist = ArrayList()
        userphotolist.add(UserPhoto(R.drawable.tom))
        userphotolist.add(UserPhoto(R.drawable.pic15))
        userphotolist.add(UserPhoto(R.drawable.img1))
        userphotolist.add(UserPhoto(R.drawable.pic14))
        userphotolist.add(UserPhoto(R.drawable.pic13))
        userphotolist.add(UserPhoto(R.drawable.img7))
        userphotolist.add(UserPhoto(R.drawable.pic12))
        userphotolist.add(UserPhoto(R.drawable.img6))
        userphotolist.add(UserPhoto(R.drawable.pic11))
        userphotolist.add(UserPhoto(R.drawable.pic10))
        userphotolist.add(UserPhoto(R.drawable.img5))
        userphotolist.add(UserPhoto(R.drawable.pic9))
        userphotolist.add(UserPhoto(R.drawable.pic8))
        userphotolist.add(UserPhoto(R.drawable.img4))
        userphotolist.add(UserPhoto(R.drawable.pic7))
        userphotolist.add(UserPhoto(R.drawable.pic5))
        userphotolist.add(UserPhoto(R.drawable.img2))
        userphotolist.add(UserPhoto(R.drawable.pic4))
        userphotolist.add(UserPhoto(R.drawable.pic3))
        userphotolist.add(UserPhoto(R.drawable.pic2))
        userphotolist.add(UserPhoto(R.drawable.pic1))
        userphotolist.add(UserPhoto(R.drawable.img3))
        userphotolist.add(UserPhoto(R.drawable.pic6))

        adapteruserphoto = Adapteruserphoto(userphotolist)
        root1.user_photo_recycle.adapter = adapteruserphoto


        return root1
    }

    companion object {
        @JvmStatic
        fun newInstance(){}
    }
}