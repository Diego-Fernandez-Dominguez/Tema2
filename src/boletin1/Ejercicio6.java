package boletin1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Creo las variables de los numeros introducidos por el usuario
		double numA;
		double numB;
		double numC;
		
		//Creo las variables de las posibles soluciones de la ecuacion
		double solucion1;
		double solucion2;
		
		//Creo las variable para descubrir cuantas soluciones reales tiene la ecuacion
		double discriminante;
		
		//Creo el escaner para leer lineas escritas
		Scanner sc = new Scanner (System.in);
		
		//Pido el numero y el usuario lo pone
		System.out.println("Digame 'a', 'b' y 'c'");
		numA = sc.nextDouble();
		numB = sc.nextDouble();
		numC = sc.nextDouble();
				
		//Calculo el discriminate, para saber cuantas soluciones reales tiene
		discriminante = Math.pow(numB, 2) - 4 * numA * numC;
		
		if (discriminante == 0) { //Si el discriminante es cero, solo tiene una solucion real
			solucion1 = -numB / (2 * numA);
	         System.out.println("x = " + solucion1);
		} else if (discriminante > 0 ) { //Si el discriminante es mayo que cero, tiene 2 soluciones reales
			solucion1 =  (-numB + Math.sqrt(discriminante) ) / (2 * numA);
			solucion2 =  (-numB - Math.sqrt(discriminante) ) / (2 * numA);
	        System.out.println("x = " + solucion1 + " | x2 = " + solucion2 );
		} else { //Si no se han cumplido ninguna de las otras 2 posibilidades, significa que no tiene soluciones reales
			System.out.println("No hay solucion real");
		}
		
		//Cierro el escaner
		sc.close();
	}

}