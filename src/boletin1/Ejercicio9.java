package boletin1;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		//Creo las variables que van a guardar las peticiones de los jugadores
		String peticion1;
		String peticion2;
		
		//Creo el escaner para leer lo que pone el usuario
		Scanner sc = new Scanner (System.in);
		
		//Pido las peticiones y la escriben
		System.out.println("Eligan entre PIEDRA, PAPEL o TIJERA");
		peticion1 = sc.nextLine();
		peticion2 = sc.nextLine();
		
		if (!peticion1.equals("PIEDRA") && !peticion1.equals("PAPEL") && !peticion1.equals("TIJERA")){ //Compruebo si las peticiones del jugador 1 son validas
			System.out.println("La peticion del jugador 1 no es valida");
		} else if (!peticion2.equals("PIEDRA") && !peticion2.equals("PAPEL") && !peticion2.equals("TIJERA")) //Compruebo si las peticiones del jugador 1 son validas
			System.out.println("La peticion del jugador 2 no es valida");
		else if (peticion1.equals(peticion2)) //Compruebo si las 2 peticiones son iguales
			System.out.println("Empate");
		else if (peticion1.equals("PAPEL") && peticion2.equals("PIEDRA") || peticion1.equals("TIJERA") && peticion2.equals("PAPEL") || peticion1.equals("PIEDRA") && peticion2.equals("TIJERA")) 
			//Compruebo si el jugador 1 ha ganado
			System.out.println("Gana el jugador 1");
		else //Si se llega aqui significa que el jugador 2 es el que ha ganado
			System.out.println("Gana el jugador 2");

		//Cierro el escaner
		sc.close();
		
	}
}
