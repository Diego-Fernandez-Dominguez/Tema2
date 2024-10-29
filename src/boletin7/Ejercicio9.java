package boletin7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {

		// Como numero coloque el 100000, el resultado te dara que el numero tiene 6
		// cifras

		// Creo la variable que va a guardar el numero introudcido por el usuario
		int num = 0;

		// Creo la variable que va a tener el mismo valor que el numero introducido por
		// el usuario, para no cambiarlo si lo modificamos
		int num2;

		// Creo la variable que va a contarel numero de cifras que tiene el numero
		int cont = 1;

		// Creo una variable por si hay un error en la ejecucion
		boolean error;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Hasta que error sea false, se va a repetir el siguiente bucle
		do {
			try {
				// Pido al usuario que introduzca un número
				System.out.println("\nDíme un numero: ");
				num = sc.nextInt();

				// Hago un asercion de, si el numero es menor que 0, guarda el texto
				assert num > 0 : "ERROR: El numero debe ser positivo";

				// Pongo error como false
				error = false;

				// Si el programa detecta la asercion, coge el mensaje y lo saca por pantall,
				// limpia el bufer y pone error como true
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				sc.nextLine();
				error = true;

				// Si el programa detecta que es no es un int, sacara por pantalla el error,
				// vaciara el bufer de informacion y pone error como true
			} catch (InputMismatchException e) {
				System.err.println("El numero debe ser entero");
				sc.nextLine();
				error = true;
			}

		} while (error);

		// Asigno a num2 el valor de num para no modificar el valor del numero
		// introducido por el usuario
		num2 = num;

		// Mientras que num2 sea mayor que 9, va a hacer lo siguiente
		while (num2 > 9)

		{

			// Divido num2 entre 10
			num2 = num2 / 10;

			// Le sumo 1 al contador
			cont++;

		}

		// Saco el resultado por pantalla
		System.out.println("El numero tiene " + cont + " cifras");

		// Cierro el escaner
		sc.close();
	}
}
