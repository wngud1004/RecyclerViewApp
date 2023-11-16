package org.techtown.audio.recyclerviewapp.Movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.audio.recyclerviewapp.R

class MovieAdapter(val movieList: MutableList<MovieItem>) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.movie_name)
        val content: TextView = itemView.findViewById(R.id.movie_content)
        val poster: ImageView = itemView.findViewById(R.id.movie_icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent,false)
        return MyViewHolder(itemView)
    }

    // 데이터 개수 반환
    override fun getItemCount() = movieList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = movieList.get(position)
        holder.name.text = movie.name
        holder.content.text = movie.content.toString()
        holder.poster.setImageResource(R.drawable.icon_movie_48)
    }

}