package com.example.bookcollmgr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class Activity_List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__list)

        val arraybook = Array(20) { i -> "Title-$i" }

        val listView = findViewById<ListView>(R.id.booklist)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arraybook)

        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, position, id ->
            val textView = view.findViewById<TextView>(android.R.id.text1)
            Toast.makeText(this, "Clicked: ${textView.text}", Toast.LENGTH_SHORT).show()
        }
    }



    //変更・修正画面への遷移。最終的にはリストをタップで遷移するようにする予定。
    //今は単純にボタンタップで遷移するようにする
    //
    //TODO 値の受け渡しとかもここでやる必要ありそう
    fun onChangeButtonTapped(view: View?){
        val intent = Intent(this, Activity_Change::class.java)
        startActivity(intent)
    }
}