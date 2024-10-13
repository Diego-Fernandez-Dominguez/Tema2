package boletin3;

import java.util.Scanner;

public class Ejercicio8 {
		public static void main(String[] args) {
			
			/* Para comprobar el programa tendremos que que insertar el numero 2 en el mes y el a;o 2024, nos dara como resultado que el mes tiene 29 
			 dias, ya que es febrero y año bisisesto */
			
			//Creo las variables que van a guardar los datos introducidos por el usuario
			int mes;
			int año;
		
			 // Crear un objeto Scanner para leer la entrada del usuario
			Scanner sc= new Scanner(System.in);
			
			//Pido el mes y el usuario la introduce
			System.out.println("Introduzca el numero del mes");
			mes=sc.nextInt();
			
			//Pido el año y el usuario la introduce
			System.out.println("Introduzca la distancia");
			año=sc.nextInt();

			//Si el año es multiplo de 4 y es febrero, significa que el mes va a tener 29 (bisiesto)
			if (año % 4 == 0 && mes == 2) {
				System.out.println("El mes tiene 29 dias");
			} else {
				switch (año) { //Aqui voy a comprobar que mes es, para decir los dias que tiene
				case 1, 3, 5, 7, 8, 10, 12  ->
				System.out.println("El mes tiene 31 dias");
				case 2 ->
				System.out.println("El mes tiene 28 dias");
				case 4, 6, 9, 11 ->
				System.out.println("El mes tiene 30 dias");
			}
			}
			
			//Cierro el escaner
			sc.close();
		}

}
