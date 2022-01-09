package com.example.instagram_pro

import Adapter.MyAdapter
import Models.User
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val mainFragment = Main_menu()
        val fragmenManager = supportFragmentManager
        val transaction = fragmenManager.beginTransaction()
        transaction.replace(R.id.main_menu_fragment,mainFragment)
        transaction.commit()

        line1.setOnClickListener {
        val mainFragment = Main_menu()
        val fragmenManager = supportFragmentManager
        val transaction = fragmenManager.beginTransaction()
        transaction.replace(R.id.main_menu_fragment,mainFragment)
        transaction.commit()
        }

        line2.setOnClickListener{
            val mainFragment = SearchFragment()
            val fragmentManager = supportFragmentManager
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.main_menu_fragment,mainFragment)
            transaction.commit()
        }

        line5.setOnClickListener {
            val accountFragment = Account_Fragment()
            val fragmenManager = supportFragmentManager
            val transaction = fragmenManager.beginTransaction()
            transaction.replace(R.id.main_menu_fragment,accountFragment)
            transaction.commit()
        }

    }
}