package boletin7;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		int num = 0;
		int contador;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		do {
			// Pido al usuario que introduzca un número
			System.out.println("\nDígame un número entre 1 y 20:");
			num = sc.nextInt();
		} while (num < 1 || num > 20);

		for (int i = 1; i <= num; i++) {

			System.out.println();
			contador = 1;

			for (int k = i; k >= contador; contador++) {

				System.out.print(k);

			}

		}

		sc.close();

	}
}