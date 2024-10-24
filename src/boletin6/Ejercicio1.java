package boletin6;

import java.util.Scanner;

public class Ejercicio1 {
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
		for (int i = 1; n >= i; i++) {

			// Saco i por pantalla
			System.out.println(i);
		}

		// Cierro el escaner
		sc.close();
		
	}

}
