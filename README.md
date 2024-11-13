# 🧠 MENTAL HEALTH TRACKER 

## 📖 Overview

The Advanced Mental Health Tracker is a Java-based console application designed to help users log and monitor their mental health by tracking moods, viewing mood history, and generating mood reports. The application also offers mental health tips based on the user’s mood.

## 🌟 Features

1. User Registration and Login:
Users can register and log in securely with a username and password.
User data is stored persistently in a file (users.txt).

2. Mood Logging:
Users can log their mood by selecting from predefined options (e.g., Happy, Sad, Stressed, etc.).
Each mood entry is timestamped and saved to a file (moods.txt).

3. Mood History:
Users can view their complete mood history, showing all previously logged moods.

4. Mood Report:
The app generates a report showing the frequency and percentage of each mood type logged by the user.

5. Mood Tips:
The app provides personalized self-care tips based on the user’s logged mood.

## 📌 Getting Started

Prerequisites

Java Development Kit (JDK): Ensure Java is installed and set up on your machine.

IDE (Optional): While you can run this app in any Java environment, using an IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code is recommended

📲 Installation

1. Clone or Download the repository files.

2. Open the project in your preferred IDE.

3. Run the MentalHealthTracker main class to start the application.

## 💻 Usage

1. Register a new user by selecting "1" from the main menu.

2. Login using the registered username and password by selecting "2".

3. Access the User Menu:
**Log Mood**: Select "1" and follow the prompts to log your current mood.
**View Mood History**: Select "2" to see all previously logged moods.
**Generate Mood Report**: Select "3" to view a summary of mood patterns.
**Logout**: Select "4" to log out of the current session.

4. Exit the application by selecting "3" from the main menu.

## 📁 Files Used

users.txt: Stores user credentials in the format username:password.

moods.txt: Stores mood entries with timestamps in the format date - username: mood.

## ⌨️ Code Overview

MentalHealthTracker.java: Main entry point. Manages registration, login, and navigation through the user menu.

MoodTracker.java: Handles mood logging, viewing history, and generating mood reports.

User.java: Manages user data, including registration, login, and data persistence in users.txt.

## ⏳ Example Flow

Welcome to the Advanced Mental Health Tracker App
1. Register
2. Login
3. Exit
Select an option: 1

Enter username: user1
Enter password: pass1
Registration successful! You can now log in.

1. Log Mood
2. View Mood History
3. Generate Mood Report
4. Logout
Select an option: 1

How are you feeling today? (Happy, Sad, Stressed, etc.): Happy

Your mood has been logged.

Here are some tips for when you're feeling Happy:
- Keep doing what makes you feel happy!
- Share your happiness with someone else.

## 🗒 Requirements and Notes

Java version 8 or higher.

Ensure users.txt and moods.txt are in the same directory as the application, or update paths if stored elsewhere.

When registering, usernames must be unique.

## 🗂 Troubleshooting

File Not Found Errors: If users.txt or moods.txt files are missing, the application will create them.

Login Issues: Make sure you register first, as only registered users can log in.
