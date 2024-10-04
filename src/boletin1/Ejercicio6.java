package boletin1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Creo las variables de los numeros introducidos por el usuario
		int a;
		int b;
		int c;
		int x;
		
		//Creo el escaner para leer lineas escritas
		Scanner sc = new Scanner (System.in);
		
		//Pido el numero y el usuario lo pone
		System.out.println("Digame un numero");
		a = sc.nextInt();
		
		System.out.println("Digame otro numero");
		b = sc.nextInt();
		
		System.out.println("Digame otro numero");
		c = sc.nextInt();
		
		System.out.println("Digame otro numero");
		x = sc.nextInt();
		
		System.out.println(a + b + c + x);
		
		//Cierro el escaner
		sc.close();
	}

}