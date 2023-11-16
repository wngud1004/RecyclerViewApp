package org.techtown.audio.recyclerviewapp.Show

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import org.techtown.audio.recyclerviewapp.R

class ShowActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        pager = findViewById(R.id.viewpager_show)
        pager.adapter = ShowAdapter(getIdolList()) // 어댑터 생성
        pager.orientation = ViewPager2.ORIENTATION_HORIZONTAL // 방향을 가로로

    }

    // 뷰 페이저에 들어갈 아이템
    private fun getIdolList(): ArrayList<Int> {
        return arrayListOf<Int>(
            R.drawable.show_01,
            R.drawable.show_02,
            R.drawable.show_03,
            R.drawable.show_04,
            R.drawable.show_05,
            R.drawable.show_06,)
    }
}