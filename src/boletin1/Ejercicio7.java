package boletin1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		//Creo las variables de los numeros introducidos por el usuario
		int num1;
		
		//Creo el escaner para leer lineas escritas
		Scanner sc = new Scanner (System.in);
		
		//Pido el numero y el usuario lo pone
		System.out.println("Digame un numero");
		num1 = sc.nextInt();
		
		if (num1 < 0 || num1 > 99999){ //Compruebo si el numero entra dentro de los limites
			System.out.println("Numero no valido, vuelva a introducirlo");
		} else if (num1 < 10){  //Compruebo si el numero es menor de 10, si es asi significa que el numero tiene 1 cifra
			System.out.println("El numero contiene 1 cifra");
		} else if (num1 < 100){ //Compruebo si el numero es menor de 100, si es asi significa que el numero tiene 2 cifra
			System.out.println("El numero contiene 2 cifras");
		} else if (num1 < 1000){ //Compruebo si el numero es menor de 1000, si es asi significa que el numero tiene 3 cifra
			System.out.println("El numero contiene 3 cifras");
		} else if (num1 < 10000){ //Compruebo si el numero es menor de 10000, si es asi significa que el numero tiene 4 cifra
			System.out.println("El numero contiene 4 cifras");
		} else { //Si se llega aqui significa que el numero tiene 5 cifras
			System.out.println("El numero contiene 5 cifras");
		}
		
		sc.close();
	}
}
