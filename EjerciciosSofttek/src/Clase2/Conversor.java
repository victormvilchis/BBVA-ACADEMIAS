package Clase2;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {

		final double METROS_A_CENTIMETROS = 100.0;
		final double KILOGRAMOS_A_GRAMOS = 1000.0;
		final double LIBRAS_A_TONELADAS = 2204.62;

		int opcion;
		double valor;
		double resultado;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hola, bienvenido ¿Qué información deseas?");
		System.out.println("Elige una opción");
		System.out.println("1 Convertir de metros a centimetros");
		System.out.println("2 Convertir de kilogramos a gramos");
		System.out.println("3 Convertir de libras a toneladas");
		System.out.println("Ingresa tu opción: ");

		opcion = scanner.nextInt();

		if (opcion == 1) {

			System.out.println("ingresa el valor en metros: ");
			valor = scanner.nextDouble();
			resultado = valor * METROS_A_CENTIMETROS;
			System.out.println("el resultado es: " + resultado + " metros");
		} else if (opcion == 2) {

			System.out.println("ingresa el valor en kilogramos: ");
			valor = scanner.nextDouble();
			resultado = valor * KILOGRAMOS_A_GRAMOS;
			System.out.println("el resultado es: " + resultado + " gramos");
		} else if (opcion == 3) {

			System.out.println("ingresa el valor en kilogramos: ");
			valor = scanner.nextDouble();
			resultado = valor / LIBRAS_A_TONELADAS;
			System.out.println("el resultado es: " + resultado + " toneladas");
		}

		scanner.close();
	}
}
