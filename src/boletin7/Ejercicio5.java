package boletin7;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		int num = 0;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		do {
			// Pido al usuario que introduzca un número
			System.out.println("\nDígame un número entre 1 y 20:");
			num = sc.nextInt();
		} while (num < 1 || num > 20);

		for (int i = 1; i <= num; i++) {

			switch (i) {

			case 1 -> {
				System.out.println("1");
			}
			case 2 -> {
				System.out.println("22");
			}
			case 3 -> {
				System.out.println("333");
			}
			case 4 -> {
				System.out.println("4444");
			}
			case 5 -> {
				System.out.println("55555");
			}
			case 6 -> {
				System.out.println("666666");
			}
			case 7 -> {
				System.out.println("7777777");
			}
			case 8 -> {
				System.out.println("88888888");
			}
			case 9 -> {
				System.out.println("999999999");
			}
			case 10 -> {
				System.out.println("10101010101010101010");
			}
			case 11 -> {
				System.out.println("1111111111111111111111");
			}
			case 12 -> {
				System.out.println("121212121212121212121212");
			}
			case 13 -> {
				System.out.println("13131313131313131313131313");
			}
			case 14 -> {
				System.out.println("1414141414141414141414141414");
			}
			case 15 -> {
				System.out.println("151515151515151515151515151515");
			}
			case 16 -> {
				System.out.println("16161616161616161616161616161616");
			}
			case 17 -> {
				System.out.println("1717171717171717171717171717171717");
			}
			case 18 -> {
				System.out.println("181818181818181818181818181818181818");
			}
			case 19 -> {
				System.out.println("19191919191919191919191919191919191919");
			}
			case 20 -> {
				System.out.println("2020202020202020202020202020202020202020");
			}
			default -> {
				System.out.println("no");
			}

			}

		}

		sc.close();

	}
}
