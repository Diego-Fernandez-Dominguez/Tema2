package boletin4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero del usuario
		int num;

		// Creo la variable que va a guardar la suma de los numeros
		int sumaPosi = 0;

		double sumaNega = 0;

		// Creo la variable que va a guardar la cantidad de numeros introducidos ed cada
		// tipo
		int contador = 1;
		int contNega = 0;
		int contCero = 0;

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Hasta que contador no sea igual o mayor que 10, se va a repetir este bucle
		while (contador <= 10) {

			// Le pido al usuario que introduzca un numero
			System.out.println("Introduzca un numero");
			num = sc.nextInt();

			// Si el numero es mayor que 0, suma el numero con los anteriores positivoss
			if (num > 0) {
				sumaPosi = sumaPosi + num;

				/*
				 * Si el numero es negativo, le suma 1 al contador de negativos y realiza la
				 * media de estos
				 */
			} else if (num < 0) {
				contNega++;
				sumaNega = num + sumaNega;

				// Si el numero es igual a 0, le suma 1 al contador de ceros
			} else {
				contCero++;

			}

			// Le sumo 1 al contador general
			contador++;

		}

		// Saco todos los resultados por pantalla
		System.out.println("La suma de los positivos es: " + sumaPosi);
		
		//Compruebo si se han iontroducido negativos, si es asi hago la media
		System.out.println(contNega == 0 ? "No se han introducido negativos" 
				:"La media de los negativos es: " + (double) sumaNega / contNega);
		System.out.println("Has introducido " + contCero + " cero/s");

		// Cierro el escaner
		sc.close();

	}

}