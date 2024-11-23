package Practica3;
// Desarrolla un programa que calcule el area lateral, area total y volumen de un cilindro

public class Practica3 {
	public static void main(String[] args) {
		final Double PI = 3.1416;
		Integer radio = 10;
		Integer height = 15;
		Double lateralArea;
		Double totalArea;
		Double volume;
		Double baseArea = (2 * PI * (radio * radio));
		
		lateralArea = (2 * PI * radio * height);
		totalArea = (lateralArea + baseArea);
		volume = (PI * (radio * radio) * height);
		
		System.out.println("Lateral area: "+lateralArea);
		System.out.println("Total area: "+totalArea);
		System.out.println("Volume: "+volume);
	}
}
