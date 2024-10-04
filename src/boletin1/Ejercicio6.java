package boletin1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Creo las variables de los numeros introducidos por el usuario
		int num1;
		int num2;
		int num3;
		
		//Creo el escaner para leer lineas escritas
		Scanner sc = new Scanner (System.in);
		
		//Pido el numero y el usuario lo pone
		System.out.println("Digame un numero");
		num1 = sc.nextInt();
		
		System.out.println("Digame otro numero");
		num2 = sc.nextInt();
		
		System.out.println("Digame otro numero");
		num3 = sc.nextInt();
		
		if (num1>num2 && num2>num3) {
			System.out.println(num1 + " > " + num2 + " > " + num3 );
			
		} else if (num1>num3 && num3>num2){
			System.out.println(num1 + " > " + num3 + " > " + num2);
		}
		
		//Cierro el escaner
		sc.close();
	}

}