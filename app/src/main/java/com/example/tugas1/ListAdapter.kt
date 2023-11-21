package com.example.listviewkotpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.tugas1.ListData
import com.example.tugas1.R

class ListAdapter(context: Context, dataArrayList: ArrayList<ListData?>?) :
    ArrayAdapter<ListData?>(context, R.layout.list_item, dataArrayList!!) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        var view = view
        val listData = getItem(position)

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }

        val listImage = view!!.findViewById<ImageView>(R.id.listImage)
        val listName = view.findViewById<TextView>(R.id.listName)
        val listNim = view.findViewById<TextView>(R.id.listNim)


        listImage.setImageResource(listData!!.image)
        listName.text = listData.name
        listNim.text = listData.nim

        return view
    }
}