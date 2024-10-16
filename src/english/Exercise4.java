package english;

import java.util.Scanner;
import java.util.Random;

public class Exercise4 {
	public static void main(String[] args) {

		// I create the variable that is going to save the number introduced by the user
		int num=0;
		
		int secretNumber;
		
		// I create the scanner to read the numbers introduced by the user
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();


		System.out.println("\nIntroduce a number");
		num=sc.nextInt();
		secretNumber= rand.nextInt(1,101);

		// Until the counter is less or equal than 10, is going to repeat the next loop
		while (num != -1 || num==secretNumber) {

			
			if (num==secretNumber) {
				System.out.println("\nCongratulations, you guessed it =-) ");
				
			} else if(num>secretNumber) {
				System.out.println("\nYour number is higher than the secret number");
				
			} else {
				System.out.println("\nYour number is lower than the secret number");
			}

			System.out.println("\nIntroduce a number");
			num=sc.nextInt();
						
		}

		System.out.println("Game ended");

		// Close the scanner
		sc.close();

	}
}
