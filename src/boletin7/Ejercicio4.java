package boletin7;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		int num1;
		int num2;
		
		int numMenor;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Pido a usuario que introduzca la nota
		System.out.println("\nDigame dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			numMenor = num2;
		} else {
			numMenor = num1;
		}
		
		for (int i = 2; i <= numMenor; i++) {

			if(i>=numMenor) {
				System.out.println("Los dos numeros no comparten ningun multiplo");
			}
			
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				i = numMenor;
			}
		}

		
		sc.close();

	}
}
