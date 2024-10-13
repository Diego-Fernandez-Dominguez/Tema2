package boletin3;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		/* Para comprobar este codigo, puedes introducir el numero 64, el cual te dara como resultado el siguiente texto :
		  "Sesenta y cuatro" */
		
		//Creo la variable que va a guardar el numero dado por el usuario
		int completo;
		
		//Creo las variables que van a guardar las cifras de los numeros
		int cifra1;
		int cifra2;
		
		//Creo el escaner que va a guardar las dos cifras como palabras
		String pal1;
		String pal2;
		
		 // Crear un objeto Scanner para leer la entrada del usuario
	    Scanner sc = new Scanner(System.in);
	
	    // Solicitar número al usuario y este lo introduce
	    System.out.print("Introduce un número en este rango: 1-99");
	    completo=sc.nextInt();
	    
	    //Si el numero es menor a 1 y mayor a 99, no entra en el rango valido
	    if (completo < 1 || completo > 99) {
	    	System.out.println("El numero que ha introducido no es valido");
	    } else {
	    	switch (completo) { //Compruebo si el numero introducido es imposible de dividirlo por cifras y que quede bien
	    	case 1 ->
	    		System.out.println("Uno");
	    	case 2 ->
	    		System.out.println("Dos");
	    	case 3 ->
	    		System.out.println("Tres");
	    	case 4 ->
	    		System.out.println("Cuatro");
	    	case 5 ->
	    		System.out.println("Cinco");
	    	case 6 ->
	    		System.out.println("Seis");
	    	case 7 ->
	    		System.out.println("Siete");
	    	case 8 ->
	    		System.out.println("Ocho");
	    	case 9 ->
	    		System.out.println("Nueve");
	    	case 10 ->
	    		System.out.println("Diez");
	    	case 11 ->
	    		System.out.println("Once");
	    	case 12 ->
	    		System.out.println("Doce");
	    	case 13 ->
	    		System.out.println("Trece");
	    	case 14 ->
	    		System.out.println("Catorce");
	    	case 15 ->
	    		System.out.println("Quince");
	    	case 20 ->
	    		System.out.println("Veinte");
	    	case 21 ->
    			System.out.println("Veintiuno");
	    	case 22 ->
    			System.out.println("Veintidos");
	    	case 23 ->
    			System.out.println("Veintitres");
	    	case 24 ->
    			System.out.println("Veinticuatro");
	    	case 25 ->
    			System.out.println("Veinticinco");
	    	case 26 ->
    			System.out.println("Veintiseis");
	    	case 27 ->
	    		System.out.println("Veintisiete");
	    	case 28 ->
    			System.out.println("Veintiocho");
	    	case 29 ->
	    		System.out.println("Veintinueve");
	    	default -> { //Si no coincide con ninguno de los anteriores, significa que tengo que separar las cifras para poder escribirlo
	    		cifra1 = completo/10 ;
	    		cifra2 = completo%10 ;
	    		
	    		//Miro la primera cifra para guardar la palabra correcta
		    	pal1 =switch (cifra1) {
		    	case 1 -> {
		    		yield "Dieci";
		    	}
		    	case 3 -> {
		    		 yield "Treinta";
			    	}
		    	case 4 -> {
		    		 yield "Cuarenta";
			    	}
		    	case 5 -> {
		    		 yield "Cincuenta";
			    	}
		    	case 6 -> {
		    		 yield "Sesenta";
			    	}
		    	case 7 -> {
		    		 yield "Setenta";
			    	}
		    	case 8 -> {
		    		 yield "Ochenta";
			    	}
		    	case 9 -> {
		    		 yield "Noventa";
			    	}
				default -> {
					yield "No valido";
				}
		    	};
		    	
	    		//Miro la segunda cifra para guardar la palabra correcta
		    	pal2 =switch (cifra2) {
		    	case 0 -> {
		    		 yield "";
			    	}
		    	case 1 -> {
		    		yield " y uno";
		    	}
		    	case 2 -> {
		    		 yield " y dos";
			    	}
		    	case 3 -> {
		    		 yield " y tres";
			    	}
		    	case 4 -> {
		    		 yield " y cuatro";
			    	}
		    	case 5 -> {
		    		 yield " y cinco";
			    	}
		    	case 6 -> {
		    		 yield " y seis";
			    	}
		    	case 7 -> {
		    		 yield " y siete";
			    	}
		    	case 8 -> {
		    		 yield " y ocho";
			    	}
		    	case 9 -> {
		    		 yield " y nueve";
			    	}
				default -> {
					yield "No valido";
				}
		    	};
		    	
		    	//Saco la palabra completa por pantalla
		    	System.out.println(pal1 + pal2);
	    	}
	    	}
	    	};
	    
	    //Cierro el escaner
	    sc.close();
}
}