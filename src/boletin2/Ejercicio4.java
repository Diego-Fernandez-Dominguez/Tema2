package boletin2;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		//Creo las variables que van a guarda las tiradas del usuario
		String tirada1;
		String tirada2;
		
		//Creo las variables que van a guardar la conversion de las tiradas de cadena a entero
		int num1;
		int num2;
		
		//Creo el escaner para leer lo que pone el usuario.
		Scanner  sc = new Scanner (System.in);
		
		//Le pido la primera tirada al usuario, y este lo introduce
		System.out.println("Cuanto has sacado en la primera tirada");
		tirada1=sc.nextLine().toUpperCase();
		
		//Le pido la segunda tirada al usuario, y este lo introduce
		System.out.println("Cuanto has sacado en la segunda tirada");
		tirada2=sc.nextLine().toUpperCase();
		
		//Creo el switch para poder cambiar la cadena a un entero
		num1 = switch(tirada1) {
		case "UNO" ->{
		 yield 1;
		}
		case "DOS" ->{
		 yield 2;
		}
		case "TRES" ->{
		 yield 3;
		}
		case "CUATRO" ->{
		 yield 4;
		}
		case "CINCO" ->{
		 yield 5;
		}
		case "SEIS" ->{
		 yield 6;
		}
		default -> {
			System.out.println("Tirada 1 incorrecta");
			yield -1;
		}
		
};
		//Creo el switch para poder cambiar la cadena a un entero
		num2 = switch(tirada2) {
		case "UNO" ->{
		 yield 1;
		}
		case "DOS" ->{
		 yield 2;
		}
		case "TRES" ->{
		 yield 3;
		}
		case "CUATRO" ->{
		 yield 4;
		}
		case "CINCO" ->{
		 yield 5;
		}
		case "SEIS" ->{
		 yield 6;
		}
		default -> {
			System.out.println("Tirada 2 incorrecta");
			yield -1;
		}
		
		};
		
		//Saco la suma por pantalla
		System.out.println(num1+num2);
		
		//Cierro el escaner
		sc.close();
}
}