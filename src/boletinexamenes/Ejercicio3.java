package boletinexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		int tamaño = 0;

		boolean error = false;

		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("Introduzca un numero");
				tamaño = sc.nextInt();
				assert tamaño >= 0 : "El numero debe ser mayor o igual que 0";
				error = false;

			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				error = true;

			} catch (InputMismatchException e) {
				System.err.println("El numero debe ser un entero");
				sc.nextLine();
				error = true;
			}
		} while (error);

		for (int fila = 1; fila <= tamaño; fila++) {
			System.out.println();

			for (int espacio = 1; espacio < fila; espacio++) {
				System.out.print(" ");
			}

			for (int asterisco = 0; asterisco <= tamaño - fila; asterisco++) {
				System.out.print("* ");

			}

		}
	}
}
