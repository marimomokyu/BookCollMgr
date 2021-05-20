package com.example.bookcollmgr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import io.realm.Realm
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.activity__list.*

class Activity_List : AppCompatActivity() {
    private lateinit var realm: Realm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__list)
        realm = Realm.getDefaultInstance()

        // データ削除
        //deleteRealm()

        val bookList = realm.where<hasBook>().findAll()

        val adapter = ListAdapter(this, bookList,true)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }

    private fun deleteRealm() {
        val target = realm.where<hasBook>().findAll()

        // トランザクションして削除
        realm.executeTransaction {
            target.deleteFromRealm(0)
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