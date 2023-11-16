package org.techtown.audio.recyclerviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import org.techtown.audio.recyclerviewapp.Book.BookActivity
import org.techtown.audio.recyclerviewapp.Movie.MovieActivity
import org.techtown.audio.recyclerviewapp.Show.ShowActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Book = findViewById<ImageButton>(R.id.BookImage)
        val Show = findViewById<ImageButton>(R.id.ShowImage)
        val Movie = findViewById<ImageButton>(R.id.MovieImage)
        // val textView = findViewById<TextView>(R.id.TextView)

        Book.setOnClickListener {
            val intent = Intent(this, BookActivity::class.java)
            startActivity(intent)
        }
        Show.setOnClickListener {
            val intent = Intent(this, ShowActivity::class.java)
            startActivity(intent)
        }
        Movie.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }
    }
}