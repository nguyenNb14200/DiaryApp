package com.example.diaryapp.dataHelper

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.ContactsContract
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


class DatabaseHandler(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        var createTableDiary = "CREATE TABLE" + TABLE_DIARY + "(" +
                COLUMN_DIARY_ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_DIARY_TITLE + "VARCHAR()," +
                COLUMN_DIARY_CONTENT + "VARCHAR()," +
                COLUMN_DIARY_DATE + "VARCHAR())"

        db?.execSQL(createTableDiary);
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun insertDiary(diary: Diary){
        val db = this.writableDatabase
        var cv = ContentValues()

    }
}