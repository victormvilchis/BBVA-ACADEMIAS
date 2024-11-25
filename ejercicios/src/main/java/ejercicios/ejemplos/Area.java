package ejercicios.ejemplos;

import java.util.Scanner;

public class Area {


	public static void main(String[] args) {

		// SE DEFINE SCANNER
		Scanner scanner = new Scanner(System.in);

		// SE AGREGAN VARIABLES TIPO WRAPPER
		Double radius;
		Double height;
		Double volume;
		Double totalArea;
		Double lateralArea;
		
		// SE AGREGA CONSTANTE TIPO WRAPPER
		final Double PI = 3.14159;

		// CICLO WHILE Y MANEJO DE ERRORES SENCILLO
		while (true) {
			try {
				System.out.println("Ingresa el radio:");
				radius = scanner.nextDouble();
				System.out.println("Ingresa la altura:");
				height = scanner.nextDouble();
				if (radius < 0 || height < 0) {
					System.out.println("Error: Ingresa una cantidad valida");
				} else {
					lateralArea = (2 * PI * radius * height);
					totalArea = lateralArea + (2 * PI * (radius * radius));
					volume = (PI * (radius * radius) * height);

					// IMPRIMIR RESULTADO
					System.out.println("El area lateral es de: " + lateralArea);
					System.out.println("El area total es de: " + totalArea);
					System.out.println("El volumen es de: " + volume);
					break;
				}
			} catch (Exception e) {
				System.out.println("Error: Por favor ingresa un numero valido.");
				scanner.next();
			}
		}
		scanner.close();
	}
}
