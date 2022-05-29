package com.example.diaryapp.units

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

class Diary {
    var id : Int = 0;
    var title : String ="";
    var content : String = "";
    var date : Date = Calendar.getInstance().time;
    var mood : String = "";

    constructor(title:String, content: String, date: Date, mood: String){
        this.title = title;
        this.content = content;
        this.date = date;
        this.mood = mood;
    }


}