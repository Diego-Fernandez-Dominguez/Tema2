package boletin1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		//Creo las variables de los numeros introducidos por el usuario
		double num1;
		double num2;
		
		//Creo el escaner para leer lineas escritas
		Scanner sc = new Scanner (System.in);
		
		//Pido el numero y el usuario lo pone
		System.out.println("Digame un numero");
		num1 = sc.nextDouble();
		
		System.out.println("Digame otro numero");
		num2 = sc.nextDouble();
		
		if (num1>num2) { //Comrpuebo cual de los dos numeros es el mas grande
			System.out.println(num2 + " < " + num1  );
		} else if (num2>num1){
			System.out.println(num1 + " < " + num2  );
		}	else {
			System.out.println(num1 + " = " + num2);
		}
		
		//Cierro el escaner
		sc.close();
	}

}