package com.example.bookcollmgr

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.one_result.view.*

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    var dateText: TextView? = null
    var BookNameText: TextView? = null
    init {
        //ビューホルダーのプロパティとレイアウトのview対応
        dateText = itemView.dateText
        BookNameText = itemView.BookNameText
    }


}
