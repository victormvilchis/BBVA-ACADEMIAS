package com.ejercicios.clase2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		final Double PI = 3.1416;
		final Integer CONSTANT = 2;
		Double height;
		Double radio;
		Scanner keyBoard = new Scanner(System.in);

		System.out.println("Vamos a calcular el área lateral de un Cilindro, su área total y su volumen.");

		try {
			System.out.println("Por favor digita la altura: ");
			height = keyBoard.nextDouble();

			System.out.println("Ahora digita por favor el radio:");
			radio = keyBoard.nextDouble();

			Double resultLateralArea = lateralArea(CONSTANT, PI, radio, height);
			System.out.println("El resultado de calcular su area lateral es de: " + resultLateralArea);

			System.out.println("Ahora vamos a calcular su área total");
			Double resultTotalArea = totalArea(resultLateralArea, CONSTANT, PI, radio);
			System.out.println("El resultado es: " + resultTotalArea);

			System.out.println("Ahora vamos a calcular su volumen.");
			Double resultVolume = volume(PI, radio, height);
			System.out.println("El resultado es: " + resultVolume);

			keyBoard.close();

		} catch (Exception e) {
			System.out.println("Ingresaste un valor erroneo");
			e.printStackTrace();
		}

		System.out.println("Hasta luego!!!");

	}

	public static Double lateralArea(Integer CONSTANT, Double PI, Double radio, Double height) {
		Double result = CONSTANT * PI * radio * height;
		return result;
	}

	public static Double totalArea(Double resultLateralArea, Integer CONSTANT, Double PI, Double radio) {
		Double resultTotalArea = resultLateralArea + (CONSTANT * PI * radio * radio);
		return resultTotalArea;
	}

	public static Double volume(Double PI, Double radio, Double height) {
		Double resultVolume = PI * radio * radio * height;
		return resultVolume;
	}
}
