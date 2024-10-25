package boletin7;

import java.util.Scanner;

public class Ejercicio1v2 {
	public static void main(String[] args) {

		int hora;
		int horaIncre = 0;
		int minutos;
		int minuIncre = 0;
		int segundos;
		int incrementar;
		int segunIncre;
		int contMin = 0;
		int contHora = 0;
		String resultadoFinal = "";

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Dime la hora");
			hora = sc.nextInt();
		} while (hora < 0 || hora >= 24);

		do {
			System.out.println("Dime los minutos");
			minutos = sc.nextInt();
		} while (minutos < 0 || minutos > 60);

		do {
			System.out.println("Dime los segundos");
			segundos = sc.nextInt();
		} while (segundos < 0 || segundos > 60);

		do {
			System.out.println("Cuantos segundos quieres incrementar");
			incrementar = sc.nextInt();
		} while (incrementar < 0);

		segunIncre = segundos + incrementar;

		for (int contador = 0; contador < incrementar; contador++) {
		}

		resultadoFinal += (horaIncre < 10 ? "0" : "") + horaIncre + ":";
		resultadoFinal += (minuIncre < 10 ? "0" : "") + minuIncre + ":";
		resultadoFinal += (segunIncre < 10 ? "0" : "") + segunIncre;

		System.out.println(resultadoFinal);

		sc.close();

	}

}