package com.example.diaryapp.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.diaryapp.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_diary_adapter.*
import kotlinx.android.synthetic.main.page_diary_activity.*
import java.util.*

class PageDiartActivity : AppCompatActivity() {

    var date:String = Calendar.getInstance().time.toString()
    lateinit var title:String
    lateinit var content:String
    lateinit var mood:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_diary_activity)

        setOnClick()
    }

    private fun setOnClick() {
        icSave.setOnClickListener{
            title = etTitle.text.toString()
            content = etContent.text.toString()
            date = tvDate.text.toString()
        }
    }
}