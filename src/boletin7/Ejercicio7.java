package boletin7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		int num;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que introduzca un número
		System.out.println("\nDígame un número");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int incre = 1; incre < i; incre++) {
				System.out.print(incre);
			}

			for (int decre = i; decre > 0; decre--) {
				System.out.print(decre);
			}

			System.out.println();

		}

		sc.close();

	}
}
