package boletin1;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		//Creo las variables de los numeros introducidos por el usuario
		double num1;
		double num2;
		double num3;

		//Creo el escaner para leer lineas escritas
		Scanner sc = new Scanner (System.in);
		
		//Pido los numeros y el usuario los pone
		System.out.println("Digame un numero");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		
		if (num1 + num2 == num3){ //Compruebo si la suma de num1 y num2 es igual a num3
			System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + num3);
		} else if (num1 + num3 == num2){ //Compruebo si la suma de num1 y num3 es igual a num2
			System.out.println("La suma de " + num1 + " y " + num3 + " es igual a " + num2);
		} else if (num2 + num3 == num1){  //Compruebo si la suma de num2 y num3 es igual a num1
				System.out.println("La suma de " + num2 + " y " + num3 + " es igual a " + num1);
		} else { //Si se llega aqui significa que ningun numero es la suma de los otros 2 numeros
			System.out.println("Ningun numero es igual a la suma de los otros dos numeros");
		}
		
		//Cierro el escaner
		sc.close();
	}
}