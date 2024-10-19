package boletin5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar la respuesta que va a decidir si el numero
		// que da la maquina es el maximo, el minimo o igual.
		String respuesta = "";

		// Creo la variable que va a guardar el maximo del rango del randomizador
		int max = 101;

		// Creo la variable que va a guardar el minimo del rango del randomizador
		int min = 1;

		// Creo la variable que va a guardar el numero aleatorio elegido por la maquina
		int aleatorio;

		// Creo el escaner para leer lo que escribe el usuario
		Scanner sc = new Scanner(System.in);

		// Creo el randomizador
		Random rand = new Random();

		// Mientras que la respuesta del usuario no sea igual a "igual", se va a repetir
		// el siguiente bucle
		do {

			// Genero un numero aleatorio dentro del rango establecido
			aleatorio = rand.nextInt(min, max);

			// Pregunto al usuario si el numero es mayor, menor o igual, y este contesta
			System.out.println("-|" + aleatorio + "|-" + " Su numero es mayor, menor o igual");
			respuesta = sc.nextLine();

			// Si el usuario ha puesto mayor, el minimo del numero se vera cambiado por el
			// numero aleatorio+1, ya que si no ese numeor se podra repetir
			if (respuesta.equalsIgnoreCase("mayor")) {
				min = aleatorio + 1;

				// Si el usuario ha puesto menor, el maximo del numero se vera cambiado por el
				// numero aleatorio.
			} else if (respuesta.equalsIgnoreCase("menor")) {
				max = aleatorio;

				// Si el usuario ha puesto igual, el programa sacara por pantalla que la maquina
				// ha acertado el numero
			} else if (respuesta.equalsIgnoreCase("igual")) {
				System.out.println("\n La maquina ha acertado su numero, felicidades");

				// Si llega hasta aqui significa que la respuesta dada no es correcta
			} else {
				System.out.println("Respuesta no valida");
			}

		} while (respuesta.equalsIgnoreCase("igual") == false);
		
		sc.close();
		
	}
	
}
