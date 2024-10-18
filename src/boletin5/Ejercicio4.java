package boletin5;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {

		//Creo la variable que va a guardar el numero introducido por el usuario
		int num;

		//Creo el contador que va a contar el numero por el que se multiplica num
		int cont=0;
		
		// Creo el escaner
		Scanner sc = new Scanner(System.in);

		// Pido al usuario que introduzca un numero, y este lo hace
		System.out.println("Introduce a number");
		num = sc.nextInt();

		//Mientras que el contador sea menor o igual que 10 hace lo siguiente
		do {
			//Saco por pantalla la multiplicacion-
			System.out.println(cont + " x " + num + " = " + cont*num );
			
			//Le sumo 1 al contador
			cont++;
		}while (cont <= 10);

		// Close the scanner
		sc.close();

	}
}



