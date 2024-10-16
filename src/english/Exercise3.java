package english;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {

		// I create the variable that is going to save the number introduced by the user
		double height;

		double maxHeight = 0;

		double minHeight = 0;

		// I create the scanner to read the numbers introduced by the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to introduce a number
		System.out.println("Introduce a height");
		height = sc.nextDouble();
		maxHeight = height;
		minHeight = height;

		// Until the counter is less or equal than 10, is going to repeat the next loop
		while (height > 0) {

			// If the height is higher than the maxHeight, maxHeight change his values to
			// the height values
			if (height > maxHeight) {
				maxHeight = height;
			}

			// If the height is lower than the maxHeight, maxHeight change his values to the
			// height values
			if (height < minHeight) {
				minHeight = height;
			}

			// Ask the user to introduce another height
			System.out.println("Introduce another height");
			height = sc.nextDouble();

		};

		// If maxHeight is equal 0, it means that the user did not introduced any valid
		// height
		if (maxHeight == 0) {
			System.out.println("You didnt introduced any height");

			// If maxHeight is equal minHeight, it means that the user put the same values
		} else if (minHeight == maxHeight) {
			System.out.println("The heights you introduced are equal");

			// If it goes here, it means that everything is good
		} else {
			System.out.println("The tallest student measure " + maxHeight);
			System.out.println("The lowest student measure " + minHeight);
		}

		// Close the scanner
		sc.close();

	}
}
