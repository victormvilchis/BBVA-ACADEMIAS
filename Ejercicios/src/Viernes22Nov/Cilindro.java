package Viernes22Nov;

import java.util.Scanner;

public class Cilindro {
	final Double PI = 3.1416;

	public Double lateralArea(Double radio, Double height) {
		return (2 * PI * radio * height);
	}

	public Double totalArea(Double radio, Double height) {
		return (lateralArea(radio, height) + (2 * PI * (radio * radio)));
	}

	public Double volumen(Double radio, Double height) {
		return (PI * (radio * radio) * height);
	}

	public Double validateDouble(String msg, Scanner scanner) {
		Boolean flag = false;
		Double ret = 0.0;
		while (!flag) {
			System.out.println(msg);
			if (scanner.hasNextDouble()) {
				ret = scanner.nextDouble();
				if (ret <= 0) {
					System.out.println("El valor debe ser un número positivo. Inténtalo de nuevo");
					flag = false;
				} else {
					flag = true;
				}
			} else {
				System.out.println("Valor inválido. Introduce un número válido");
				flag = false;
				scanner.next();
			}
		}

		return ret;
	}

	public void run() {
		Double radio = null;
		Double height = null;
		Scanner scanner = new Scanner(System.in);

		radio = validateDouble("Introduce el radio (Debe ser un número positivo)", scanner);
		height = validateDouble("Introduce la altura (Debe ser un número positivo)", scanner);

		System.out.println("El área lateral del cilindro es: " + lateralArea(radio, height));
		System.out.println("El área total del cilindro es: " + totalArea(radio, height));
		System.out.println("El volumen del cilindro es: " + volumen(radio, height));

		scanner.close();

	}
}
