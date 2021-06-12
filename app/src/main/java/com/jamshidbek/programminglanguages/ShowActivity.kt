package com.jamshidbek.programminglanguages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_show.*
import kotlinx.android.synthetic.main.listview_item.view.*

class ShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        val image = intent.getStringExtra("image")
        val name = intent.getStringExtra("name")
        val desc = intent.getStringExtra("desc")

        Picasso.get().load(image).into(showImage)

        showName.text = name
        showDesc.text = desc
    }
}