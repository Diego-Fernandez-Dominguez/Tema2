package boletinexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		int num = 0;

		int num2;

		int resto;

		int contPar = 0;

		int contImpar = 0;

		boolean error = false;

		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("Introduzca un numero");
				num = sc.nextInt();
				assert num >= 0 : "El numero debe ser mayor o igual que 0";
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

		num2 = num;

		while (num2 > 0) {

			resto = num2 % 10;
			num2 = num2 / 10;

			if (resto % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}

		}

		System.out.println("Ese numero tiene " + contImpar + " cifras impares y " + contPar + " cifras pares");

		sc.close();

	}

}
