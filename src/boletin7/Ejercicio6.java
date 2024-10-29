package boletin7;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero introducido por el usuario
		int num;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que introduzca un número
		System.out.println("\nDígame un número");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			// Este for va a poner los espacios antes de los asteriscos, para eso va a hacer
			// que el numero de espacios sea el numero dado por el usuario menos i
			for (int espacioInter = 0; espacioInter < num - i; espacioInter++) {
				System.out.print(" ");
			}
 
			// Este for va a poner los asteriscos necesarios para que se forme la piramide
			// de forma correcta
			for (int asteriscos = 0; asteriscos < i; asteriscos++) {
				System.out.print("* ");
			}

			// Separo las lineas para que la piramide este separadas por lineas
			System.out.println(" ");
		}

		// Cierro el escaner
		sc.close();
	}
}