package boletin6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar las notas introducidos por el usuario
		int nota;

		// Creo la variable que va a guardar si hay algun suspenso
		boolean suspenso = false;

		// Creo el escaner que va a permitir leer lo que pone el usuario
		Scanner sc = new Scanner(System.in);

		// Este bucle se repetira hasta que i sea mayor o igual que 5 y se va
		// incrementando de 1 en 1
		for (int i = 1; i <= 5; i++) {

			// Pido a usuario que introduzca la nota
			System.out.println("\nDigame una nota");
			nota = sc.nextInt();

			// Si la nota es menor o igual que 4, cambia el valor de la variable suspenso a
			// true
			if (nota <= 4)
				suspenso = true;

		}

		// Si suspenso es igual a true significa que hay algun suspenso lo dirá por
		// pantalla, si no es así pondra que no hay ningun suspenso
		System.out.println(suspenso == true ? "\nSi hay un suspenso" : "\nNo hay ningun suspenso");

		// Cierro el escaner
		sc.close();
	}
}
