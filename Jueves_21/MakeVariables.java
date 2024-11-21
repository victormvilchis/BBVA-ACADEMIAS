package Jueves_21;

public class MakeVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variables();
	}
	
	public static void variables() {
		
		//Crear variables
		int years = 20;
		//Modificar variables
		years *= 5;
		System.out.println(years);
		
		//Crear variables wrapper
		Integer hijos = new Integer(2);
		
		//Uso de variables
		String nombre = "Nathanael", apellido = "Martinez";
		
		System.out.println("Hola mi nombre es: " + nombre + ", tengo " + years + " años " + "y tengo " + hijos + " hijos");
		
		
	}

}
