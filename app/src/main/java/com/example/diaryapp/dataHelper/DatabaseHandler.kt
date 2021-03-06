package com.example.diaryapp.dataHelper

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.ContactsContract
import android.widget.Toast
import com.example.diaryapp.units.Diary


const val DATABASE_NAME = "DiaryApp";
const val TABLE_DIARY = "tableDiary";
const val COLUMN_DIARY_TITLE = "title";
const val COLUMN_DIARY_CONTENT = "content";
const val COLUMN_DIARY_DATE = "date";
const val COLUMN_DIARY_ID = "id";
const val COLUMN_DIARY_MOOD = "mood";

const val TABLE_USER = "tableUser";
const val TABLE_CHART = "table";
const val TABLE_PLAN = "DiaryApp";


class DatabaseHandler(var context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        var createTableDiary = "CREATE TABLE" + TABLE_DIARY + "(" +
                COLUMN_DIARY_ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_DIARY_TITLE + "VARCHAR()," +
                COLUMN_DIARY_CONTENT + "VARCHAR()," +
                COLUMN_DIARY_MOOD + "VARCHAR()," +
                COLUMN_DIARY_DATE + "VARCHAR())"

        db?.execSQL(createTableDiary);
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun insertDiary(diary: Diary){
        val db = this.writableDatabase
        var data = ContentValues()
        data.put("COLUMN_DIARY_TITLE", diary.title)
        data.put("COLUMN_DIARY_CONTENT", diary.content)
        data.put("COLUMN_DIARY_MOOD", diary.mood)
        data.put("COLUMN_DIARY_DATE", diary.date)

        var result = db.insert(TABLE_DIARY, COLUMN_DIARY_MOOD,data)
        if(result == (-1).toLong()){
            Toast.makeText(context, "false", Toast.LENGTH_SHORT).show()
        } else{
            Toast.makeText(context, "success", Toast.LENGTH_SHORT).show()
        }
    }
}