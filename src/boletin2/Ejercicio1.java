package boletin2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
	
		//Creo la variable que va a guardar el numero introducido por el usuario
		int nota;
		
		//Creo el escaner para leer lo que pone el usuario
		Scanner  sc = new Scanner (System.in);
		
		//Le pido al usuario que introduzca una nota y el la pone
		System.out.println("Dime una nota");
		nota=sc.nextInt();
		
		//Creo el switch para poder determinar la nota del usuario
		switch(nota) {
		
		//Si la nota se ecuentra en el rango 1-4 es un insuficiente
		case 0,1,2,3,4 :
			System.out.println("Insuficiente");
			
		//Si la nota es un 5 es un suficiente
		case 5 :
			System.out.println("Suficiente");
			
		//Si la nota es un 6 es un bien
		case 6 :
			System.out.println("Bien");
			
		//Si la nota es un 7 o un 8 es un notable
		case 7,8:
			System.out.println("Notable");
			
		//Si la nota es un 9 o un 10 es un sobresaliente
		case 9,10:
			System.out.println("Sobresaliente");
		
		//Si la nota no concuerda con ninguna, la nota introducida es incorrecta
		default :
			System.out.println("Nota incorrecta");

		}
		
		//Cierro el escaner
		sc.close();
}
}
