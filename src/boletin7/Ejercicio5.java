package boletin7;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero introducido por el usuario
		int num = 0;

		// Creo la variable que va a contar
		int contador;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Mientras que el numero sea menor que 1 o mayor que 20, va a repetir lo
		// siguiente
		do {
			// Pido al usuario que introduzca un número y el escaner lo lee
			System.out.println("\nDígame un número entre 1 y 20:");
			num = sc.nextInt();
		} while (num < 1 || num > 20);

		// Mientras que i sea menor o igual a num, va a suma 1 a i y va a hacer lo
		// siguiente
		for (int i = 1; i <= num; i++) {

			// Saca por pantalla una linea en blanco
			System.out.println();

			// Guarda contador con el valor 1
			contador = 1;

			// Inicializa la variable k como i, y, mientras que k sea mayor o igual al
			// contador, le va a sumar 1 al contador y va a hacer lo siguiente
			for (int k = i; k >= contador; contador++) {

				// Saco por pantalla k
				System.out.print(k);

			}

		}

		// Cierro el escaner
		sc.close();

	}
}