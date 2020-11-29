package com.example.bookcollmgr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class Activity_List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__list)
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