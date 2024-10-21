package boletin5;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		// Creo las variables que van a guardar los numeros introducidos por el usuario
		int num1;
		int num2;

		// Creo la variable que va a guardar la eleccion del menu puesta por el jugador
		String eleccion;

		// Creo el escaner que va a permitir leer lo que ponga el usuario
		Scanner sc = new Scanner(System.in);

		do {

			// Le pido al usuario que introduzca 2 numeros
			System.out.println("\nIntroduzca 2 numeros");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			// Pido al usuario que eliga una opcion de dentro del menu
			System.out.println(
					"\nA. SUMAR LOS NÚMEROS \nB. RESTAR LOS NÚMEROS \nC. MULTIPLICAR LOS NÚMEROS \nD. DIVIDIR LOS NÚMEROS \nE. SALIR");
			eleccion = sc.next().toUpperCase();

			//Compruebo cual es la eleccion del jugador con el case, y, realizo la accion necesaria 
			switch (eleccion) {
			case "A" -> {
				System.out.println("\nSuma: " + (num1 + num2));
			}
			case "B" -> {
				System.out.println("\nResta: " + (num1 - num2));
			}
			case "C" -> {
				System.out.println("\nMultiplicacion: " + (num1 * num2));
			}
			case "D" -> {
				System.out.println("\nDivision: " + (num1 / num2));
			}
			case "E" -> {
				System.out.println("-Has elegido salirte del programa-");
			}
			default -> {
				System.out.println("\nOpcion no valida");
			}
			}

		} while (eleccion.equalsIgnoreCase("E") == false);

		// Termino el programa
		System.out.println("\nPrograma terminado");

		// Cierro el escaner
		sc.close();
	}
}