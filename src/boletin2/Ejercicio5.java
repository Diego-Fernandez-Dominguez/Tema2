package boletin2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		//Creo las variables que van a guarda las tiradas del usuario
		String carnet;
		
		//Creo el escaner para leer lo que pone el usuario.
		Scanner  sc = new Scanner (System.in);
		
		//Le pido la primera tirada al usuario, y este lo introduce
		System.out.println("Digame el tipo de carnet");
		carnet=sc.nextLine().toUpperCase();
		
		//Creo el switch para identificar que escaner
		switch (carnet){
		case "E" ->
			System.out.println("Remolques");
			
		case "D" ->
		System.out.println("Autobuses");
		
		case "C1","C2","C3","C4","C5" ->
		System.out.println("Camiones");
		
		case "A" ->
		System.out.println("Motocicletas");
		
		case "B1","B2" ->
		System.out.println("Automoviles");
		
		default ->
		System.out.println("Carnet no valido");
		}
		
		//Cierro el escaner
		sc.close();
}
}
