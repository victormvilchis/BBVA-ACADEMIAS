package Viernes_22;

public class EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi = 3.1416;
		double radio = 10;
		double height = 10;
		
		lateralArea(pi, radio, height);
		totalArea(pi, radio);
		volume(pi, radio, height);
	}
	
	public static void lateralArea(double pi, double radio, double height) {

		Double lateralArea = new Double((2 * pi * radio * height));
		
		System.out.println("El area lateral es: " + lateralArea);
	}
	
	public static void totalArea(double pi, double radio) {
		
		Double totalArea = new Double((2 * pi * (radio * radio)));
			
		System.out.println("El area total del cilindro es: " + totalArea);
		}
	
	public static void volume(double pi, double radio, double height) {
		
		Double volume = new Double((2 * pi * (radio * radio) * height));
		
		System.out.println("El volumen del cilindro es: " + volume);
	}

}
