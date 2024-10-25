package com.example.ushtrime32

import com.example.ushtrime32.R
import com.example.ushtrime32.TravelDestination

object TravelData {
    fun getTravelDestinations(): List<TravelDestination> {
        return listOf(
            TravelDestination(
                name = "Eiffel Tower",
                location = "Paris, France",
                description = "One of the most famous landmarks in the world, offering breathtaking views of Paris.",
                imageResId = R.drawable.eiffel_tower
            ),
            TravelDestination(
                name = "Great Wall of China",
                location = "China",
                description = "An ancient world wonder, stretching over 13,000 miles across China.",
                imageResId = R.drawable.great_wall
            ),
            TravelDestination(
                name = "Grand Canyon",
                location = "Arizona, USA",
                description = "A vast canyon known for its stunning size and vibrant colors.",
                imageResId = R.drawable.grand_canyon
            )
        )
    }
}
