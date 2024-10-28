package boletin7;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {

		int num;
		int num2;
		int cont = 1;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		do {
		// Pido al usuario que introduzca un número
		System.out.println("\nDíme un numero: ");
		num = sc.nextInt();
		num2 = num;
		} while(num<0);

		while (num2 > 9) {

			num2 = num2 / 10;
			cont++;

		}

		System.out.println("El numero tiene " + cont + " cifras");

		sc.close();
	}
}
