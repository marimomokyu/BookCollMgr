package com.example.bookcollmgr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.text.format.DateFormat
import android.util.Log
import android.widget.Toast
import com.facebook.stetho.Stetho
import com.uphyca.stetho_realm.RealmInspectorModulesProvider
import io.realm.Realm
import io.realm.kotlin.createObject
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.activity__regist.*
import java.util.*

class Activity_Regist : AppCompatActivity() {
    private val tag = "hasBook"
    private lateinit var realm: Realm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__regist)
        realm = Realm.getDefaultInstance()

        // stetho-realmの初期化
        Stetho.initialize(
            Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                .build())


        //保存ボタン押下時処理を書く
        saveBtn.setOnClickListener {
            var Name: String = ""

            //名前
            if(!BookNameedit.text.isNullOrEmpty()){
                Name = BookNameedit.text.toString()
            }

            //TODO 他のテキストボックスが追加されたら、名前登録処理を参考に実装する

            //realm登録処理
            realm.executeTransaction {
                val maxId = realm.where<hasBook>().max("id")
                val nextId = (maxId?.toLong() ?: 0L) + 1L
                val hasBook = realm.createObject<hasBook>(nextId)
                hasBook.dateTime = Date()
                hasBook.bookname = Name
            }
            Toast.makeText(applicationContext,"登録しました",Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }
}