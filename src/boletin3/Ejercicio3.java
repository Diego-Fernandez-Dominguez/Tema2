package boletin3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		//Creo la variable que va a guardar el numero dado por el usuario
		int num;
		int modulo;
		
		//Creo la variable que va a guardar el valor absoluto del numero dado por el usuario
		String letra;
		
		 // Crear un objeto Scanner para leer la entrada del usuario
	    Scanner sc = new Scanner(System.in);
	
	    // Solicitar número al usuario
	    System.out.print("Introduce su DNI sin poner la letras");
	    num = sc.nextInt();
	
	    // r
	    modulo = num%23;
	    
	    if(num > 9999999 && num < 99999999) {
	    letra = switch(modulo) {
		case 0 ->{
		 yield "T";
			}
	    case 1 ->{
		 yield "R";
		}
		case 2 ->{
		 yield "W";
		}
		case 3 ->{
		 yield "A";
		}
		case 4 ->{
		 yield "G";
		}
		case 5 ->{
		 yield "M";
		}
		case 6 ->{
		 yield "Y";
		}
		case 7 ->{
		 yield "F";
		}
		case 8 ->{
		 yield "P";
		}
		case 9 ->{
		 yield "D";
		}
		case 10 ->{
		 yield "X";
		}
		case 11 ->{
		 yield "B";
		}
		case 12 ->{
		 yield "N";
		}
		case 13 ->{
		 yield "J";
		}
		case 14 ->{
		 yield "Z";
		}
		case 15 ->{
		 yield "S";
		}
		case 16 ->{
		 yield "Q";
		}
		case 17 ->{
		 yield "V";
		}
		case 18 ->{
		 yield "H";
		}
		case 19 ->{
		 yield "L";
		}
		case 20 ->{
		 yield "C";
		}
		case 21 ->{
		 yield "K";
		}
		case 22 ->{
		 yield "E";
		}
		default -> {
			System.out.println("Numero no valido");
			yield "-1";
		}
	    
	    };
		
	    // Mostrar el resultado
	    System.out.println(num + letra);
		} else {
		System.out.println("Numero no valido");	
		}
	    		
	    //Cierro el escaner
	    sc.close();
	}
}
