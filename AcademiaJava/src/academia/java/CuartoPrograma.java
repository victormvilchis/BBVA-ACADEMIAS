/* Desarrolla un programa en java que
 * calculre el area lateral, area total 
 * y volumen de un cilindro, datos
 * su radioCilindro y su alturaCilindro
 * area lateral: 2 x pi x radio x altura 
 * area de un cilindro : 2 x pi x radio * 2
 * volumen  de un cilindro se calcula como pi x radio x altura 
 * .*/
package academia.java;

import java.util.Scanner;

public class CuartoPrograma {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hola, por favor ingresa el radio del cilindro: ");
		double radioCilindro = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Hola, por favor ingresa la altura del cilindro: ");
		double alturaCilindro = Double.parseDouble(scanner.nextLine());
		
		double areaLateral = (2* Math.PI * radioCilindro * alturaCilindro);
		double aTotal = (areaLateral + 2 * Math.PI * Math.pow(radioCilindro, 2));

		double volumen = (Math.PI * Math.pow(radioCilindro, 2) * alturaCilindro);
		
		System.out.println("el area lateral es: " + areaLateral);
		System.out.println("el area total " + aTotal);
		System.out.println("el volumen es: " + volumen);
		
	}
}
