package boletin7;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		// Este ejercicio no va a estar comentado debido a que el ejercicio 1v2 es una
		// version mejorada de este

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

		while (segunIncre >= 60) {
			segunIncre = segunIncre - 60;
			contMin++;
		}

		while (contMin != 0) {
			minuIncre++;
			contMin--;
		}

		minuIncre = minuIncre + minutos;

		while (minuIncre >= 60) {
			minuIncre = minuIncre - 60;
			contHora++;
		}

		while (contHora != 0) {
			horaIncre++;
			contHora--;
		}

		horaIncre = horaIncre + hora;

		while (horaIncre >= 24) {
			horaIncre = horaIncre - 24;
		}

		resultadoFinal += (horaIncre < 10 ? "0" : "") + horaIncre + ":";
		resultadoFinal += (minuIncre < 10 ? "0" : "") + minuIncre + ":";
		resultadoFinal += (segunIncre < 10 ? "0" : "") + segunIncre;

		System.out.println(resultadoFinal);

		sc.close();

	}

}