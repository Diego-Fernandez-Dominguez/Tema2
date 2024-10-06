package boletin1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
	
		//Creo la variable la cual va a guardar la nota introducida por el usuario
		int nota;
		
		//Creo el escaner para leer lo que pone el usuario
		Scanner sc = new Scanner (System.in);
		
		//Pido la nota y el usuario la escribe
		System.out.println("Digame la nota del alumno");
		nota = sc.nextInt();
		
		
		if (nota < 0 || nota > 10) { //Compruebo si la nota es valida
			System.out.println("Nota no valida");
		} else if (nota < 5) { //Compruebo si la nota es menor a 5, si es asi es INSUFICIENTE
			System.out.println("INSUFICIENTE");
		} else if (nota == 5 ) { //Compruebo si la nota es igual a 5, si es asi es SUFICIENTE
			System.out.println("SUFICIENTE");
		} else if (nota == 6) { //Compruebo si la nota es igual a 6, si es asi es BIEN
			System.out.println("BIEN");
		} else if (nota < 9) { //Compruebo si la nota es menor a 9, si es asi es NOTABLE
			System.out.println("NOTABLE");
		} else if (nota >= 9) { //Compruebo si la nota es mayor o igual a 9, si es asi es SOBRESALIENTE
			System.out.println("SOBRESALIENTE");
}
		
		//Cierro el escaner
		sc.close();
		
	}
	}
