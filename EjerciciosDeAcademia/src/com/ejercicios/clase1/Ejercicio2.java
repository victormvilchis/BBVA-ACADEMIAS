package com.ejercicios.clase1;

//Descripción del ejercicio 2.

/*
    Crear Constantes: Declara una constante de tipo double llamada PI y asigna el valor 3.14159.
    Usar Constantes en Expresiones: Calcula el área de un círculo con radio 10 usando la constante PI y una variable radio
*/

public class Ejercicio2 {

	public static void main(String[] args) {

		System.out.println("Hola!!!");
		System.out.println("Este programa muestra en consola el resultado de calcular el área de un circulo tomando en cuenta los siguientes valores:");
		
		double PI = 3.14159;
		double radio = 10;
		double area;
		
		System.out.println("PI = " + PI);
		System.out.println("Radio = " + radio);
		
		area = PI*radio*radio;
		System.out.println("El resultado del área para este circulo es de: " + area);
		
	}

}
