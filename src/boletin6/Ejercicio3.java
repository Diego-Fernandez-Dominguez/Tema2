package boletin6;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero introducido por el usuario
		int num;

		// Creo la variable que va a guardar el la suma de los numeros introducidos por
		// el usuario
		int suma = 0;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Este bucle se repetira hasta que el bucle se repita 10 veces
		for (int i = 1; i <= 10; i++) {

			// Pido al usuario que introduzca un numero, y este lo hace
			System.out.println("\nDigame un numerin");
			num = sc.nextInt();

			// Hago la suma de los numero dados anteriormente y el nuevo
			suma = num + suma;

		}

		// Saco la media por pantalla
		System.out.println("\nLa media: " + ((double)suma / 10));

		// Cierro el escaner
		sc.close();
	}
}
