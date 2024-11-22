package Viernes22Nov;
import java.util.Scanner;

public class TemasVistos {
	double num1;
	double num2;
	
	public double calculadora(int operador) {
		Scanner scanner = new Scanner(System.in);
		double result = 0.0;
		System.out.println("Ingresa un número");
		num1 = scanner.nextDouble();
		System.out.println("Ingresa otro número");
		num2 = scanner.nextDouble();
		switch(operador) {
			case 1: result = num1 + num2; break;
			case 2: result = num1 - num2; break;
			case 3: result = num1 * num2; break;
			case 4: result = num1 / num2; break;
			default : System.out.println("No éxiste esta opción"); break;
		}
		return result;
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido a la calculadora. Ingresa la opcion de la operación que deseas realizar \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División");
		int option = scanner.nextInt();
		double result = calculadora(option);
		System.out.println("El resultado de la operación es: " + result);
		
	}
}
