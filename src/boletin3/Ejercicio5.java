package boletin3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
	
		/* La forma de comprobar que este codigo funciona es sumar los dos numeros correctamente, ya que si
		 lo haces correctamente te pondra el siguiente texto: "Resultado correcto" */
		
		//Creo las variables que van a guardar los numeros randoms
		int num1;
		int num2;
		
		//Creo la variable que va a guardar la suma hecha por el usuario
		int resultadoUsuario;
		
		 // Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc= new Scanner(System.in);
		
		 // Crear un objeto random para poder generar un numero random comprendido entre el 1 y el 99
		Random rand = new Random();
		
		//Genero los dos numeros random
		num1= rand.nextInt(1,100);
		num2= rand.nextInt(1,100);
		
		//Le pido al usuaroi que introduzca la suma de los numeros random, y este la introduce
		System.out.println("Introduzca la suma de los siguientes dos numeros: ");
		System.out.println(num1);
		System.out.println(num2);
		resultadoUsuario =sc.nextInt();
		
		//Compruebo si la suma dada por el usuario es igual a la suma real, si es asi el resultado es correcto
		if (num1+num2==resultadoUsuario) {
			System.out.println("Resultado correcto");
		} else {
			System.out.println("Resultado incorrecto");
		}
		
		//Cierro el escaner
		sc.close();
}
}
