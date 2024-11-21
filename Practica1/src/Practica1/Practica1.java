package Practica1;

/* Crear Variables: Declara una variable de tipo int llamada años y 
 * asigna un valor inicial de 20. Modificar Variables: Aumenta el valor de la variable años 
 * por 5 y luego imprime su nuevo valor.
 * Crea Variables Wrapper: Declara una variable de tipo Integer llamada hijos y asigna un valor de 2
 * Uso de Variables: Declara dos variables de tipo String, nombre y apellido. Asigna tu nombre y apellido 
 * a estas variables Imprime el siguiente mensaje utilizando 
 * System.out.println : “Hola mi nombre es: [nombre] , tengo [años] años y tengo [hijos] hijos”
 */

public class Practica1 {
	public static void main(String[] args) {
		int años = 20;
		años += 5;
		System.out.println(años);
		Integer hijos = 2;
		String nombre = "Carolina", apellido = "Samperio";
		System.out.println("Hola mi nombre es: "+nombre+" "+apellido+" tengo "+años+" años y tengo "+hijos+" hijos");
	}
}
