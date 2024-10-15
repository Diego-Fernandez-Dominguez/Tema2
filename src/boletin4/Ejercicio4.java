package boletin4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el numero del usuario
		int num = 0;

		// Creo la variable que va a guardar la suma de los numeros
		int suma = 0;
		
		double mediaNega=0;

		// Creo la variable que va a guardar la cantidad de numeros introducidos
		int contador = 0;
		int contPosi = 0;
		int contNega = 0;
		int contCero = 0;


		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Hasta que num no sea negativo, se va a repetir este bucle
		while (contador >10) {
			
			System.out.println("Introduzca un numero");
			num = sc.nextInt();

			if (num==0 ){
				contCero++;
			} else if (num>=0){
				suma=suma+num;
			} else {
				contNega++;
				mediaNega=(double) num/contNega;
			}
			
			contador++;

			// Vuelvo a pedir el numero al usuario
			System.out.println("\nIntroduzca un numero");
			num = sc.nextInt();

		}

		// Si llega aqui, el usuario ha puesto un numero acabado. Saa la cantidad por
		// pantalla
		System.out.println("La media es: " + (double) suma / contador);

		// Cierro el escaner
		sc.close();

	}

}