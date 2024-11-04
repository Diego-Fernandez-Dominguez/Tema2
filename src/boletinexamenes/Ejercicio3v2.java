package boletinexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3v2 {
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

		for (int fila = 0; fila < tamaño; fila++) {
			System.out.println();

			for (int espacio = 0; espacio < fila; espacio++) {
				System.out.print(" ");
			}

			for (int asterisco = tamaño; asterisco > fila; asterisco--) {
				if (fila == 0 || asterisco == tamaño || asterisco == fila + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}

		}
	}
}
