package com.example.bookcollmgr

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class hasBook : RealmObject(){
    //こんな感じで列を定義していく
    //TODO 列は適当に作っているので、各自いい感じに追加、編集していってください
    @PrimaryKey
    var id: Long = 0
    var dateTime: Date = Date()
    var bookname: String = ""

}