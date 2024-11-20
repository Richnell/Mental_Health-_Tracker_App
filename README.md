# 🧠 MENTAL HEALTH TRACKER 

## I. 📖 Project Overview

The Mental Health Tracker App is a Java-based application designed to help individuals track and monitor their mental health. Users can log their mood, view their mood history, and generate mood reports. The app provides useful tips for different moods to encourage positive mental well-being. It includes user authentication (registration and login) and stores user data in text files.

## II. 📌 Explanation of How OOP Principles Were Applied

This project makes use of Object-Oriented Programming (OOP) principles, such as:

Encapsulation: The app encapsulates mood-related logic within the MoodTracker and user-related logic within the User class. Data like users and moods are hidden behind methods and are not directly accessible from outside the class.

Inheritance: The MoodTracker class extends the abstract Tracker class, inheriting common functionality such as saving entries to a file and loading user data. This demonstrates code reuse and promotes a cleaner design.

Abstraction: The Tracker class provides an abstract representation for mood tracking, which can be extended for other types of tracking (e.g., physical health, exercise). Users interact with high-level methods without worrying about the underlying implementation.

Polymorphism: Methods like logEntry, viewHistory, and generateReport are abstract in the Tracker class and are implemented differently in the MoodTracker subclass, showing how the app can be expanded with different types of trackers in the future.


## III. 📁 Details of the Chosen SDG and Its Integration into the Project

This project contributes to SDG 3: Good Health and Well-Being, specifically by promoting mental health and well-being. By providing users with tools to track their moods and receive tailored tips, the app helps users become more aware of their emotional states and seek support when needed. Tracking mood patterns also encourages early detection of mental health issues, supporting better decision-making for self-care and well-being.

## IV. 💻 Instructions for Running the Program

**1. Clone the repository:**
You can clone this repository to your local machine using:

git clone https://github.com/yourusername/mental-health-tracker.git


**2. Compile the code:**
Ensure you have Java installed on your machine. Compile the Java files using the following command:

javac *.java


**3. Run the application:**
After compilation, run the MentalHealthTracker class to start the app:

java MentalHealthTracker


**4. Interacting with the App:**

**Register:** Create a new account by providing a username and password.

**Login:** After registration, log in with your username and password.

**Log Mood:** Record your mood for the day, and receive helpful tips.

**View Mood History:** View your previously logged moods.

**Generate Mood Report:** View a summary of your moods over time.

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
- Share your happiness with someone else.

