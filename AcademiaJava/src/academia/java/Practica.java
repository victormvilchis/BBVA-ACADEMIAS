package academia.java;

import java.util.Scanner;
//import java.util.InputMismatchException;

public class Practica {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// try {
//	            System.out.print("Introduce el radio del cilindro: ");
//	            double radio = scanner.nextDouble();
//
//	            System.out.print("Introduce la altura del cilindro: ");
//	            double altura = scanner.nextDouble();
//
//	            double areaLateral = (2 * Math.PI * radio * altura);
//	            double areaTotal = areaLateral + 2 * Math.PI * radio * radio;
//	            double volumen = Math.PI * radio * radio * altura;
//
//	            System.out.println("Área lateral del cilindro: " + areaLateral);
//	            System.out.println("Área total del cilindro: " + areaTotal);
//	            System.out.println("Volumen del cilindro: " + volumen);
//	        } catch (InputMismatchException e) {
//	            System.out.println("Error: Por favor, introduce un número válido.");
//	        } finally {
//	            scanner.close();
//	        }

		double radio = 0, altura = 0;
		boolean validInput;

		do {
			try {
				System.out.print("Introduce el radio del cilindro: ");
				radio = Double.parseDouble(scanner.nextLine());
				if (radio <= 0)
					throw new NumberFormatException("El radio debe ser mayor que cero.");
				validInput = true;
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida: " + e.getMessage());
				validInput = false;
			}
		} while (!validInput);
		

		do {
			try {
				System.out.print("Introduce la altura del cilindro: ");
				altura = Double.parseDouble(scanner.nextLine());
				if (altura <= 0)
					throw new NumberFormatException("La altura debe ser mayor que cero.");
				validInput = true;
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida: " + e.getMessage());
				validInput = false;
			}
		} while (!validInput);

		double areaLateral = 2 * Math.PI * radio * altura;
		double areaTotal = areaLateral + 2 * Math.PI * radio * radio;
		double volumen = Math.PI * radio * radio * altura;

		System.out.println("Área lateral del cilindro: " + areaLateral);
		System.out.println("Área total del cilindro: " + areaTotal);
		System.out.println("Volumen del cilindro: " + volumen);
        scanner.close();

	}
}
