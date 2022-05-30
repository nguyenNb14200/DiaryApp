package com.example.diaryapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.diaryapp.R
import com.example.diaryapp.`interface`.onclickPageDiary
import com.example.diaryapp.units.Diary

class DiaryDiaryAdapter(diary: List<Diary>, context: Context, onClickTrash: onclickPageDiary) : RecyclerView.Adapter<DiaryDiaryAdapter.ViewHolder>() {

    private val diary: List<Diary> = diary
    private var context: Context = context
    var onClick: onclickPageDiary = onClickTrash

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.item_diary_adapter, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: DiaryDiaryAdapter.ViewHolder, position: Int) {
        holder.tvDate.text = diary.get(position).date
        holder.tvTitle.text = diary.get(position).title
        holder.tvContent.text = diary.get(position).content
        holder.icTrash.setOnClickListener(View.OnClickListener { onClick.onClickTrash(position) })
        if(diary.get(position).mood.equals("good")){
            holder.icMood.setImageResource(R.drawable.good)
        } else if(diary.get(position).mood.equals("rad")){
            holder.icMood.setImageResource(R.drawable.rad)
        }else if(diary.get(position).mood.equals("meh")){
            holder.icMood.setImageResource(R.drawable.meh)
        }else if(diary.get(position).mood.equals("bad")){
            holder.icMood.setImageResource(R.drawable.bad)
        } else{
            holder.icMood.setImageResource(R.drawable.awful)
        }
    }

    override fun getItemCount(): Int {
        return diary.size
    }

    inner class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        var tvDate : TextView
        var tvTitle : TextView
        var tvContent : TextView
        var icMood : ImageView
        var icTrash : ImageView

        init {
            tvDate = itemView.findViewById(R.id.tvDate)
            tvTitle = itemView.findViewById(R.id.tvTitle)
            tvContent = itemView.findViewById(R.id.tvContent)
            icMood = itemView.findViewById(R.id.icMood)
            icTrash = itemView.findViewById(R.id.icTrash)
        }
    }

}