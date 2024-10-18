import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;  // Random number between 1 and 100

        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);
        int attempts = 5;  // Maximum attempts
        boolean isGuessed = false;

        System.out.println("Welcome to 'Guess the Number' Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have " + attempts + " attempts to guess it.");

        // Game loop
        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();

            if (playerGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number correctly.");
                isGuessed = true;
                break;
            } else if (playerGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            attempts--;
            System.out.println("Attempts remaining: " + attempts);
        }

        // Check if the player couldn't guess the number
        if (!isGuessed) {
            System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber);
        }

        // Close the scanner
        scanner.close();
    }
}
7