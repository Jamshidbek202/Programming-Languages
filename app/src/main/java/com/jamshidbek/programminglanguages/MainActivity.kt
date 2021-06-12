package com.jamshidbek.programminglanguages

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.marginTop
import com.jamshidbek.programminglanguages.adapter.MyAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var myAdapter: MyAdapter
    lateinit var list: ArrayList<Model>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = ArrayList()

        for (i in 0..1){
            list.add(Model("Java", "https://image.flaticon.com/icons/png/512/226/226777.png", "Java is powering the innovation behind our digital world. Harness this potential with Java resources for student coders, hobbyists, developers, and IT leaders."))
            list.add(Model("Python", "https://image.flaticon.com/icons/png/512/1387/1387537.png", "The core of extensible programming is defining functions. Python allows mandatory and optional arguments, keyword arguments, and even arbitrary argument lists."))
            list.add(Model("MySQL", "https://image.flaticon.com/icons/png/512/274/274439.png", "The most comprehensive set of advanced features, management tools and technical support to achieve the highest levels of MySQL scalability, security, reliability, and uptime."))
            list.add(Model("Android", "https://image.flaticon.com/icons/png/512/160/160138.png", "Android 11 is optimized for how you use your phone. Helping you manage conversations. And organize your day. With tools designed to help you do more."))
            list.add(Model("Flutter", "https://image.flaticon.com/icons/png/512/4307/4307953.png", "Flutter is Google's UI toolkit for building beautiful, natively compiled applications for mobile, web, desktop, and embedded devices from a single codebase."))

            myAdapter = MyAdapter(this, list)
            listView.adapter = myAdapter

            listView.setOnItemClickListener { parent, view, position, id ->
                val element = parent.getItemAtPosition(position)
                val intent = Intent(this, ShowActivity::class.java)
                intent.putExtra("name", ""+list[position].name)
                intent.putExtra("image", ""+list[position].image)
                intent.putExtra("desc", ""+list[position].desc)
                startActivity(intent)
            }
        }
    }
}