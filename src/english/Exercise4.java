package english;

import java.util.Scanner;
import java.util.Random;

public class Exercise4 {
	public static void main(String[] args) {

		// I create the variable that is going to save the number introduced by the user
		int num = 0;

		// I create the variable that is going to save the secret random number
		int secretNumber;

		// I create the scanner to read the numbers introduced by the user
		Scanner sc = new Scanner(System.in);

		// I create the random to create the secret number
		Random rand = new Random();

		// The rand.nextInt generates the secret number, that is going to be between 1 and 100
		secretNumber = rand.nextInt(1, 101);

		// Until the number is different to -1 or the secret number, is going to repeat
		// the next loop
		while (num != -1 && num != secretNumber) {

			// Ask the user to introduce a number
			System.out.println("\nIntroduce a number");
			num = sc.nextInt();

			// If the users number is equal to the secret number, it means that the user won
			if (num == secretNumber) {
				System.out.println("\nCongratulations, you guessed it =-) ");

				// If the number is higher than the secret number, the program says it
			} else if (num > secretNumber) {
				System.out.println("\nYour number is higher than the secret number");

				// If the number is higher than the secret number, the program says it
			} else {
				System.out.println("\nYour number is lower than the secret number");
			}

		}

		// I print that the game has ended
		System.out.println("Game ended");

		// Close the scanner
		sc.close();

	}
}
