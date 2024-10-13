package boletin3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

    	
		/*La prueba a realizar es la siguiente: Cuando te pida introducir un numero, introduzca el numero
		 1441, el cual es un numero capicúa. Cuando ese lo introduzcas, el programa te dirá que el numero 
		 introducido es capicua. Tambien puedes poner el 123 para comprobar que te dice que no es capicua*/
    	
        // Creo la variable que va a guardar el numero dado por el usuario
        int num;

        // Creo las variables que van a guardar las cifras del numero dado por el jugador
        int cifra1 = 0;
        int cifra2 = 0;
        int cifra3 = 0;
        int cifra4 = 0;

        // Creo el escáner para leer lo que pone el usuario.
        Scanner sc = new Scanner(System.in);

        // Pido al usuario que introduzca el numero y lo leo
        System.out.println("Introduzca el numero capicua");
        num = sc.nextInt();

        // Si el numero es menor a 0 o mayor que 9999 no es válido
        if (num <= 0 || num > 9999) {
            System.out.println("Numero no valido");

        // Compruebo si el número tiene una única cifra
        } else if (num < 10) {
            System.out.println("Su numero solamente tiene una cifra");

        // Compruebo si el número tiene 2 cifras
        } else if (num < 100) {
            cifra1 = num / 10; // Saco la primera cifra dividiendo num por 10
            cifra2 = num % 10; // Saco la segunda cifra haciendo el resto de num por 10

            // Si cifra1 y cifra2 son iguales, significa que es capicúa
            if (cifra1 == cifra2) {
                System.out.println("Su numero es capicua");
            } else {
                System.out.println("Su numero no es capicua");
            }

        // Compruebo si el número tiene 3 cifras
        } else if (num < 1000) {
            cifra1 = num / 100; // Saco la primera cifra dividiendo num por 100
            cifra3 = num % 10; // Saco la tercera cifra haciendo el resto de num por 10

            // Si cifra1 y cifra3 son iguales, significa que es capicúa
            if (cifra1 == cifra3) {
                System.out.println("Su numero es capicua");
            } else {
                System.out.println("Su numero no es capicua");
            }

        // Si ha llegado aquí, significa que el número tiene 4 cifras
        } else {
            cifra1 = num / 1000; // Saco la primera cifra dividiendo num por 1000
            cifra2 = (num / 100) % 10; // Saco la segunda cifra dividiendo num por 100 y sacándole el resto de 100
            cifra3 = (num / 10) % 10; // Saco la tercera cifra dividiendo num por 10 y sacándole el resto de 10
            cifra4 = num % 10; // Saco la cuarta cifra haciendo el resto de num por 10

            // Si cifra1 y cifra4, y cifra2 y cifra3 son iguales, significa que el numero es capicúa
            if (cifra1 == cifra4 && cifra2 == cifra3) {
                System.out.println("Su numero es capicua");
            } else {
                System.out.println("Su numero no es capicua");
            }
        }

        // Cierro el escáner
        sc.close();
    }
}