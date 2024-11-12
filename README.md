
# 🧠 MENTAL HEALTH TRACKER 

## 📖 Overview

The Mental Health Tracker is a Java-based console application that helps users monitor their mental well-being by logging their moods, viewing their mood history, and generating reports. This tool is designed with simplicity in mind, allowing users to register, log in, and access various features for mood tracking and mental health tips. It stores user data and mood logs in local files.

## 🌟 Features

User Registration: New users can register with a unique username and password.

User Login: Registered users can log in to track their moods.

Mood Logging: Users can log their current mood (e.g., Happy, Sad, Stressed) and receive mental health tips.

Mood History: Users can view their past mood entries, categorized by date.

Mood Report Generation: The app generates a summary report of mood frequencies for each user.


## 🛠 Structure

📌 Classes

1. MentalHealthTracker: The main class that initializes the application, handles the main menu, user registration, login, and navigation to the user menu.


2. User: Manages user data, including registration, login, and file handling for storing user information.


3. MoodTracker: Handles mood-related features such as logging moods, displaying mood history, generating reports, and providing mood-based tips.



📂 Files

users.txt: Stores registered users' usernames and hashed passwords.

moods.txt: Records each user's mood entries with the date and time.


## 🚀 Getting Started

✨️ Prerequisites

Java Development Kit (JDK) installed (version 8 or above)

Any IDE (e.g., IntelliJ, Eclipse) or terminal to run the Java code


📲 Installation

1. Clone or download the repository.


2. Open the project in your preferred IDE or navigate to the project directory in the terminal.



## ⌨️ Running the Application

1. Compile the program:

javac MentalHealthTracker.java


2. Run the program:

java MentalHealthTracker


3. Follow the on-screen instructions to register, log in, and start tracking moods.



## 💻 Using the Application

1. Register: Select option 1 from the main menu to create an account.


2. Login: After registration, log in with your username and password.


3. User Menu:

Log Mood: Select option 1 to record your current mood. You will receive helpful tips based on your mood.

View Mood History: Select option 2 to see all past mood entries.

Generate Mood Report: Select option 3 to get a summary of your mood log frequencies.




## 📄 Example Interaction

Welcome to the Advanced Mental Health Tracker App
1. Register
2. Login
3. Exit
Select an option: 1

Enter username: user123
Enter password: password123
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

## 🗂 File Structure

MentalHealthTracker/
├── MentalHealthTracker.java   # Main application class
├── User.java                  # User management class
├── MoodTracker.java           # Mood tracking and tips class
├── users.txt                  # File storing user information
├── moods.txt                  # File storing mood logs
└── README.md                  # Documentation file

