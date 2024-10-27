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
		
		segunIncre=segundos + incrementar;
		minuIncre=minutos;
		horaIncre=hora;

		for (int i=1; segunIncre>=60; segunIncre-=60) {
			
			minuIncre=minutos+i;
			
			for (int j=1; minuIncre>=60; minuIncre-=60) {
				
				horaIncre=hora+j;
				System.out.println(horaIncre);
				for (; horaIncre>=24; horaIncre-=24) {

			}
			}

		}

		resultadoFinal += (horaIncre < 10 ? "0" : "") + horaIncre + ":";
		resultadoFinal += (minuIncre < 10 ? "0" : "") + minuIncre + ":";
		resultadoFinal += (segunIncre < 10 ? "0" : "") + segunIncre;

		System.out.println(resultadoFinal);

		sc.close();

	}

}