package com.example.diaryapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diaryapp.R
import com.example.diaryapp.units.Diary
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var requestCodeToPageDiary : Int = 111
    var listData = mutableListOf<Diary>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvAddDiary.setOnClickListener {
            val intent = Intent(this, PageDiartActivity::class.java)
            startActivityForResult(intent, requestCodeToPageDiary)
        }
    }
}