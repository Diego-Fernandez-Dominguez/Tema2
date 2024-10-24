package boletin6;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero introducido por el usuario
		int n;

		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario que introduzca un numero, y este lo hac
		System.out.println("Introduzca un numero");
		n = sc.nextInt();

		// Creo la variable i, mientras que i sea menor que n, con incremento de i de 1
		// va a hacer lo siguiente:
		for (int i = 1; n >= i; i += 3) {

			// Saco i por pantalla
			System.out.println(i);

			// Si i es igual a 1 (Esto sirve para que saque 1 por pantalla la primera vez)
			// saca 1 por pantalla y le suma 2
			if (i == 1)
				i--;
		}

		// Cierro el escaner
		sc.close();

	}

}
