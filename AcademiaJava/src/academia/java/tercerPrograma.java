/* Hacer un programa no menor a 40 líneas de código funcional, 
 * donde se empleen los temas vistos hasta el momento 
 * (Variables, Constantes y Operadores). No incluir ningún tema extra.*/
package academia.java;

public class tercerPrograma {
	//TODAS CON MAYÚSCULAS nombre clase 
	public static void main(String[] args) {
		// constantes utilizan final 
		 final int MAX_ALUMNOS = 5000;
		 final double COSTO_INSC = 1500;
		// variables
		String universidad = "TESE";
		Integer actAlum = 3000;
		Integer butacas = 4000;
		Integer salas = 30;
		Double presupuesto = 3000.20;
		//no primitivos, puras clases wrapper
		// operaciones
		//encerrar operaciones artimeticas con parentesis
		Double totalMatriculas = (actAlum * COSTO_INSC);
		Double alumnadoGAST = (presupuesto / actAlum);
		Integer totalMaterial = (butacas + salas);

		System.out.println("Hola, el nombre de la universidad es: " + universidad);
		System.out.println("El Maxino de alumnnados es de: " + MAX_ALUMNOS);
		System.out.println("El total de matriculas este año fue de " + totalMatriculas);
		System.out.println("El gasto de alumnado es de " + alumnadoGAST);
		System.out.println("El total de material disponible " + "para este cliclo escolar es de " + totalMaterial);
		
		System.out.println("¿En el TESE hay cupo disponible? " 
		+ ((actAlum < MAX_ALUMNOS)  ? "Si hay cupo" : "No hay cupo"));
//		
//		if (actAlum < MAX_ALUMNOS) {
//			System.out.println("En el tese hay cupo disponible");
//		} else {
//			System.out.println("Ya no hay cupo en el tese sorry");
//		}
	}
}
