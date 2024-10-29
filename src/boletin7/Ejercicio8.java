package boletin7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		// Ponga como primer numero el 10, despues el 12, despues el 3 y posteriormente
		// el cero. El resultado sera el siguiente:
		// Díme un numero inicial:
		// 10
		// Díme un numero:
		// 12
		// Díme un numero:
		// 3
		// Fallo es menor
		// Díme un numero:
		// 0
		// Total de numeros introducidos: 2
		// Numeros fallados: 1

		// Creo la variable que va a guardar el numero del usuario
		int num1 = 1;

		// Creo la variable que va a guardar el segundo numero del usuario
		int num2 = 1;

		// Creo la variable que va a guardar el numero de numeros introducidos
		int contador = 0;

		// Creo la variable que va a guardar el numero de fallos introducidos
		int contadorErrores = 0;

		// Creo una variable por si hay un error en la ejecucion
		boolean error = false;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Hasta que error sea false, se va a repetir el siguiente bucle
		do {
			try {
				// Pido al usuario que introduzca un número
				System.out.println("\nDíme un numero inicial: ");
				num1 = sc.nextInt();

				// Pongo error como false
				error = false;

				// Si el programa detecta que es no es un int, sacara por pantalla el error,
				// vaciara el bufer de informacion y pone error como true
			} catch (InputMismatchException e) {
				System.err.println("El numero debe ser un entero");
				sc.nextLine();
				
				// Pongo error como true
				error = true;
			}
		} while (error);

		// Mientras que num2 sea diferente a 0, va a hacer lo siguiente
		do {

			// Le pido al usuario que introduzca un numero
			try {
				System.out.println("Díme un numero: ");
				num2 = sc.nextInt();

				// Pongo error como false
				error = false;

				// Si el programa detecta que es no es un int, sacara por pantalla el error,
				// vaciara el bufer de informacion y pone error como true
			} catch (InputMismatchException e) {
				System.err.println("El numero debe ser un entero");
				sc.nextLine();
				error = true;
			}

			// Si el numero es igual a 0, va a saltarse todo el if para terminar el bucle
			if (num2 == 0) {
				continue;

				// Si num1 es mayor que num2, saco por pantalla el texto "Fallo es menor" y le
				// sumo 1 al contador de errores
			} else if (num1 > num2) {
				System.out.println("Fallo es menor");
				contadorErrores++;
			}

			// Le cambio el valor a num1 para que tenga el valor de num2, para que se
			// actualize constantemente
			num1 = num2;

			// Le sumo 1 al contador
			contador++;

		} while (num2 != 0);

		// Saco los resultados por pantalla
		System.out.println("Total de numeros introducidos: " + contador);
		System.out.println("Numeros fallados: " + contadorErrores);

		// Cierro el escaner
		sc.close();
	}
}
