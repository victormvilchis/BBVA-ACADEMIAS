package Calculator;

import java.util.Scanner;

/* Define una clase llamada Calculadora que contenga los siguientes elementos:
 * a. Un atributo llamado “resultado” para almacenar el resultado de las operaciones.
 * b. Métodos estáticos para realizar operaciones matemáticas básicas: suma, resta, multiplicación 
 * y división.
 * c. Un método de instancia para calcular el cuadrado de un número.
 * d. Getters y setters para obtener y establecer el resultado de la calculadora.
 * e. Un constructor que imprima un mensaje de bienvenida a la calculadora.
 * En el método main, crea una instancia de la clase Calculadora y realiza llamadas a los diferentes 
 * métodos para realizar operaciones matemáticas y calcular el cuadrado de un número.
 */

public class Calculator {
	// a
	private Double result;
	
	//b
	public static Double sum(Double num1, Double num2) {
		return (num1 + num2);
	}
	
	public static Double subtract(Double num1, Double num2) {
		return (num1 - num2);
	}
	
	public static Double multiply(Double num1, Double num2) {
		return (num1 * num2);
	}
	
	public static Double divide(Double num1, Double num2) {
		return (num1 / num2);
	}
	
	// c
	public Double calSquare(Double num1) {
		return Math.pow(num1, 2);
	}
	
	// d
	public Double getResult() {
		return result;
	}
	
	public void setResult(Double result) {
		this.result = result;
	}
	
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		
		Double num1 = null;
		Double num2 = null;
		Boolean validation = false;
		
		Calculator calculator = new Calculator();
		System.out.println("Welcome to the APX Academy Calculator");
		
		while(!validation) {
			try {
				System.out.print("Enter a number: ");
				String num1In = entry.nextLine().trim();
				
				if(num1In.contains(" ")) {
					num1In = num1In.split(" ")[0];
				}
				num1 = Double.parseDouble(num1In);
				
				if(num1 > 0) {
					validation = true;
				} else {
					System.out.println("¡Dont enter negative numbers or zero!");
				}
			} catch(NumberFormatException exc) {
				System.out.println("¡Dont enter letters!");
			}
		}
		validation = false;
		
		while(!validation) {
			try {
				System.out.print("Enter another number: ");
				String num2In = entry.nextLine().trim();
				
				if(num2In.contains(" ")) {
					num2In = num2In.split(" ")[0];
				}
				num2 = Double.parseDouble(num2In);
				
				if(num2 > 0) {
					validation = true;
				} else {
					System.out.println("¡Dont enter negative numbers or zero!");
				}
			}catch(NumberFormatException exc) {
				System.out.println("¡Dont enter letters!");
			}
		}
		
		Double sum = Calculator.sum(num1, num2);
		Double sub = Calculator.subtract(num1, num2);
		Double mul = Calculator.multiply(num1, num2);
		Double div = Calculator.divide(num1, num2);
		
		Double squa = calculator.calSquare(num1);
		
		calculator.setResult(sum);
		System.out.print("\nSum result: "+calculator.getResult());
		
		calculator.setResult(sub);
		System.out.print("\nSubtraction result: "+calculator.getResult());
		
		calculator.setResult(mul);
		System.out.print("\nMultiplication result: "+calculator.getResult());
		
		calculator.setResult(div);
		System.out.print("\nDivision result: "+calculator.getResult());
		
		calculator.setResult(squa);
		System.out.print("\nThe square of the first number is: "+calculator.getResult());
		entry.close();
	}
}
