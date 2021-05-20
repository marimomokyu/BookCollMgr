package com.example.bookcollmgr

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.realm.OrderedRealmCollection
import io.realm.RealmRecyclerViewAdapter
import kotlinx.android.synthetic.main.list_book.view.*

class ListAdapter (
    private val context: Context,
    private var bookList: OrderedRealmCollection<hasBook>?,
    private val autoUpdate: Boolean
) :
    RealmRecyclerViewAdapter<hasBook, ListAdapter.BookViewHolder>(bookList, autoUpdate) {

    override fun getItemCount(): Int {
        return bookList?.size ?: 0
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book: hasBook = bookList?.get(position) ?: return

        holder.titletext.text = book.bookname
        holder.datetext.text = book.dateTime.toString()

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BookViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.list_book, viewGroup, false)
        return BookViewHolder(v)
    }

    class BookViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titletext: TextView = view.titletext
        val datetext: TextView = view.datetext
    }

}