package Jueves21Nov;

public class PersonalInformation {
	int anios = 20;
	Integer hijos = 2;
	String nombre = "Joel";
	String apellidos = "Alcantara Salazar";
	
	public void aumentaEdad() {
		anios = anios * 5;
	}
	
	public void run() {
		aumentaEdad();
		System.out.println("Hola mi nombre es: " + nombre + " tengo " + anios + " años y " + hijos + " hijos."); 
		
	}

}
