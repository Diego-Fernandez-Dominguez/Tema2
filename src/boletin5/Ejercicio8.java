package boletin5;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		// Creo las variables que van a guarda las tiradas del usuario
		String tirada1;
		String tirada2;

		// Creo la variable que va a guardar si el usuario quiere terminar la partida o
		// no
		String terminar;

		// Creo las variables que van a guardar la conversion de las tiradas de cadena a
		// entero
		int num1;
		int num2;

		// Creo el escaner para leer lo que pone el usuario.
		Scanner sc = new Scanner(System.in);

		do {

			// Le doy valor a las variables de tiradas para que el programa
			// no se complete automaticamente solo
			tirada1 = "";
			tirada2 = "";

			// Mientras que la tirada1 no sea ni uno, dos, tres, cuatro, cinco o seis se
			// repetira el siguiente bucle
			do {
			
				// Le pido la primera tirada al usuario, y este lo introduce
				System.out.println("Cuanto has sacado en la primera tirada");
				tirada1 = sc.nextLine().toUpperCase();
				
			} while (!(tirada1.equalsIgnoreCase("uno") || tirada1.equalsIgnoreCase("dos")
					|| tirada1.equalsIgnoreCase("tres") || tirada1.equalsIgnoreCase("cuatro")
					|| tirada1.equalsIgnoreCase("cinco") || tirada1.equalsIgnoreCase("seis")));
			

			// Mientras que la tirada2 no sea ni uno, dos, tres, cuatro, cinco o seis se
			// repetira el siguiente bucle
			do {
				
				// Le pido la segunda tirada al usuario, y este lo introduce
				System.out.println("Cuanto has sacado en la segunda tirada");
				tirada2 = sc.nextLine().toUpperCase();
			
			}while (!(tirada2.equalsIgnoreCase("uno") || tirada2.equalsIgnoreCase("dos")
					|| tirada2.equalsIgnoreCase("tres") || tirada2.equalsIgnoreCase("cuatro")
					|| tirada2.equalsIgnoreCase("cinco") || tirada2.equalsIgnoreCase("seis")));
			

			// Creo el switch para poder cambiar la cadena a un entero
			num1 = switch (tirada1) {
			case "UNO" -> {
				yield 1;
			}
			case "DOS" -> {
				yield 2;
			}
			case "TRES" -> {
				yield 3;
			}
			case "CUATRO" -> {
				yield 4;
			}
			case "CINCO" -> {
				yield 5;
			}
			case "SEIS" -> {
				yield 6;
			}
			default -> {
				System. out.println("Tirada 1 incorrecta");
				yield -1;
			}

			};
			// Creo el switch para poder cambiar la cadena a un entero
			num2 = switch (tirada2) {
			case "UNO" -> {
				yield 1;
			}
			case "DOS" -> {
				yield 2;
			}
			case "TRES" -> {
				yield 3;
			}
			case "CUATRO" -> {
				yield 4;
			}
			case "CINCO" -> {
				yield 5;
			}
			case "SEIS" -> {
				yield 6;
			}
			default -> {
				System.out.println("Tirada 2 incorrecta");
				yield -1;
			}
			};

			// Hago las suma de los dados
			System.out.println(num1 + num2);

			// Pregunto al usuario si quiere acabar el programa
			System.out.println("Si desea acabar el programa, ponga 'SI'");
			terminar = sc.nextLine();

		} while (!(terminar.equalsIgnoreCase("SI")));

		// Saco por pantalla que el programa se ha acabado
		System.out.println("Programa acabado");

		// Cierro el escaner
		sc.close();
	}

}
