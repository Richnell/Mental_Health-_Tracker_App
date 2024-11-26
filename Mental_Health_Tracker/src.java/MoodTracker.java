import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class MoodTracker extends Tracker {
    private static final Map<String, String[]> moodTips = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    static {
        moodTips.put("Happy", new String[]{
            "Keep doing what makes you happy!",
            "Share your happiness with someone else.",
            "Laugh, it’s contagious!",
            "Celebrate the little victories in life."
        });
        
        moodTips.put("Sad", new String[]{
            "Talk to a friend.",
            "Write down your feelings.",
            "Remember that it's okay to feel down sometimes.",
            "Try to focus on something that makes you feel better."
        });

        moodTips.put("Stressed", new String[]{
            "Take deep breaths.",
            "Organize your tasks.",
            "Break your tasks into smaller steps.",
            "Give yourself a break and come back to it later."
        });

        moodTips.put("Anxious", new String[]{
            "Focus on your breathing.",
            "Write down your worries.",
            "Try grounding exercises (5 things you can see, 4 things you can touch, etc.).",
            "Remember that you are not alone in this."
        });

        moodTips.put("Angry", new String[]{
            "Calm yourself with a walk.",
            "Talk to someone you trust.",
            "Take a deep breath and count to 10.",
            "Channel your energy into something productive."
        });

        moodTips.put("Grateful", new String[]{
            "Write down three things you're grateful for today.",
            "Share your gratitude with someone else.",
            "Take a moment to reflect on your blessings.",
            "Carry this feeling with you throughout the day."
        });

        moodTips.put("Excited", new String[]{
            "Share your excitement with someone you trust.",
            "Take action towards what excites you.",
            "Use your energy to work on something creative.",
            "Celebrate your excitement in a positive way."
        });

        moodTips.put("Lonely", new String[]{
            "Reach out to someone you care about.",
            "Engage in a hobby you love.",
            "Remember that loneliness is a temporary feeling.",
            "Consider joining a community or group with similar interests."
        });

        moodTips.put("Confident", new String[]{
            "Use your confidence to help others around you.",
            "Take on a challenge that excites you.",
            "Celebrate your strengths and achievements.",
            "Keep pushing forward with your positive mindset."
        });

        moodTips.put("Hopeful", new String[]{
            "Visualize your goals and keep moving forward.",
            "Share your hope with someone else.",
            "Remind yourself that good things are coming.",
            "Stay patient and keep a positive mindset."
        });
    }

    public MoodTracker() {
        super("moods.txt");
    }

    @Override
    public void logEntry(String username) {
        System.out.print("How are you feeling today? (Happy, Sad, Stressed, Anxious, Angry, Grateful, Excited, Lonely, Confident, Hopeful): ");
        String mood = capitalizeMood(scanner.nextLine().trim());

        if (!moodTips.containsKey(mood)) {
            System.out.println("Mood not recognized. Please try again.");
            return;
        }

        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String entry = date + " - " + username + ": " + mood;
        saveToFile(entry);
        System.out.println("Mood logged successfully.");

        String[] tips = moodTips.get(mood);
        String randomTip = tips[new Random().nextInt(tips.length)];
        System.out.println("Here's a tip for when you're feeling " + mood + ": " + randomTip);
    }

    @Override
    public void viewHistory(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean found = false;
            System.out.println("\nYour mood history:");
            while ((line = reader.readLine()) != null) {
                if (line.contains(username)) {
                    found = true;
                    System.out.println(line);
                }
            }
            if (!found) {
                System.out.println("No mood history found for user.");
            }
        } catch (IOException e) {
            System.out.println("Error reading mood history.");
            e.printStackTrace();
        }
    }

    @Override
    public void generateReport(String username) {
        Map<String, Integer> moodCounts = new HashMap<>();
        int totalEntries = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(username)) {
                    String mood = line.split(": ")[1].trim();
                    moodCounts.put(mood, moodCounts.getOrDefault(mood, 0) + 1);
                    totalEntries++;
                }
            }

            System.out.println("\nMood Report for " + username + ":");
            if (totalEntries > 0) {
                for (Map.Entry<String, Integer> entry : moodCounts.entrySet()) {
                    String mood = entry.getKey();
                    int count = entry.getValue();
                    System.out.printf("%s: %d entries (%.2f%%)\n", mood, count, (count / (double) totalEntries) * 100);
                }
            } else {
                System.out.println("No mood entries to report.");
            }
        } catch (IOException e) {
            System.out.println("Error generating mood report.");
            e.printStackTrace();
        }
    }

    private String capitalizeMood(String mood) {
        if (mood == null || mood.isEmpty()) return mood;
        return mood.substring(0, 1).toUpperCase() + mood.substring(1).toLowerCase();
    }
}