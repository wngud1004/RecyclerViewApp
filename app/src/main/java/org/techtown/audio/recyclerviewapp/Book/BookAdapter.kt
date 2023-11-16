package org.techtown.audio.recyclerviewapp.Book

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.techtown.audio.recyclerviewapp.R

class BookAdapter (val bookList: MutableList<BookItem>) :
    RecyclerView.Adapter<BookAdapter.MyviewHolder>() {
    inner class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.book_title)
        val writer: TextView = itemView.findViewById(R.id.book_writer)
        val cover: ImageView = itemView.findViewById(R.id.book_cover)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return MyviewHolder(itemView)
    }

    // 데이터 개수 반환
    override fun getItemCount() = bookList.size

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val book = bookList.get(position)
        holder.title.text = book.title
        holder.writer.text = book.writer
        holder.cover.setImageResource(book.cover)
    }
}