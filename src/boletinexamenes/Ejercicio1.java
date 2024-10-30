package boletinexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		int num=0;

		boolean error;

		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("Digame un numero");
				num = sc.nextInt();
				assert num > 0 : "El numero debe ser positivo";
				error=false;
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				error = true;

			} catch (InputMismatchException e) {
				System.err.println("El numero debe ser un entero");
				sc.nextLine();
				error = true;
			}
		} while (error);

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {

				if (i == 1 || i == num || j == 1 || j == num) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println("");
		}
	}
}