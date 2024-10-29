package boletin7;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Introduzca los numeros 100 y 50.
		// -El resultado sera 50 -

		// Creo las variables que van a guardar los numeros dados por el usuario
		int num1;
		int num2;

		// Creo la variable que va a guardar cual de los dos numeros es el menor
		int numMenor;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Pido a usuario que introduzca la
		System.out.println("\nDigame dos numeros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		// Si el num1 es mayor que el num2, va a guardar a num2 como el menor
		if (num1 > num2) {
			numMenor = num2;

			// Si llega hasta aqui, significa que num1 es menor, asi que lo guarda como el
			// numero menor
		} else {
			numMenor = num1;
		}

		// Mientras que el numero menor sea mayor a igual a 1, va a ir restandose uno
		// haciendo lo siguiente
		for (; numMenor >= 1; numMenor--) {

			// Si el resto de num1 y el numero menor es igual a 0 y el resto de num2 y el
			// numero menor es igual a 0 hace lo siguiente
			if (num1 % numMenor == 0 && num2 % numMenor == 0) {

				// Saca por pantalla el el maximo comun divisor
				System.out.println(numMenor);

				// Cambia el valor de numMenor a 1 para terminar el bucle
				numMenor = 1;
			}
		}

		// Cierro el escaner
		sc.close();

	}
}
