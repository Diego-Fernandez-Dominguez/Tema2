package boletin2;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		//Creo las variables de los numeros introducidos por el usuario
		double num1;
		double num2;
		
		//Creo la variable que va a guardar la eleccion del usuario
		String eleccion;
		
		//Creo el escaner para leer lo que pone el usuario
		Scanner  sc = new Scanner (System.in);
		
		//Pido dos numeros al usuario y este los introduce
		System.out.println("Dime dos numeros");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		
		//Pido al usuario que introduzca una operacion
		System.out.println("A. SUMAR LOS NUMERO");
		System.out.println("B. RESTAR LOS NUMEROS");
		System.out.println("C. MULTIPLICAR LOS NUMEROS");
		System.out.println("D. DIVIDIR LOS NUMEROS");
		eleccion=sc.next().toUpperCase();
		
		//Creo el switch para poder determinar la operacion elegida
		switch(eleccion) {
			
		//Realizo la suma
		case "A" ->
			System.out.println(num1+num2);
					
		//Realizo la resta
		case "B" ->
			System.out.println(num1-num2);
					
		//Realizo la multiplicacion
		case "C" ->
			System.out.println(num1*num2);
				
		//Realizo la division
		case "D" ->
			System.out.println(num1/num2);
		
		//Si llega aqui, la opcion elegida es incorrecta
		default ->
			System.out.println("Opcion incorrecta");
						}
		
		//Cierro el escaner
		sc.close();
		
}
}
