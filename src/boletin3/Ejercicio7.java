package boletin3;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		//Creo las variables que van a guardar los datos introducidos por el usuario
		int dias;
		int distancia;
		
		//Creo la variable que va a guardar el precio
		double precio;
		
		//Creo la constante que va a guardar el descuento que se puede aplicar al precio
		final double REDUCCION = 0.30;
		
		//Creo la constante que va a guardar el precio por kilometro
		final double PRECIO_KM = 2.5;
		
		 // Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc= new Scanner(System.in);
		
		//Pido los dias de estancia y el usuario la introduce
		System.out.println("Introduzca los dias de instancia");
		
		dias=sc.nextInt();
		
		//Pido la distancia y el usuario la introduce
		System.out.println("Introduzca la distancia");
		distancia=sc.nextInt();

		//Calculo el precio multiplicando la distancia por el precio por kilometro
		precio = distancia * PRECIO_KM;
		
		//Compruebo si es aplicable el descuento por estancia y distancia, si es asi, cambio la variable precio al precio con descuento
		precio= (dias > 7 && distancia > 800) ? precio-(precio*REDUCCION) : precio;
		
		//Saco por pantalla el resultado
		System.out.println(precio);
		
		//Cierro el escaner
		sc.close();
		}
}
