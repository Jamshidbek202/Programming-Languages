package com.jamshidbek.programminglanguages.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.jamshidbek.programminglanguages.Model
import com.jamshidbek.programminglanguages.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.listview_item.view.*

class MyAdapter(context:Context, var list:List<Model>) : ArrayAdapter<Model>(context, R.layout.listview_item, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView:View

        if (convertView == null){
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.listview_item, parent, false)
        }else
            itemView = convertView

        Picasso.get().load(list[position].image).into(itemView.langImage)
        itemView.langName.text = list[position].name


        return itemView
    }
}