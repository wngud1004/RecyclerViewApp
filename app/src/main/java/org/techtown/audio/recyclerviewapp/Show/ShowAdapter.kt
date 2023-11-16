package org.techtown.audio.recyclerviewapp.Show

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.audio.recyclerviewapp.R

class ShowAdapter(val showList: MutableList<Int>) :
    RecyclerView.Adapter<ShowAdapter.MyViewHolder>() {
    inner class MyViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_show, parent,false)) {
        val show: ImageView = itemView.findViewById(R.id.poster)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder((parent))

    override fun getItemCount(): Int = showList.size

    override fun onBindViewHolder(holder: ShowAdapter.MyViewHolder, position: Int) {
        holder.show.setImageResource(showList[position])
    }

}