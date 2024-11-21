package ejerciciosNivelacion_1;

public class Ejercicio_1 {	
	public static void main(String[] args) {
		/*
		Crear Variables: Declara una variable de tipo int llamada años y asigna un valor inicial de 20.
		Modificar Variables: Aumenta el valor de la variable años por 5 y luego imprime su nuevo valor.
		Crea Variables Wrapper: Declara una variable de tipo Integer llamada hijos y asigna un valor de 2
		Uso de Variables: Declara dos variables de tipo String, nombre y apellido. Asigna tu nombre y 
		apellido a estas variables
		Imprime el siguiente mensaje utilizando System.out.println : 
		“Hola mi nombre es: [nombre] , tengo [años] años y tengo [hijos] hijos”*/
		
		int años = 20;
		años *= 5;
		
		Integer hijos = 2;
		String nombre = "Erick";
		String apellido = "Casarrubias";
		
		System.out.println(años);
		System.out.println("Hola mi nombre es: " + nombre + " " + apellido + ", tengo " + años + 
						   " años y tengo " + hijos + " hijos");
	}

}
