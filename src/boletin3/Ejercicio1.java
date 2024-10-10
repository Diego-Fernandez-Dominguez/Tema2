package boletin3;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		//
		int num;
		int cifra1=0;
		int cifra2=0;
		int cifra3=0;
		int cifra4=0;
		
		//Creo el escaner para leer lo que pone el usuario.
		Scanner  sc = new Scanner (System.in);
		
		//Pido al usuario que introduzca el numero y lo leo
		System.out.println("Introduzca el numero capicua");
		num=sc.nextInt();
		
		//Si el numero es menor a 0 no puede ser capicua
		if (num<=0 || num > 9999){
			System.out.println("Numero no valido");
			
		//Compruebo si el numero tiene una unica cifra
		} else if (num < 10 ) {
			System.out.println("Su numero solamente tiene una cifra");
		
		//Compruebo si el numero tiene 2 cifras
		} else if (num < 100) {{
			cifra1= num /10; //Saco la primera cifra dividiendo num por 10
			cifra2= num %10; //Saco la segunda cifra haciendo el resto de num por 10
			
			//Si cifra1 y cifra2 son iguales significa que son capicuas
			} if (cifra1==cifra2) {
				System.out.println("Su numero es capicua");
			} else {
				System.out.println("Su numero no es capicua");
			}
			
			//Compruebo si el numero tiene 3 cifras
		} else if (num < 1000) {{
			cifra1= num /100; //Saco la primera cifra dividiendo num por 100
			cifra3= num %10; //Saco la tercera cifra haciendo el resto de num por 10
			
			//Si cifra1 y cifra3 son iguales significa que son capicuas
			} if (cifra1==cifra3) {
				System.out.println("Su numero es capicua");
			} else {
				System.out.println("Su numero no es capicua");
			}
			
		//Si ha llegado aqui, significa que el numero tiene 4 cifras
		} else {
			cifra1= num /1000;
			cifra2= (num / 100) %10;
			cifra3= (num / 10) %10;
			cifra4= num %10;

			//
			} if (cifra1==cifra4 && cifra2 == cifra3) {
				System.out.println("Su numero es capicua");
			} else {
				System.out.println("Su numero no es capicua");
			}
		
		//Cierro el escaner
		sc.close();
}
}