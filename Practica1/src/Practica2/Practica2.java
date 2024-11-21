package Practica2;

/* Crear Constantes: Declara una constante de tipo double llamada PI y asigna el valor 3.14159.
 * Usar Constantes en Expresiones: Calcula el área de un círculo con radio 10 usando la constante PI 
 * y una variable radio*/

public class Practica2 {
	public static void main(String[] args) {
		final double pi = 3.14159;
		int radio = 10;
		double area;
		
		area = pi * radio * radio;
		System.out.println("La area del circulo es: "+area);
	}
}
