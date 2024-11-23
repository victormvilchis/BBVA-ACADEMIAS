/* Desarrolla un programa en java que
 * calculre el area lateral, area total 
 * y volumen de un cilindro, datos
 * su radioCilindro y su alturaCilindro
 * area lateral: 2 x pi x radio x altura 
 * area de un cilindro : 2 x pi x radio * 2
 * volumen  de un cilindro se calcula como pi x radio x altura 
 * .*/

package academia.java;

public class CuartoPrograma2 {
	public static void main(String [] args) {
//		final double AREA_LATERAL = 20;
//		final double AREA_TOTAL = 40;
//		final double VOLUMEN_CILIN = 30;
		final Double radio = 8.2;	
		//mayusculas
		//validaciones
		
		Double lateralArea = (2 * Math.PI * radio * 7);
		Double totalArea = (2 * Math.PI * radio * radio);
		Double totalVolumen = (Math.PI * radio * radio * 10);
		
		System.out.println("el area lateral es: " + lateralArea);
		System.out.println("el area total es: " + totalArea);
		System.out.println("el volumen total es: " + totalVolumen);
	}

}
