package org.techtown.audio.recyclerviewapp.Movie

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.techtown.audio.recyclerviewapp.R

class MovieActivity : AppCompatActivity() {
    private val movieList: MutableList<MovieItem> = mutableListOf()
    //private var albumList: MutableList<Album>? = null
    private lateinit var recyclerView: RecyclerView
    private var adapter: MovieAdapter? = null
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
        var a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스1", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스2", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스3", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스4", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스5", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스6", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스7", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스8", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스9", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스10", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스11", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스12", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스13", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        a = MovieItem(ContextCompat.getDrawable(this, R.drawable.icon_movie_48)!!, "어벤져스14", "어벤져스가 세상을 구하는 이야기")
        movieList.add(a)
        adapter?.notifyDataSetChanged()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        // 1)  RecyclerView 레퍼런스 가져오기
        recyclerView = findViewById(R.id.recycler_movie)
        //2) Adapter 객체 생성
        adapter = MovieAdapter(movieList)
        // 3) 리싸이클러뷰에 레이아웃매니저 설정
        // recyclerView.layoutManager = GridLayoutManager(this, 2)
        // 4) 리싸이클러뷰에 어댑터 등록
        recyclerView.adapter = adapter
        // 5) 데이터리스트 생성
        // albumList = mutableListOf() // 리스트 객체 생성
        prepareAlbums()


    }

}