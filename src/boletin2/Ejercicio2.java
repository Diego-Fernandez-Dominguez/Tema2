package boletin2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		//Creo la variable que va a guardar el numero introducido por el usuario
		int dia;
		
		//Creo el escaner para leer lo que pone el usuario
		Scanner  sc = new Scanner (System.in);
		
		//Le pido al usuario que introduzca una nota y el la pone
		System.out.println("Dime un numero del 1 al 7");
		dia=sc.nextInt();
		
		//Creo el switch para poder determinar el dia de la semana
		switch(dia) {
		
		//Si el numero es 1 es lunes
		case 1 ->
			System.out.println("Lunes");
		
		//Si el numero es 2 es martes
		case 2 ->
			System.out.println("Martes");
			
		//Si el numero es 3 es miercoles
		case 3 ->
			System.out.println("Miercoles");
			
		//Si el numero es 4 es jueves
		case 4 ->
			System.out.println("Jueves");
			
		//Si el numero es 5 es viernes
		case 5 ->
			System.out.println("Viernes");
			
		//Si el numero es 6 es sabado
		case 6 ->
			System.out.println("Sabado");
			
		//Si el numero es 7 es domingo
		case 7 ->
			System.out.println("Domingo");
			
		//Si el numero no concuerda, el numero introducido es incorrecto
		default ->
			System.out.println("Numero incorrecto");
		}
		
		//Cierro el escaner
		sc.close();
		
	}
}
