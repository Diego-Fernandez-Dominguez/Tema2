package boletin4;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero del usuario
		int edad;

		// Creo la variable que va a guardar la suma de los numeros
		int suma = 0;
				
		// Creo la variable que va a guardar la cantidad de numeros introducidos
		int contador = 0;
		int contMayor = 0;

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Le pido al usuario que introduzca un numero y este lo introduce
		System.out.println("Introduzca la edad de un alumno");
		edad = sc.nextInt();

		// Hasta que num no sea negativo, se va a repetir este bucle
		while (edad >= 0) {

			if (edad >= 18){
				contMayor++;
			}
			
			suma=suma+edad;
			
			// Le sumo 1 al contador
			contador++;
			// Vuelvo a pedir el numero al usuario
			System.out.println("\nIntroduzca la edad de un alumno");
			edad = sc.nextInt();

		}

		// Si llega aqui, el usuario ha puesto un numero acabado. Saco la cantidad por pantalla
		System.out.println("La suma de las edades es: " + suma );
		System.out.println("La media de las edades es: " + (double) suma / contador);
		System.out.println("Has introducido " + contador + " alumnos" );
		System.out.println(contMayor==0 ? "No se han introducido ningun alumno mayor de edad"
				:"Has introducido " + contMayor + " alumnos mayores de edad" );

		// Cierro el escaner
		sc.close();

	}

}