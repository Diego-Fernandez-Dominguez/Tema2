package boletin7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {

		// Ponga como numero el 12321, el resultado es que el numero si es capicua

		// Creo la variable que va a guardar el numero del usuario
		int num = 0;

		// Creo la variable que va a ser asignada con el valor del numero del usuario
		int numCambiado;

		// Creo la variable que va a guardar el numero del usuario invertido
		int inver = 0;

		// Creo la variable que va a guardar el resto del numero
		int resto;

		// Creo una variable por si hay un error en la ejecucion
		boolean error;

		// Creo el escaner que va a permitir leer lo que ponga el usuario
		Scanner sc = new Scanner(System.in);

		do {
			try {
				// Pido un numero al usuario, si el numero es menor a 0 lo volvera a pedir
				System.out.println("Introduce un número: ");
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

		// Le asigno el valor de num a numCambiado
		numCambiado = num;

		// Mientras el numCambiado sea mayor que 0, hara lo siguiente
		while (numCambiado > 0) {

			// Hace el resto de numCambiado por 10 para sacar el ultimo numero
			resto = numCambiado % 10;

			// Le multiplico 10 al numero invertido para que cuando le sume el resto, no
			// cambie el numero anterior
			inver = inver * 10 + resto;

			// Le quito el ultimo numero al nuCambaido
			numCambiado /= 10;
		}

		// Si el numero es igual al numero invertido, el numero es capicua
		if (num == inver) {
			System.out.println("El numero es capicua");

			// Si llega aqui, el numero no es capicua
		} else {
			System.out.println("El numero no es capicua");
		}

		// Cierro el escaner
		sc.close();

	}
}
