package boletin1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		//Creo las variables de los numeros introducidos por el usuario
		int num1;
		int num2;
		
		//Creo el escaner para leer lineas escritas
		Scanner sc = new Scanner (System.in);
		
		//Pido el numero y el usuario lo pone
		System.out.println("Digame un numero");
		num1 = sc.nextInt();
		
		System.out.println("Digame otro numero");
		num2 = sc.nextInt();
		
		if (num1==num2) { //Comrpueba si los dos numero son iguales
			System.out.println("Sus dos numeros son iguales");
		} else {
			System.out.println("Sus dos numeros no son iguales");
		}
		
		//Cierro el escaner
		sc.close();
	}

}
