import java.util.Scanner;
import java.util.Random;

public class NG_Game
{

    public static void main(String[] args) {
        // Step 1: Display an introductory message
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100.");
        System.out.println("Your goal is to guess the number. Good luck!");

        // Step 2: Initialize random number and Scanner for user input
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        
        int userGuess = 0; // To store user's guess
        int attempts = 0;  // To keep track of the number of attempts

        // Step 5: Use a loop to allow multiple attempts until the correct number is guessed
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess (1 to 100): ");
            
            // Step 3: Validate user input and ensure it's within the specified range
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Invalid guess! Please enter a number between 1 and 100.");
                } else {
                    // Step 4: Compare user guess with the target number and provide feedback
                    if (userGuess > targetNumber) {
                        System.out.println("Too high! Try again.");
                    } else if (userGuess < targetNumber) {
                        System.out.println("Too low! Try again.");
                    } else {
                        // Step 6: Congratulate the user and show the number of attempts
                        System.out.println("Congratulations! You guessed the number correctly.");
                        System.out.println("It took you " + attempts + " attempts to guess the number.");
                    }
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
