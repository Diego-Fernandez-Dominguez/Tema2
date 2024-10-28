package boletin7;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		int num;
		int contadorEspa;
		int contador;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que introduzca un número
		System.out.println("\nDígame un número");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println();
			contador = 1;
			contadorEspa = 1;

			for (int k = i; k >= contador; contador++) {

				System.out.print(" * ");

				for (int j = i; j >= contadorEspa; contadorEspa++) {

					System.out.print(" ");
				}
			}
		}
	}
}