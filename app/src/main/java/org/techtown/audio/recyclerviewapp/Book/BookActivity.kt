package org.techtown.audio.recyclerviewapp.Book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.techtown.audio.recyclerviewapp.Movie.MovieItem
import org.techtown.audio.recyclerviewapp.R

class BookActivity : AppCompatActivity() {
    // 멤버변수 선언
    private val bookList: MutableList<BookItem> = mutableListOf()
    //private var albumList: MutableList<Album>? = null
    private lateinit var recyclerView: RecyclerView
    private var adapter: BookAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        // 1)  RecyclerView 레퍼런스 가져오기
        recyclerView = findViewById(R.id.recycler_book)
        //2) Adapter 객체 생성
        adapter = BookAdapter(bookList)
        // 3) 리싸이클러뷰에 레이아웃매니저 설정
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        // 4) 리싸이클러뷰에 어댑터 등록
        recyclerView.adapter = adapter
        // 5) 데이터리스트 생성
        // albumList = mutableListOf() // 리스트 객체 생성
        prepareAlbums()

    }

    private fun prepareAlbums() {
        /*
        val covers = intArrayOf(
            R.drawable.album1,
            R.drawable.album2,
            R.drawable.album3,
            R.drawable.album4,
            R.drawable.album5,
            R.drawable.album6,
            R.drawable.album7,
            R.drawable.album8,
            R.drawable.album9,
            R.drawable.album10,
            R.drawable.album11)
         */
        var a = BookItem(R.drawable.icon_book_48, "군주론1", "니콜로 마키아벨리")
        bookList.add(a)
        a = BookItem(R.drawable.icon_book_48, "군주론2", "니콜로 마키아벨리")
        bookList.add(a)
        a = BookItem(R.drawable.icon_book_48, "군주론3", "니콜로 마키아벨리")
        bookList.add(a)
        a = BookItem(R.drawable.icon_book_48, "군주론4", "니콜로 마키아벨리")
        bookList.add(a)
        a = BookItem(R.drawable.icon_book_48, "군주론5", "니콜로 마키아벨리")
        bookList.add(a)
        a = BookItem(R.drawable.icon_book_48, "군주론6", "니콜로 마키아벨리")
        bookList.add(a)
        a = BookItem(R.drawable.icon_book_48, "군주론7", "니콜로 마키아벨리")
        bookList.add(a)
        a = BookItem(R.drawable.icon_book_48, "군주론8", "니콜로 마키아벨리")
        bookList.add(a)
        a = BookItem(R.drawable.icon_book_48, "군주론9", "니콜로 마키아벨리")
        bookList.add(a)
        a = BookItem(R.drawable.icon_book_48, "군주론10", "니콜로 마키아벨리")
        bookList.add(a)
        a = BookItem(R.drawable.icon_book_48, "군주론11", "니콜로 마키아벨리")
        bookList.add(a)
        adapter?.notifyDataSetChanged()
    }
}