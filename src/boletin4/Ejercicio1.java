package boletin4;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero del usuario
		int num;

		// Creo la variable que va a guardar la suma de los numeros
		int suma = 0;

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario que introduzca un numero y este lo introduce
		System.out.println("Introduzca un numero");
		num = sc.nextInt();

		// Hasta que num no sea negativo, se va a repetir este bucle
		while (num >= 0) {
			
			//Saco por pantalla un texto para poner bonito el resultado
			System.out.println("\nLa suma de " + num + " y " + suma + " es igual a");
			
			//Realizo la suma de los numeros
			suma = suma + num;

			//Saco por pantalla el resultado
			System.out.println(suma);
			
			//Vuelvo a pedir el numero al usuario
			System.out.println("\nIntroduzca un numero");
			num = sc.nextInt();

		}

		//Si llega aqui, el usuario ha puesto un numero acabado
		System.out.println("Programa acabado");

		// Cierro el escaner
		sc.close();

	}

}
