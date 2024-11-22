/*
	Hacer un programa no menor a 40 líneas de código funcional, donde se empleen los temas vistos 
	hasta el momento (Variables, Constantes y Operadores). No incluir ningún tema extra.
 */

package ejerciciosNivelacion_2;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		final int APROBADO = 6;
		final int REPROBADO = 5;
		
		double materia1,materia2,materia3,materia4,materia5,promedio;
		String nombre;
		String resultadoAprobado = "Aprobado";
		String resultadoReprobado = "Reprobado";
		String status = "Desconocido";
		boolean valido;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Bienvenido, introduce el nombre del alumno: ");
		nombre = in.nextLine();
		
		System.out.println("Ahora introduce las calificaciones obtenidas por el alumno: " + nombre);
		
		System.out.print("Calificacion materia 1: ");
		materia1 = in.nextInt();
		System.out.print("Calificacion materia 2: ");
		materia2 = in.nextInt();
		System.out.print("Calificacion materia 3: ");
		materia3 = in.nextInt();
		System.out.print("Calificacion materia 4: ");
		materia4 = in.nextInt();
		System.out.print("Calificacion materia 5: ");
		materia5 = in.nextInt();
		
		valido = materia1 > 10 || materia2 > 10 || materia3 > 10 || materia4 > 10 || materia5 > 10 ? false : true;
		
		promedio = (materia1+materia2+materia3+materia4+materia5)/5;
		
		resultadoAprobado = promedio >= APROBADO ? "El promedio del alumno " + nombre + " es: " + promedio + " el esta Aprobado" : "El promedio del alumno " + nombre + " es: " + promedio + " el esta Reprobado";
		resultadoReprobado = promedio >= REPROBADO && promedio <= 10.0 ? "El promedio del alumno " + nombre + " es: " + promedio + " el esta en Extraordinario" : "El promedio del alumno " + nombre + " es: " + promedio + " el esta en Recurse";
		
		status = !valido ? "Las calificaciones no son validas" : promedio >= 6 ? resultadoAprobado : resultadoReprobado ;
		
		System.out.println(status);
		
		in.close();
	}

}
