package com.example.bookcollmgr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import io.realm.kotlin.createObject
import io.realm.kotlin.where

class Activity_Regist : AppCompatActivity() {
    private val tag = "hasBook"
    private lateinit var realm: Realm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__regist)
        realm = Realm.getDefaultInstance()

        //TODO ここにボタンが押された時の処理を書く

    }

    override fun onDestroy() {
        super.onDestroy()
        //realm.close()

    }
}