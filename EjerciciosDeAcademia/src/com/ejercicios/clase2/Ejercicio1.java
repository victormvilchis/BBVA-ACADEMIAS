package com.ejercicios.clase2;

//Descripción del ejercicio:

/*
    Hacer un programa no menor a 40 líneas de código funcional, 
    donde se empleen los temas vistos hasta el momento (Variables, Constantes y Operadores).
    No incluir ningún tema extra.
*/

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String nombre = "Michel";
		String apellido = "Samano";
		int edad = 27;
		boolean estudia = false;
		final int TOTAL_DE_HORAS_TRABAJADAS = 9;
		
		System.out.println("Estos son los datos de la persona: ");
		System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + " años.");
		
		System.out.println("Michel se puede considerar una persona joven?");
		if(edad < 50) {
			System.out.println("Sí, lo es.");
		} else {
			System.out.println("No, no lo es.");
		}
		
		System.out.println("Cuántos años tendrá Michel dentro de 5 años?");
		System.out.println("Respuesta: " + (edad +=5) + " años");
		
		System.out.println("y Cuántos años tendría Michel si tomamos en cuenta la edad que supuestamente tiene ahora despues de haberle sumado 5 años, pero ahora le queremos  quitar 10 años?");
		System.out.println("La respuesta es: " + (edad -= 10) + " años." );
		
		System.out.println("Si Michel estudia, dime el nombre de la escuela");
		
		if(!estudia) {
			System.out.println("No no estudia.");
			System.out.println("Entonces Michel trabaja?");
		} 
			
		System.out.println("Sí");
	    System.out.println("Trabaja en Softtek");
		
		
		System.out.println("La siguiente pregunta es: ¿Cuántas horas trabaja Michel al día?");
		System.out.println("La respuesta es: " + TOTAL_DE_HORAS_TRABAJADAS + " Horas.");
		
		System.out.println("Cuántas horas son a la semana?");
		System.out.println("La respuesta es: " + (TOTAL_DE_HORAS_TRABAJADAS * 5) + " Horas en total.");

	}

}
