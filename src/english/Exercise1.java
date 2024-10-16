package english;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {

		// I create the variable that is going to save the number introduced by the user
		int num;

		// I create the scanner to read the numbers introduced by the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to introduce a number
		System.out.println("Introduce a number");
		num = sc.nextInt();

		// Until the number is greater than zero, is going to repeat this loop
		while (num >= 0) {

			// If the remainder of the number between two is zero, it means that the number
			// is even, if its not, it means that is odd
			System.out.println((num % 2 == 0) ? "The number " + num + " is even" : "The number " + num + " is odd");

			// Ask the user to introduce a number again
			System.out.println("\nIntroduce another number");
			num = sc.nextInt();

		}

		// If you get here, the user has entered a final number
		System.out.println("Finished program");

		// Close the scanner
		sc.close();

	}
}
