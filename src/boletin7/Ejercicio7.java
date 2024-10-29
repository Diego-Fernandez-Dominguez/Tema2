package boletin7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		// Coloque el numero 5, el resultado sera el siguiente:
		// 1
		// 121
		// 12321
		// 1234321
		// 123454321

		// Creo la variable que va a guardar el numero dado por el usuario
		int num;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que introduzca un número
		System.out.println("\nDígame un número");
		num = sc.nextInt();

		// Inicializo i como 1, mientras que num sea mayor o igual a i, le sumo 1 a i y
		// hago lo siguiente
		for (int i = 1; i <= num; i++) {

			// Inicializo el incremento como 1, mientra que el incremento sea menor que i va
			// a sumarse 1 e imprimirse a si mismo
			for (int incre = 1; incre < i; incre++) {
				System.out.print(incre);
			}

			// Inicializo el decremento como 1, mientra que el decremento sea mayor que 0 va
			// a restarse 1 e imprimirse a si mismo
			for (int decre = i; decre > 0; decre--) {
				System.out.print(decre);
			}

			// Cambio a la linea de abajo
			System.out.println();

		}

		// Cierro el escaner
		sc.close();

	}
}
