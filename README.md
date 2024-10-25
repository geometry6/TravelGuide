
# Travel Guide App

This project is a simple **Travel Guide Android Application** built with **Kotlin**. The app displays a list of famous travel destinations with descriptions and images using a `RecyclerView`. The user can scroll through various travel destinations, each containing a brief description, location, and an image.

## Features
- Displays a list of travel destinations.
- Each destination shows:
  - Name of the place.
  - Location (City/Country).
  - A brief description.
  - Image of the destination.
- The list is built using Android's `RecyclerView` for efficient scrolling.
- Organized project structure with separation between data, models, and UI components.

## Project Structure
- **`MainActivity.kt`**: Sets up the `RecyclerView` and binds it with the `TravelAdapter` to display travel destinations.
- **`TravelAdapter.kt`**: An adapter to bind the travel destination data to the `RecyclerView` list items.
- **`TravelDestination.kt`**: A model class that defines the structure for a travel destination (name, location, description, and image).
- **`TravelData.kt`**: Contains sample data of travel destinations, including names, descriptions, and images.
- **XML Layouts**:
  - `activity_main.xml`: Contains the layout for the main screen with the `RecyclerView`.
  - `item_travel_destination.xml`: Defines the layout of each travel destination displayed in the `RecyclerView`.

## Screenshots
(Add screenshots here of your app displaying travel destinations, if available.)

## Getting Started

### Prerequisites
- Android Studio
- Kotlin 1.5+
- Android SDK 21+

### Setup Instructions
1. Clone this repository:
   \`\`\`bash
   git clone https://github.com/yourusername/travel-guide-app.git
   \`\`\`
2. Open the project in **Android Studio**.
3. Build the project and run it on an emulator or physical device.

### How It Works
1. **RecyclerView** is used in the main activity to display a scrollable list of travel destinations.
2. **TravelAdapter** populates the RecyclerView with data from **TravelData**.
3. The app uses a simple XML layout to display the name, location, description, and image for each destination.

### 

## Contributing
If you'd like to contribute to this project, feel free to fork the repository and submit a pull request.
