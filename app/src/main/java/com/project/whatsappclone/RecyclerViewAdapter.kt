package com.project.whatsappclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val items: List<Details>) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.messageview,parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentPosition = items[position]
        holder.imageViewHolder.setImageResource(currentPosition.image)
        holder.nameViewHolder.text = currentPosition.name
        holder.descViewHolder.text = currentPosition.description
    }

    override fun getItemCount(): Int {

        return items.size
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageViewHolder: ImageView = view.findViewById(R.id.profileImage)
        val nameViewHolder: TextView = view.findViewById(R.id.name)
        val descViewHolder: TextView = view.findViewById(R.id.description)

    }

}