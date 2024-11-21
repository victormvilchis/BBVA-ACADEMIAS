package com.ejercicios.clase1;

//Descripción del ejercicio 1.

/*
   Crear Variables: Declara una variable de tipo int llamada años y asigna un valor inicial de 20.
   Modificar Variables: Aumenta el valor de la variable años por 5 y luego imprime su nuevo valor.
   Crea Variables Wrapper: Declara una variable de tipo Integer llamada hijos y asigna un valor de 2
   Uso de Variables: Declara dos variables de tipo String, nombre y apellido. Asigna tu nombre y apellido a estas variables
   Imprime el siguiente mensaje utilizando System.out.println : “Hola mi nombre es: [nombre] , tengo [años] años y tengo [hijos] hijos”
*/

public class Ejercicio1 {
	
	public static void main(String [] args) {
	
	int años = 20;
	System.out.println("Tenemos una variable de nombre años que tiene un valor inicial de: " + años);
	
	años += 5;
	System.out.println("Ahora hemos aumentado su valor por 5, y su nuevo valor es de: " + años);
	
	Integer hijos = 2;
	
	String nombre;
	String apellido;
	
	nombre = "Michel";
	apellido = "Samano";
	
	System.out.println("Hola mi nombre es: " + nombre + ", tengo " + años + " años y tengo " + hijos + " hijos.");
	
	}
	
}
