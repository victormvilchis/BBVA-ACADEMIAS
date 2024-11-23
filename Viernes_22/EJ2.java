package Viernes_22;

public class EJ2 {

	public static void main(String[] args) {
		final Double pi = 3.1416;
		Double radio = 10.12;
		Double height = 15.14;
		
		lateralArea(pi, radio, height);
		totalArea(pi, radio);
		volume(pi, radio, height);
	}
	
	public static void lateralArea(Double pi, Double radio, Double height) {

		Double lateralArea = (2 * pi * radio * height);
		
		System.out.println("El area lateral es: " + lateralArea);
	}
	
	public static void totalArea(Double pi, Double radio) {
		
		Double totalArea = ((2 * pi * (radio * radio))); 
			
		System.out.println("El area total del cilindro es: " + totalArea);
	}
	
	public static void volume(Double pi, Double radio, Double height) {
		
		Double volume = (2 * pi * (radio * radio) * height);
		
		System.out.println("El volumen del cilindro es: " + volume);
	}
	
}
