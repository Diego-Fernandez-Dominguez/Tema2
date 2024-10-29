package boletin7;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		// Creo la variable que va a guardar el numero del usuario
		int num1;
		int num2=1;
		int contador=0;
		int contadorErrores=0;
		
		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que introduzca un número
		System.out.println("\nDíme un numero inicial: ");
		num1 = sc.nextInt();
		
		do {
			
			System.out.println("Díme un numero: ");
			num2=sc.nextInt();
			
			if (num2==0) {
				continue;
			}else if(num1>num2){
				System.out.println("Fallo es menor");
				contadorErrores++;
			}
			
			num1=num2;
			
			contador++;
			
		}while(num2!=0);
		
		System.out.println("Total de numeros introducidos: " + contador);
		System.out.println("Numeros fallados: " + contadorErrores);
		
		sc.close();
	}
}
