package boletin1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		//Creo la variable del numero introducidos por el usuario
		double num1;
		
		//Creo el escaner para leer lineas escritas
		Scanner sc = new Scanner (System.in);
		
		//Pido el numero y el usuario lo pone
		System.out.println("Digame un numero");
		num1 = sc.nextDouble();

		if (num1>=1 || num1<=-1 || num1==0) { //Compruebo si el numero se encuentra en el intervalo de 1, -1 o es 0
			System.out.println("Su numero no es un casi cero");
		} else {
			System.out.println("Su numero es un casi cero");
		}
		
		//Cierro el escaner
		sc.close();
	}

}
