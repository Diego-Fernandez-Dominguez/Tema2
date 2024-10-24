package boletin6;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar las notas introducidos por el usuario
		int num;

		// Creo la variable que va a guardar si hay algun el numero es primo
		boolean divisible = false;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Pido a usuario que introduzca la nota
		System.out.println("\nDigame un numero y te digo si es primo");
		num = sc.nextInt();

		
		// Inicializo la variable i a 1, hasta que i no sea mayor o igual que num se va
		// a repetir y le voy sumando 1 a i
		for (int i = 1; i <= num; i++) {
			
			if (num == 1 ) 
				divisible=true;
			
			// Si i es igual a 1 o igual a num no no entra en el if
			if (i != num)

				// Si el resto de i entre num es igual a 0, pongo que el numero si es divisible
				// y le cambio el valor a i para que no vuelva a comprobar el for
				if (num % i == 0) {
					divisible = true;
					i = num;
				}

		}

		// Si divisible es igual a true significa que el numero no es primo lo dirá por
		// pantalla, si no es así pondra que el numero es primo
		System.out.println(divisible == true ? "\nEl numero no es primo" : "\nEl numero es primo");

		// Cierro el escaner
		sc.close();

	}
}
