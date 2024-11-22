package Operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		final double METROS_A_CENTIMETROS = 100.0;
		final double KILOGRAMOS_A_GRAMOS = 1000.0;
		
		int opcion;
		double valor;
		double resultado;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hola, bienvenido ¿Qué informacion deseas?");
		System.out.println("elige una opcion");
		System.out.println("1 Convertir de metros a centimetros");
		System.out.println("2 Convertir de kilogramos a gramos");
		System.out.println("Ingresa tu opción: ");
		
		opcion = scanner.nextInt();
	
		if(opcion ==1) {
			System.out.println("ingresa el valor en metros: ");
			valor = scanner.nextDouble();
			resultado = valor* METROS_A_CENTIMETROS;
			System.out.println("el resultado es: "+ resultado);
		}else if (opcion ==2){
				System.out.println("ingresa el valor en metros: ");
				valor = scanner.nextDouble();
				resultado = valor* KILOGRAMOS_A_GRAMOS;
				System.out.println("el resultado es: "+ resultado);
		}
		
		scanner.close();
	}
}
