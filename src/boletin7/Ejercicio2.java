package boletin7;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
        // Creo la variable que va a guardar el numeor introducido por el usuario
        int num;
        
        //Creo la variable que va a guardar si el numero es primo o no
        boolean divisible;
        
        // Creo el escaner que va a permitir leer lo que pone el usuario
        Scanner sc = new Scanner(System.in);

        // Pido al usuario que introduzca un número
        System.out.println("\nDígame un número:");
        num = sc.nextInt();

      
        for (int j = 2; j <= num; j++) {
        	
        	divisible=true;
            
            for (int i = 2; i < j; i++) {
            	
                if (j % i == 0) { 
                    divisible = false; 
                    i=num;

                }
            }

            //Si el numero es primo, lo saca por pantalla
            if (divisible) {
                System.out.println(j);
            }
        }
        
        // Cierro el escaner
        sc.close();
    }
}