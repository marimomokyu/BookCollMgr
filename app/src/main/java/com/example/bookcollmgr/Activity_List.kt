package com.example.bookcollmgr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.Sort
import kotlinx.android.synthetic.main.activity__list.*

class Activity_List : AppCompatActivity() {
    private lateinit var realm: Realm
    private lateinit var adapter : CustomRecyclerViewAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__list)
    }

    //override fun onStart(){
    //    super.onStart()
    //    val realmResults = realm.where(hasBook::class.java)
    //        .findAll()
    //         .sort("id",Sort.DESCENDING)
    //    layoutManager = LinearLayoutManager(this)
    //    recyclerView.layoutManager = layoutManager
    //    recyclerView.adapter = this.adapter
    //}


    //変更・修正画面への遷移。最終的にはリストをタップで遷移するようにする予定。
    //今は単純にボタンタップで遷移するようにする
    //
    //TODO 値の受け渡しとかもここでやる必要ありそう
    fun onChangeButtonTapped(view: View?){
        val intent = Intent(this, Activity_Change::class.java)
        startActivity(intent)
    }
}