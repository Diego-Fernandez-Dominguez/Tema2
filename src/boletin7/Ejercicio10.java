package boletin7;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
        int num;
        int numCambiado;
        int inver = 0;
        int resto;
        
        Scanner sc = new Scanner(System.in);
        
        do {
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        } while(num<=0);

        numCambiado=num;
        
        while (numCambiado > 0) {
            resto = numCambiado % 10;
            inver = inver * 10 + resto;
            numCambiado /= 10;
        }
        
        if (num==inver) {
        	System.out.println("El numero es capicua");
        }else {
            System.out.println("El numero no es capicua");
        }
        
	}
}
