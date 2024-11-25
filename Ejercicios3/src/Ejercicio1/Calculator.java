package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Define una clase llamada Calculadora que contenga los siguientes elementos:
 
a. Un atributo llamado “resultado” para almacenar el resultado de las operaciones.
 
b. Métodos estáticos para realizar operaciones matemáticas básicas: suma, resta, multiplicación y división.
 
c. Un método de instancia para calcular el cuadrado de un número.
 
d. Getters y setters para obtener y establecer el resultado de la calculadora.
 
e. Un constructor que imprima un mensaje de bienvenida a la calculadora.
 
En el método main, crea una instancia de la clase Calculadora y realiza llamadas a los diferentes métodos para realizar operaciones matemáticas y calcular el cuadrado de un número.
 */
public class Calculator {
	private Double result;

	public Calculator()
	{
		this.result = 0.0;
		System.out.println("Welcome to the calculator! \n");
	}
	public static Double addition(Double num1, Double num2)
	{
		return num1 + num2;
	}
	public static Double subtraction(Double num1, Double num2)
	{
		return num1 - num2;
	}
	public static Double multiplication(Double num1, Double num2)
	{
		return num1 * num2;
	}
	public static Double division(Double num1, Double num2) 
	{
		return num1 / num2;
	}
	
	public Double calculateSquare(Double num)
	{
		Double result = num * num;
		this.setResult(result);
		return this.getResult();
	}
	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}
	
	public static void main(String[] args)
	{
		Double num1;
		Double num2;
		Double result = 0.0;
		Integer option;
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		try
		{
			System.out.println("Please choose an option: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("5. Square of a number");
			option = scanner.nextInt();
			
			switch(option)
			{
				case 1:
					System.out.println("Please enter two a numbers: ");
					num1 = scanner.nextDouble();
					num2 = scanner.nextDouble();
					result = Calculator.addition(num1, num2);
					System.out.println("The result of the addition is: " + result);
					break;
				case 2:
					System.out.println("Please enter two a numbers: ");
					num1 = scanner.nextDouble();
					num2 = scanner.nextDouble();
					result = Calculator.subtraction(num1, num2);
					System.out.println("The result of the subtraction is: " + result);
					break;
				case 3:
					System.out.println("Please enter two a numbers: ");
					num1 = scanner.nextDouble();
					num2 = scanner.nextDouble();
					result = Calculator.multiplication(num1, num2);
					System.out.println("The result of the multiplication is: " + result);
					break;
				case 4:
					try
					{
						System.out.println("Please enter two a numbers: ");
						num1 = scanner.nextDouble();
						num2 = scanner.nextDouble();
						result = Calculator.division(num1, num2);
						if(num2 !=0)
						{
							System.out.println("The result of the division is: " + result);
						}
						else
						{
							System.out.println("Cannot divide by zero");
						}
					} catch(IllegalArgumentException e)
					{
						System.out.println(e.getMessage());
					}
					break;
				case 5: 
					System.out.println("Please enter a number: ");
					num1 = scanner.nextDouble();
					calculator.calculateSquare(num1);
					result = calculator.getResult();
					System.out.println("The square of " + num1 + " is: " + result);
					break;
				default: 
					System.out.println("Invalid option");
					scanner.next();
					break;
			}
		} catch(InputMismatchException e){ 
			System.out.println("Invalid input."); 
		} finally { 
				scanner.close(); 
		}
		
	}	
}
