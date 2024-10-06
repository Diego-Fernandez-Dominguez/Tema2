package boletin1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Creo las variables de los numeros introducidos por el usuario
		double a;
		double b;
		double c;
		double x;
		double x2;
		double discriminante;
		
		//Creo el escaner para leer lineas escritas
		Scanner sc = new Scanner (System.in);
		
		//Pido el numero y el usuario lo pone
		System.out.println("Digame 'a', 'b' y 'c'");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
				
		//Calculo el discriminate, para saber cuantas soluciones reales tiene
		discriminante = Math.pow(b, 2) - 4 * a * c;
		
		if (discriminante == 0) { //Si el discriminante es cero, solo tiene una solucion real
			 x = -b / (2 * a);
	         System.out.println("x = " + x);
		} else if (discriminante > 0 ) { //Si el discriminante es mayo que cero, tiene 2 soluciones reales
			x =  (-b + Math.sqrt(discriminante) ) / (2 * a);
			x2 =  (-b - Math.sqrt(discriminante) ) / (2 * a);
	        System.out.println("x = " + x + " | x2 = " + x2 );
		} else { //Si no se han cumplido ninguna de las otras 2 posibilidades, significa que no tiene soluciones reales
			System.out.println("No hay solucion real");
		}
		
		//Cierro el escaner
		sc.close();
	}

}