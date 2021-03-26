package com.yonder.blurrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.yonder.blurrecyclerview.adapter.PhotosRecyclerViewAdapter

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    findViewById<RecyclerView>(R.id.rvPhotos)
        .adapter = PhotosRecyclerViewAdapter((1..100).map { "Title $it" })
  }
}