package boletin3;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/* Para comprobar el funcionamiento de este programa, ponga los siguientes parametros en este orden: 1 - 59 - 59.
		 TSi lo pones asi, el resultado que dara el programa sera el siguiente: "2 : 0 : 0" */
		
		//Creo las variables que van a guardar los numeros randoms
		int horas;
		int minutos;
		int segundos;
		
		 // Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc= new Scanner(System.in);
		
		//Le pido al usuaroi que introduzca las horas, minutos y segundos
		System.out.println("Introduzca la hora, los minutos y los segundos en ese mismo orden: ");
		horas=sc.nextInt();
		minutos=sc.nextInt();
		segundos=sc.nextInt();
		
		//Compruebo si el numero es menor que 59, si es asi que le sume uno y ya
		if (segundos < 59) {
			System.out.println( horas +" : "+ minutos + " : " + ++segundos );
		} else if (segundos == 59 && minutos < 59) { //Compruebo si el numero es igual que 59, y los minutos menor, si es asi que sume 1 a los minutos y ponga 0 en los segundos
			System.out.println( horas +" : "+ ++minutos + " : " + 00 );
		} else { //Si ha llegado aqui significa que minutos y segundos son 59, asi que pone los segundos y muntos en 0 y suma 1 a las horas
			System.out.println( ++horas +" : "+ 00 + " : " + 00 );
		}
		
		//Cierro el escaner
		sc.close();
}
}
