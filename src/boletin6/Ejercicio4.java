package boletin6;

public class Ejercicio4 {
	public static void main(String[] args) {

		// Creo la variable que va a guardar el la suma de los numeros introducidos por
		// el usuario
		int suma = 0;

		// Este bucle se repetira hasta que el bucle se repita 10 veces
		for (int i=1, contador=1; contador <= 10; i+=2, contador++) {

			// Hago la suma de los numero
			suma=suma+i;

		}

		// Saco la media por pantalla
		System.out.println("\nLa suma es: " + suma);

	}
}
