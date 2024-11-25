package ejercicios.ejemplos;

import java.util.Scanner;

public class Calculator {

	// SE AGREGAN VARIABLES TIPO WRAPPER
	private Double result;

	// SE AGREGA UN CONSTRUCTOR
	public Calculator() {
		this.result = 0.0;
		System.out.println("Hola Bienvenido a la calculadora del futuro...");
	}

	// SE AGREGAN GETTERS Y SETTERS
	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	// SE AGREGAN LOS METODOS ESTATICOS
	public static Double add(Double a, Double b) {
		return a + b;
	}

	public static Double subtract(Double a, Double b) {
		return a - b;
	}

	public static Double multiply(Double a, Double b) {
		return a * b;
	}

	public static String divide(Double a, Double b) {
		return b != 0 ? String.valueOf(a / b) : "Error: Division por cero";
	}

	// SE AGREGA EL METODO DE INSTANCIA
	public void square(Double number) {
		this.result = number * number;
	}

	// SE AGREGA UN METODO PARA MOSTRAR EL MENÚ
	private static void showMenu() {
		System.out.println("Selecciona una operacion:");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Elevar al cuadrado un numero");
		System.out.println("6. Salir...");
	}

	// SE AGREGA UN MÉTODO PARA LEER NÚMEROS
	private static Double readNumber(Scanner scanner, String message) {
		System.out.print(message);
		return Double.parseDouble(scanner.nextLine());
	}

	// METODO MAIN
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);

		// CICLO WHILE, MANEJO DE ERRORES Y SWITCH AND CASE
		while (true) {
			try {
				showMenu();
				String option = scanner.nextLine();

				if (option.equals("6")) {
					System.out.println("Saliendo...");
					break;
				}

				Double num1 = readNumber(scanner, "Ingresa el primer numero: ");
				Double num2 = option.equals("5") ? 0.0 : readNumber(scanner, "Ingresa el segundo numero: ");
				Double result = 0.0;

				switch (option) {
				case "1":
					//result = Calculator.add(num1, num2);
					Double resultado = Calculator.add(num1, num2);
					calculator.setResult(resultado);
					break;
				case "2":
					//result = Calculator.subtract(num1, num2);
					Double resultado1 = Calculator.subtract(num1, num2);
					calculator.setResult(resultado1);
					break;
				case "3":
					//result = Calculator.multiply(num1, num2);
					Double resultado2 = Calculator.multiply(num1, num2);
					calculator.setResult(resultado2);
					break;
				case "4":
					System.out.println("Resultado: " + Calculator.divide(num1, num2));
					continue;
				case "5":
					calculator.square(num1);
					result = calculator.getResult();
					break;
				default:
					System.out.println("Error: Operacion no valida");
					continue;
				}

				// System.out.println("El resultado es: " + result);
				System.out.println("El resultado es: " + calculator.getResult());
			} catch (NumberFormatException e) {
				System.out.println("Error: Por favor ingresa un numero valido.");
			} catch (Exception e) {
				System.out.println("Error: Ocurrio un problema inesperado.");
			} 
		}

		scanner.close();
	}
}
