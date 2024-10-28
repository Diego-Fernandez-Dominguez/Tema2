package english;

import java.util.Scanner;

public class Exercise2_2 {
	public static void main(String[] args) {
		
		final double cents1=0.01;
		int cents1Count=0;
		final double cents2=0.02;
		int cents2Count=0;
		final double cents50=0.5;
		int cents50Count=0;
		final double cents20=0.2;
		int cents20Count=0;
		final double cents10=0.1;
		int cents10Count=0;
		final double cents5=0.05;
		int cents5Count=0;
		final int euros2=2;
		int euros2Count=0;
		final int euros1=1;
		int euros1Count=0;
		double payment;
		double money; 
		double rest;
		double totalMoney;
		
		
		
		// I create the scanner to read the numbers introduced by the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to introduce a number
		System.out.println("Introduce which amount of money you must to pay");
		payment= sc.nextDouble();
		
		System.out.println("Now introduce which amount of money you have to pay");
		money=sc.nextDouble();
		
		rest=money-payment;
		
		totalMoney=money;
		while (totalMoney>euros2) {
			totalMoney=rest-euros2;
			euros2Count++;
		}
		while (money>euros1) {
			totalMoney=rest-euros1;
			euros1Count++;
		}
		while (money>cents50) {
			totalMoney=rest-cents50;
			cents50Count++;
		}
		while (money>cents20) {
			totalMoney=rest-cents20;
			cents20Count++;
		}
		while (money>cents10) {
			totalMoney=rest-cents10;
			cents10Count++;
		}
		while (money>cents5) {
			totalMoney=rest-cents5;
			cents5Count++;
		}
		while (money>cents2) {
			totalMoney=rest-cents2;
			cents2Count++;
		}
		while (money>cents1) {
			totalMoney=rest-cents1;
			cents1Count++;
		}
			
		System.out.print("Your change is "+euros2Count+" coins of 2€");
		System.out.print(euros1Count+" coins of 1€");
		System.out.print(cents50Count+" coins of 0.5€");
		System.out.print(cents20Count+" coins of 0.2€");
		System.out.print(cents10Count+" coins of 0.1€");
		System.out.print(cents5Count+" coins of 0.05€");
		System.out.print(cents2Count+" coins of 0.02€");
		System.out.print(cents1Count+" coins of 0.01€");
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
