package com.example.bookcollmgr

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import io.realm.RealmResults
import android.graphics.Color
import android.text.Layout
import android.text.format.DateFormat
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.view.LayoutInflater

class CustomRecyclerViewAdapter(realmResults: RealmResults<hasBook>) :
        RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.one_result,parent,false)
        val viewholder = ViewHolder(view)
        return viewholder
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}