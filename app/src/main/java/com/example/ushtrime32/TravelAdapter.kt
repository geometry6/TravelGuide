package com.example.ushtrime32

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView
import android.widget.TextView

class TravelAdapter(private val travelList: List<TravelDestination>) :
    RecyclerView.Adapter<TravelAdapter.TravelViewHolder>() {

    class TravelViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.tv_name)
        val locationTextView: TextView = view.findViewById(R.id.tv_location)
        val descriptionTextView: TextView = view.findViewById(R.id.tv_description)
        val imageView: ImageView = view.findViewById(R.id.iv_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TravelViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_travel_destination, parent, false)
        return TravelViewHolder(view)
    }

    override fun onBindViewHolder(holder: TravelViewHolder, position: Int) {
        val travelDestination = travelList[position]
        holder.nameTextView.text = travelDestination.name
        holder.locationTextView.text = travelDestination.location
        holder.descriptionTextView.text = travelDestination.description
        holder.imageView.setImageResource(travelDestination.imageResId)
    }

    override fun getItemCount(): Int = travelList.size
}
