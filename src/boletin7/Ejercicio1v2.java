package boletin7;

import java.util.Scanner;

public class Ejercicio1v2 {
	public static void main(String[] args) {

		// Creo ka variabkle que van a guardar los numeros introducidos por el usuario
		int hora;
		int minutos;
		int segundos;
		int incrementar;

		// Creo la variable que va a guardar los numeros incrementados
		int horaIncre = 0;
		int minuIncre = 0;
		int segunIncre;

		// Creo la variable que va a guardar el resultado final
		String resultadoFinal = "";

		// Creo el escaner que va a permitir leer lo que pone el usuario que introduzca
		// las horas correctamente
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Dime la hora");
			hora = sc.nextInt();
		} while (hora < 0 || hora >= 24);

		// Creo el escaner que va a permitir leer lo que pone el usuario que introduzca
		// los minutos correctamente
		do {
			System.out.println("Dime los minutos");
			minutos = sc.nextInt();
		} while (minutos < 0 || minutos > 60);

		// Creo el escaner que va a permitir leer lo que pone el usuario que introduzca
		// los segundos correctamente
		do {
			System.out.println("Dime los segundos");
			segundos = sc.nextInt();
		} while (segundos < 0 || segundos > 60);

		// Creo el escaner que va a permitir leer lo que pone el usuario que introduzca
		// el incremento correctamente
		do {
			System.out.println("Cuantos segundos quieres incrementar");
			incrementar = sc.nextInt();
		} while (incrementar < 0);

		// Asigno a segunIncre los segundos asignados mas el incremento
		segunIncre = segundos + incrementar;

		// Asigno el valor de minutos a minuIncre
		minuIncre = minutos;

		// Asigno el valor de hora a horaIncre
		horaIncre = hora;

		// Mientras que los segundos sean mayores o iguales a 60, va a restarle 60 a
		// segunIncre y sumarle 1 al contadorMinu
		for (int contadorMinu = 1; segunIncre >= 60; segunIncre -= 60, contadorMinu++) {

			// Le suma a los minuIncre el contadorMinu y los minutos
			minuIncre = minutos + contadorMinu;

			// Mientras que los minuIncre sean mayor que 60, le va a restar 60 a los
			// minuIncre y sumar 1 al contadorHora
			for (int contadorHora = 1; minuIncre >= 60; minuIncre -= 60, contadorHora++) {

				// Le suma a las horaIncre el contadorHora mas las horas
				horaIncre = hora + contadorHora;

				// Mientras que la horaIncre sea mayor o igual a 24, le va a restar 24 a la
				// horaIncre
				for (; horaIncre >= 24; horaIncre -= 24) {

				}
			}

		}

		// A partir de distintos ternarios, voy formando la respuesta dependiendo si el
		// numero es menor que 0, para saber si le tengo que añadir un 0 a las izquierda
		// a los numeros que sean de solamente 1 caracter
		resultadoFinal += (horaIncre < 10 ? "0" : "") + horaIncre + ":";
		resultadoFinal += (minuIncre < 10 ? "0" : "") + minuIncre + ":";
		resultadoFinal += (segunIncre < 10 ? "0" : "") + segunIncre;

		// Saco por pantalla el resultado final
		System.out.println(resultadoFinal);

		// Cierro el escaner
		sc.close();

	}

}