package boletin4;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero del usuario
		double altura;

		// Creo la variable que va a guardar la altura mas alta introducida por el
		// usuario
		double maxAltu;

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario que introduzca una altura
		System.out.println("Introduzca una altura");
		altura = sc.nextDouble();
		maxAltu = altura;

		// Hasta que el numero no sea distinto a -1, se va a ejecutar el siguiente bucle
		while (altura != -1) {

			// Compruebo si el numero introducido es mayor que la altura maxima, si es asi,
			// se cambia el valor a altura maxima por este
			if (altura > maxAltu) {
				maxAltu = altura;
			}

			// Le pido al usuario que introduzca otra altura
			System.out.println("Introduzca otra altura");
			altura = sc.nextDouble();

		}

		//Comrpuebo si se ha introducido alguna altura
		System.out.println(maxAltu != -1 ?"El arbol mas alto mide " + maxAltu + " cm"
				: "No se ha introducido ninguna altura");

		// Cierro el escaner
		sc.close();

	}

}