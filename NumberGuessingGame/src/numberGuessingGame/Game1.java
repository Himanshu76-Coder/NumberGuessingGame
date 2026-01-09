// Number Guessing Game with Unlimited Attempts and Total Attempts Tracking

package numberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	// Method to run the number guessing game
	public static void guessingNumberGame() {

		// Display game title at the start
		System.out.println("=================================");
		System.out.println("     NUMBER GUESSING GAME");
		System.out.println("          GAME STARTS");
		System.out.println("=================================\n");

		// Create Scanner object to read user input
		Scanner sc = new Scanner(System.in);

		// Create Random object to generate random numbers
		Random random = new Random();

		// Generate a random number between 1 and 100
		int randomNumber = random.nextInt(100) + 1;

		// Initialize counter for total attempts
		int totalAttempts = 0;

		// Display game instructions
		System.out.println("A number is chosen between 1 and 100.");
		System.out.println("Find the correct number to complete the game.\n");

		// Continuous guessing loop until the player guesses correctly
		while (true) {

			// Prompt the user to enter a guess
			System.out.print("Enter your guess: ");
			int userGuess = sc.nextInt();

			// Increment total attempts
			totalAttempts++;

			// Check if the guess is correct
			if (userGuess == randomNumber) {
				System.out.println("\nCongratulations! You won the game.");
				System.out.println("You guessed the correct number.");
				System.out.println("Total attempts taken: " + totalAttempts);
				System.out.println("\n========== GAME OVER ==========");
				break; // Exit the loop and end the game
			}

			// Provide a hint if the guess is too low
			if (userGuess < randomNumber) {
				System.out.println("The number is greater than " + userGuess + "\n");
			} 
			// Provide a hint if the guess is too high
			else {
				System.out.println("The number is less than " + userGuess + "\n");
			}
		}

		// Close the scanner to free system resources
		sc.close();
	}

	// Main method – program execution starts here
	public static void main(String[] args) {
		guessingNumberGame();
	}
	
}

