package boletin4;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero del usuario
		int num;

		//Creo la variable que va a guardar la cantidad de numeros introducidos
		int contador = 0;

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario que introduzca un numero y este lo introduce
		System.out.println("Introduzca un numero");
		num = sc.nextInt();

		// Hasta que num no sea negativo, se va a repetir este bucle
		while (num >= 0) {
			
			//Le sumo 1 al contador
			contador++;
			
			//Vuelvo a pedir el numero al usuario
			System.out.println("\nIntroduzca un numero");
			num = sc.nextInt();

		}

		//Si llega aqui, el usuario ha puesto un numero acabado. Saa la cantidad por pantalla
		System.out.println("Has colocado" + contador);

		// Cierro el escaner
		sc.close();

	}

}
