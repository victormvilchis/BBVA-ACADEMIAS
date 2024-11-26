package Clase3;

/*Define una clase llamada Calculator que contenga los siguientes elementos:
a. Un atributo llamado “resultado” para almacenar el resultado de las operaciones.
b. Métodos estáticos para realizar operaciones matemáticas básicas: suma, resta, multiplicación y división.
c. Un método de instancia para calcular el cuadrado de un número. 
d. Getters y setters para obtener y establecer el resultado de la calculadora.
e. Un constructor que imprima un mensaje de bienvenida a la calculadora.
En el método main, crea una instancia de la clase Calculator y 
realiza llamadas a los diferentes métodos para realizar operaciones matemáticas
y calcular el cuadrado de un número.*/
import java.util.Scanner;

public class Calculator {
	// atributo para almacenar resultado
	private Double result;

	// constructor sin argumento que imprime mensaje de bienvenida
	public Calculator() {
		System.out.println("Welcome");
	}

	// metodos estaticos
	public static Double add(Double a, Double b) {
		return (a + b);
	}

	public static Double substract(Double a, Double b) {
		return (a - b);
	}

	public static Double multiply(Double a, Double b) {
		return (a * b);
	}

	public static Double divide(Double a, Double b) {
		return (a / b);
	}

	public Double square(Double number) {
		return (number * number);
	}

	// metodo de acceso get devuelve el valor result, metodos mutadores set modifica
	// el valor)
	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public static void main(String[] args) {
		// intancia de la clase claculadora
		Scanner scanner = new Scanner(System.in);// interactuar con el usuario
		Calculator calculator = new Calculator();
		// llama a los metodos e imprime resultados con try catch para el manejo de excepciones
		try {
			System.out.println("Enter first number: ");
			Double number1 = scanner.nextDouble();

			System.out.println("Enter second number: ");
			Double number2 = scanner.nextDouble();

			Double sum = Calculator.add(number1, number2);
			System.out.println("Sum: " + sum);

			Double sub = Calculator.substract(number1, number2);
			System.out.println("Substract: " + sub);

			Double mult = Calculator.multiply(number1, number2);
			System.out.println("Multiply: " + mult);

			if (number2 != 0) {
				Double div = Calculator.divide(number1, number2);
				System.out.println("Divide: " + div);
			} else {
				System.out.println("Division can´t be performed");
			}
			// pide numero para calcular el cuadrado
			System.out.println("Enter a number to calculate it´s square: ");
			Double squareInput = scanner.nextDouble();
			// llama al metodo de instancia
			Double square = calculator.square(squareInput);
			System.out.println("Square of " + squareInput + ": " + square);
			// getter:imprime y setter:almacena
			calculator.setResult(square);
			System.out.println("resul: " + calculator.getResult());

			// captura posibles entradas invalidas
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
			// cierro recurso
		} finally {
			scanner.close();
		}
	}
}
