package com.csanad.bettertimes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.csanad.bettertimes.R
import com.csanad.bettertimes.data.local.ReminderEntity

class RemindersRecyclerViewAdapter(data:List<ReminderEntity>):
    RecyclerView.Adapter<RemindersRecyclerViewAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val date=itemView.findViewById<TextView>(R.id.textViewDate)
        val time=itemView.findViewById<TextView>(R.id.textViewTime)
        val title=itemView.findViewById<TextView>(R.id.textViewTitle)
    }

    var data= data
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_reminder,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = data[position]
        holder.date.text=item.next.toString()
        holder.time.text=item.time.toString()
        holder.title.text=item.title
    }

    override fun getItemCount(): Int {
        return data.size
    }
}