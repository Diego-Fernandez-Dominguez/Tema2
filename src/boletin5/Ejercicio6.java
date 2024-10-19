package boletin5;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		// Creo las variables que van a guardar las peticiones de los jugadors
		String juga1;
		String juga2;

		// Creo la variable que va a guardar si el jugador quiere voler a jugar
		String repetir = "S";

		// Creo el escaner que va a leer lo que introduzca el usuario
		Scanner sc = new Scanner(System.in);

		// Mientras que repetir sea igual a 'S', se repetira el siguiente bucle
		do {

			// Le pongo valores a las variables para que cuando el usuario quiera volver a jugar, no se complete la partida automaticamente
			juga1 = "";
			juga2 = "";

			//Si lo que ha introducido el jugador 1 no es valido, se le volvera a preguntar hasta que lo ponga correctamente
			while ((juga1.equalsIgnoreCase("piedra") || juga1.equalsIgnoreCase("papel") || juga1.equalsIgnoreCase("tijera")) == false) {
				System.out.println("Jugador 1, haga su jugada: ");
				juga1 = sc.nextLine();
			}

			//Si lo que ha introducido el jugador 2 no es valido, se le volvera a preguntar hasta que lo ponga correctamente
			while ((juga2.equalsIgnoreCase("piedra") || juga2.equalsIgnoreCase("papel") || juga2.equalsIgnoreCase("tijera")) == false) {
				System.out.println("Jugador 2, haga su jugada: ");
				juga2 = sc.nextLine();
			}

			// Compruebo si las 2 peticiones son iguales
			if (juga1.equalsIgnoreCase(juga2)) {
				System.out.println("Empate");

				// Compruebo si el jugador 1 ha ganado
			} else if (juga1.equalsIgnoreCase("PAPEL") && juga2.equalsIgnoreCase("PIEDRA") || juga1.equalsIgnoreCase("TIJERA") && juga2.equalsIgnoreCase("PAPEL") || juga1.equalsIgnoreCase("PIEDRA") && juga2.equalsIgnoreCase("TIJERA")) {
				System.out.println("Gana el jugador 1");

			// Si se llega aqui significa que el jugador 2 es el que ha ganado
			} else 
				System.out.println("Gana el jugador 2");

			//Le pregunto al usuario si quiere volver a jugar, si coloca una 'S' se volvera a repetir el bucle
			System.out.println("Ponga 'S' si quiere volver a jugar");
			repetir = sc.nextLine();

		} while (repetir.equalsIgnoreCase("S"));

		// Termino el programa
		System.out.println("Juego acabado");
		
		// Cierro el escaner
		sc.close();
		
	}

}
