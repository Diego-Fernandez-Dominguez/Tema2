package boletin5;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
	//Creo la variable que va a guardar el limite
	int num=0 ;
	
	//Creo la variable que va a guardar la suma
	int suma=1;
	
	//Creo la variable que va a guardar el resultado
	int resultado=0;
	
	//Creo el escaner
	Scanner sc=new Scanner(System.in);
	
	//Pido al usuario que introduzca el numero limite y lo hace
	System.out.println("Introduzca el limite");
	num=sc.nextInt();
	
	//Creo un bucle, que mientras el limite sea mayor o igul que la suma haga lo siguiente
	do {
		
		//Le sumo suma al resultado
		resultado+= suma;
		
		//Le sumo 1 a suma
		suma++;
	} while(suma<=num);
	
	//Saco el resultado por pantalla
	System.out.println(resultado);
	
	//Cierro el escaner
	sc.close();
	
}
}
