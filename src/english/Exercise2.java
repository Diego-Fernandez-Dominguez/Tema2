package english;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

		// I create the variable that is going to save the number introduced by the user
		int num;

		//I create the counter that is going to tell the number of the table
		int counter=0;
		
		// I create the scanner to read the numbers introduced by the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to introduce a number
		System.out.println("Introduce a number");
		num = sc.nextInt();

		// Until the counter is less or equal than 10, is going to repeat the next loop
		while (counter <= 10) {

			System.out.println(counter + " x " + num + " = " + counter*num );
			
			counter++;

		}

		// Close the scanner
		sc.close();

	}
}
