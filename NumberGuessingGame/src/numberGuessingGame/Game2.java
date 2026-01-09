// Number Guessing Game with Limited Attempts and Hints for Each Guess

package numberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	// Method to run the number guessing game
	public static void guessingNumberGame() {

		// Display game title at the start
		System.out.println("=================================");
		System.out.println("     NUMBER GUESSING GAME");
		System.out.println("          GAME STARTS");
		System.out.println("=================================\n");

		// Scanner object to read user input from console
		Scanner sc = new Scanner(System.in);

		// Random object to generate random numbers
		Random random = new Random();

		// Generate a random number between 1 and 100
		int randomNumber = random.nextInt(100) + 1;

		// Maximum number of attempts allowed
		int maxAttempts = 10;

		// Display game instructions
		System.out.println("A number is chosen between 1 and 100.");
		System.out.println("You have " + maxAttempts + " attempts to guess the correct number.\n");

		// Loop through each attempt
		for (int attempt = 1; attempt <= maxAttempts; attempt++) {

			// Prompt the user to enter a guess with attempt number
			System.out.print("Guess " + attempt + " - Enter your number: ");
			int userGuess = sc.nextInt();

			// Check if the guess is correct
			if (userGuess == randomNumber) {
				System.out.println("\nCongratulations! You won the game.");
				System.out.println("You guessed the correct number.");
				System.out.println("\n========== GAME OVER ==========");
				sc.close();
				return; // End the game immediately after correct guess
			}

			// Provide hint if the guess is too low
			if (userGuess < randomNumber) {
				System.out.println("The number is greater than " + userGuess + "\n");
			} 
			// Provide hint if the guess is too high
			else {
				System.out.println("The number is less than " + userGuess + "\n");
			}
		}

		// Message when the player runs out of attempts
		System.out.println("No more attempts are left.");
		System.out.println("You lost this time. Better luck next time!");
		System.out.println("The correct number was: " + randomNumber);

		// Final game over message
		System.out.println("\n========== GAME OVER ==========");

		// Close the scanner resource
		sc.close();
	}

	// Main method – program execution starts here
	public static void main(String[] args) {
		guessingNumberGame();
	}
	
}

