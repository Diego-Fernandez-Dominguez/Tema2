package boletin7;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		// Introduzca el numero 20 y el resultado sera el siguiente:
		// - 2, 3, 5, 7, 11,13, 17,19 -
		
		// Creo la variable que va a guardar el numero introducido por el usuario
		int num;

		// Creo la variable que va a guardar si el numero es primo o no
		boolean divisible;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que introduzca un número
		System.out.println("\nDígame un número:");
		num = sc.nextInt();

		//Mientras que j (inicia como 2) sea menor o igual que num, va a realizar lo siguiente
		for (int j = 2; j <= num; j++) {

			// Pongo divisible en verdadero
			divisible = true;

			//Mientras que i (inicia como 2) sea menor que j, va a realizar lo siguiente
			for (int i = 2; i < j; i++) {

				// Si el resto del i y j es 0, significa que el numero no es primo
				if (j % i == 0) {

					// Pongo divisible en falso
					divisible = false;

					// Pongo i con el valor de num para terminar el bucle
					i = num;

				}
			}

			// Si el numero es primo, lo saca por pantalla
			if (divisible) {
				System.out.println(j);
			}
		}

		// Cierro el escaner
		sc.close();
	}
}