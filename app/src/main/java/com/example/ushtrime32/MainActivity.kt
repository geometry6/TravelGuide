package com.example.ushtrime32

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val travelRecyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        travelRecyclerView.layoutManager = LinearLayoutManager(this)

        val travelAdapter = TravelAdapter(TravelData.getTravelDestinations())
        travelRecyclerView.adapter = travelAdapter
    }
}
