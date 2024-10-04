package boletin1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		//Creo la variable del numero introducido por el usuario
		int num;
		
		//Creo el escaner para leer lineas escritas
		Scanner sc = new Scanner (System.in);
		
		//Pido el numero y el usuario lo pone
		System.out.println("Digame un numero");
		num = sc.nextInt();
		
		if (num%2==0) { //Si el resto de num es 0 significa que es par
			System.out.println("Su numero es par");
		} else {
			System.out.println("Su numero es impar");
		}
		
		//Cierro el escaner
		sc.close();
	}
}
