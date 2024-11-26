import java.util.Scanner;

public class MentalHealthTracker {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Tracker moodTracker = new MoodTracker();

    public static void main(String[] args) {
        User.loadUsers();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the Advanced Mental Health Tracker App");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Select an option (1-3): ");

            int choice = getValidatedChoice(1, 3);

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> {
                    String username = loginUser();
                    if (username != null) {
                        userMenu(username);
                    }
                }
                case 3 -> {
                    exit = true;
                    System.out.println("Goodbye! Take care of your mental health!");
                }
                default -> System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }

    private static int getValidatedChoice(int min, int max) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) {
                    return choice;
                } else {
                    System.out.println("Please enter a number between " + min + " and " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private static void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (User.register(username, password)) {
            System.out.println("Registration successful! You can now log in.");
        } else {
            System.out.println("Registration failed. Username already exists.");
        }
    }

    private static String loginUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (User.login(username, password)) {
            System.out.println("Login successful! Welcome back, " + username + "!");
            return username;
        } else {
            System.out.println("Login failed. Incorrect username or password.");
            return null;
        }
    }

    private static void userMenu(String username) {
        boolean logout = false;
        while (!logout) {
            System.out.println("\nUser Menu");
            System.out.println("1. Log Mood");
            System.out.println("2. View Mood History");
            System.out.println("3. Generate Mood Report");
            System.out.println("4. Logout");
            System.out.print("Select an option (1-4): ");

            int option = getValidatedChoice(1, 4);

            switch (option) {
                case 1 -> moodTracker.logEntry(username);
                case 2 -> moodTracker.viewHistory(username);
                case 3 -> moodTracker.generateReport(username);
                case 4 -> {
                    logout = true;
                    System.out.println("You've logged out successfully.");
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}