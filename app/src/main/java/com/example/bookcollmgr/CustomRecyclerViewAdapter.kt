package com.example.bookcollmgr

import androidx.recyclerview.widget.RecyclerView
import io.realm.RealmResults
import android.graphics.Color
import android.graphics.Color.LTGRAY
import android.text.Layout
import android.text.format.DateFormat
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.view.LayoutInflater

class CustomRecyclerViewAdapter(realmResults: RealmResults<hasBook>) :
        RecyclerView.Adapter<ViewHolder>(){
    private val rResults: RealmResults<hasBook> = realmResults
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.one_result,parent,false)
        val viewholder = ViewHolder(view)
        return viewholder
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return rResults.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //TODO("Not yet implemented")
        val hasBook = rResults[position]
        //TODO 列を増やしたらここも記述する
        holder.dateText?.text = DateFormat.format("yyyy/mm/dd kk:mm",hasBook?.dateTime)
        holder.BookNameText?.text = "${hasBook?.bookname.toString()}/${hasBook?.bookname.toString()}"

        holder.itemView.setBackgroundColor(if (position % 2 == 0) Color.LTGRAY  else Color.WHITE)
    }
}