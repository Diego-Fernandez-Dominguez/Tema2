package english;

import java.util.Scanner;

public class Exercise1_2 {
	public static void main(String[] args) {

		// I create the variable that is going to save the number introduced by the user
		int hour;
		int min;
		int hourInver;
		int minInver;

		// I create the scanner to read the numbers introduced by the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to introduce a number
		System.out.println("Introduce the hour");
		hour = sc.nextInt();
		
		System.out.println("Introduce the minutes");
		min = sc.nextInt();

		if (min == 60) {
			minInver = 00;
		} else {
			minInver = (60 - min);
		}
		if (hour == 12) {
			hourInver = 12;
		} else {
			hourInver = (12 - hour);
		}

		System.out.println(hourInver + ":" + minInver);

		sc.close();
		
	}
}
