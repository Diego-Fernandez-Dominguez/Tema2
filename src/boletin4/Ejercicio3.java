package boletin4;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero del usuario
		int num = 0;

		// Creo la variable que va a guardar la suma de los numeros
		int suma = 0;

		// Creo la variable que va a guardar la cantidad de numeros introducidos
		int contador = 0;

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario que introduzca un numero y este lo introduce
		System.out.println("Introduzca un numero");
		num = sc.nextInt();

		// Hasta que num no sea negativo, se va a repetir este bucle
		while (num >= 0) {

			// Le sumo 1 al contador
			contador++;

			// Sumo los numeros
			suma = suma + num;

			// Vuelvo a pedir el numero al usuario
			System.out.println("\nIntroduzca un numero");
			num = sc.nextInt();

		}

		// Si llega aqui, el usuario ha puesto un numero acabado. Saco la cantidad por pantalla
		System.out.println("La media es: " + (double) suma / contador);

		// Cierro el escaner
		sc.close();

	}

}
