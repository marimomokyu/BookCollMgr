package com.example.bookcollmgr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.Sort

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity__list.*


class MainActivity : AppCompatActivity() {
    private lateinit var realm: Realm
    private lateinit var adapter : CustomRecyclerViewAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        realm = Realm.getDefaultInstance()

    }

    // 本 登録ボタンタップ時
    //変更・修正画面は本登録画面から遷移する。ここでは実装してません
    fun onRegistButtonTapped(view: View?){
        val intent = Intent(this, Activity_Regist::class.java)
        startActivity(intent)
    }

    // 本 一覧ボタンタップ時
    fun onListButtonTapped(view: View?){
        val intent = Intent(this, Activity_List::class.java)
        startActivity(intent)
    }

    // 管理グラフボタンタップ時
    fun onGraphButtonTapped(view: View?){
        val intent = Intent(this, Activity_Graph::class.java)
        startActivity(intent)
    }

    //override fun onStart(){
    //    super.onStart()
    //    val realmResults = realm.where(hasBook::class.java)
    //        .findAll()
    //        .sort("id",Sort.DESCENDING)
    //    layoutManager = LinearLayoutManager(this)
    //    recyclerView.layoutManager = layoutManager
    //    recyclerView.adapter = this.adapter
    //}

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }


}