package boletin3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		//Creo la variable que va a guardar el numero dado por el usuario
		double num;
		
		//Creo la variable que va a guardar el valor absoluto del numero dado por el usuario
		int absoluto;
		
		 // Crear un objeto Scanner para leer la entrada del usuario
	    Scanner sc = new Scanner(System.in);
	
	    // Solicitar número al usuario
	    System.out.print("Introduce un número");
	    num = sc.nextDouble();
	
	    // Calcular el valor absoluto usando el operador ternario
	    absoluto = (int) ((num >= 0) ? num: -num) ;
	
	    // Mostrar el resultado
	    System.out.println("El valor absoluto de " + num + " es " + absoluto);
	    
	    //Cierro el escaner
	    sc.close();
}
}

