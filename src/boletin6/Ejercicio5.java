package boletin6;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero introducido por el usuario
		int limite;

		// Creo la variable que va a guardar el factorial del numero
		int facto = 1;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Pido a usuario que el limite
		System.out.println("\nDigame un numerin");
		limite = sc.nextInt();

		// Creo la variable i que va a ser igual al limite, mientras que i sea mayor
		// o igual a 1 se va a repetir el bucle y le voy a ir restando de uno en uno a
		// num
		for (int i = limite; i >= 1; i--) {

			// Hago el factorial del numero
			facto = facto * i;

		}

		//Saco el factorial por pantalla
		System.out.println(limite + "! = " + facto);

		// Cierro el escaner
		sc.close();

	}
}
