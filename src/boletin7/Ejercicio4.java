package boletin7;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		// Introduzca los numeros 100 y 50.
		// -El resultado sera 2 -
		
		// Creo las variables que van a guardar los numeros dados por el usuario
		int num1;
		int num2;

		// Creo la variable que va a guardar cual de los dos numeros es el menor
		int numMenor;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Pido a usuario que introduzca la nota
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

		// Mientras que i sea menor o igual que 0, se va a suma 1 y va a hacer lo
		// siguiente
		for (int i = 2; i <= numMenor; i++) {

			// Si i es mayor o igual al numero menor, va a poner por pantalla que los
			// numeros no comparten ningun multiplo
			if (i >= numMenor) {
				System.out.println("Los dos numeros no comparten ningun multiplo");
			}

			// Si el resto de num1 y el numero menor es igual a 0 y el resto de num2 y el
			// numero menor es igual a 0 hace lo siguiente
			if (num1 % i == 0 && num2 % i == 0) {

				// Saca por pantalla el el minimo comun multiplo
				System.out.println(i);

				// Cambia el valor de i al numMenor para terminar el bucle
				i = numMenor;
			}
		}

		// Cierro el escaner
		sc.close();

	}
}
