package boletin6;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		// Creo las variables que van a guardar los numeros introducidos por el usuario
		int numA;
		int numB;

		// Creo el escaner que va a permitir leer lo que introduce el usuario
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que introduzca dos numeros y este lo hace
		System.out.println("Introduzca dos numeros");
		numA = sc.nextInt();
		numB = sc.nextInt();

		// Si los dos numero son iguales, entra en este if y lo poner por pantalla
		if (numA == numB) {
			System.out.println("Los dos numeros son iguales");

			// Si cualquiera de los dos numeros es igual al otro pero +1, significa que no
			// tiene ningun intermedio
		} else if (numA == numB + 1 || numB == numA + 1) {
			System.out.println("Los numeros no tienen intermedio");

			// Si numA es mayor a numB, saca por pantalla los numeros que hay entre numB y
			// numA
		} else if (numA > numB) {
			for (int i = numB + 1; i != numA; i++) {
				System.out.println(i);
			}

			// Si ha llegado aqui, significa que numB es mayor a numA, saca por pantalla los
			// numeros que hay entre numA y numB
		} else {
			for (int i = numA + 1; i != numB; i++) {
				System.out.println(i);
			}
		}

		// Cierro el escaner
		sc.close();

	}
}
