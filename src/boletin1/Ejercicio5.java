package boletin1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		//Creo las variables de los numeros introducidos por el usuario
		double num1;
		double num2;
		double num3;
		
		//Creo el escaner para leer lineas escritas
		Scanner sc = new Scanner (System.in);
		
		//Pido el numero y el usuario lo pone
		System.out.println("Digame un numero");
		num1 = sc.nextDouble();
		
		System.out.println("Digame otro numero");
		num2 = sc.nextDouble();
		
		System.out.println("Digame otro numero");
		num3 = sc.nextDouble();
		
		if (num1>num2 && num2>num3) {
			System.out.println(num1 + " > " + num2 + " > " + num3 );
			
		} else if (num1>num3 && num3>num2){
			System.out.println(num1 + " > " + num3 + " > " + num2);
			
		} else if (num2>num1 && num1>num3){
			System.out.println(num2 + " > " + num1 + " > " + num3);
			
		} else if (num2>num3 && num3>num1){
			System.out.println(num2 + " > " + num3 + " > " + num1);
			
		} else if (num3>num1 && num1>num2){
			System.out.println(num3 + " > " + num1 + " > " + num2);
			
		} else if (num3>num2 && num2>num1){
			System.out.println(num3 + " > " + num2 + " > " + num1);
			
			//Empezamos los iguales
			
		} else if (num1==num2 && num2>num3){
			System.out.println(num1 + " = " + num2 + " > " + num3);
			
		} else if (num1==num2 && num2<num3){
			System.out.println(num3 + " > " + num1 + " = " + num2 );
			
			
		} else if (num2==num3 && num3>num1){
			System.out.println(num2 + " = " + num3 + " > " + num1);
			
		} else if (num2==num3 && num3<num1){
			System.out.println(num1 + " > " + num2 + " = " + num3 );
		
			
		} else if (num3==num1 && num1>num2){
			System.out.println(num3 + " = " + num1 + " > " + num2);
			
		} else if (num3==num1 && num1<num2){
			System.out.println(num2 + " > " + num3 + " = " + num1 );
			
		} else {
			System.out.println(num1 + " = " + num2 + " = " + num3 );
		
		//Cierro el escaner
		sc.close();
	}
	}
}
