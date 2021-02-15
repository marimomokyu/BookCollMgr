package com.example.bookcollmgr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import io.realm.Realm

class MainActivity : AppCompatActivity() {
    private lateinit var realm: Realm
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

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }

    //0215テスト

}