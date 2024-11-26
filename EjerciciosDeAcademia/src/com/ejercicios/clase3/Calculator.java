package com.ejercicios.clase3;

import java.util.Scanner;
import java.util.InputMismatchException;

/* 

Define una clase llamada Calculadora que contenga los siguientes elementos:

	a. Un atributo llamado “resultado” para almacenar el resultado de las operaciones.

	b. Métodos estáticos para realizar operaciones matemáticas básicas: suma, resta, multiplicación y división.

	c. Un método de instancia para calcular el cuadrado de un número.

	d. Getters y setters para obtener y establecer el resultado de la calculadora.

	e. Un constructor que imprima un mensaje de bienvenida a la calculadora.

 En el método main, crea una instancia de la clase Calculadora y realiza llamadas a los diferentes métodos
 para realizar operaciones matemáticas y calcular el cuadrado de un número.

*/

public class Calculator {

	private Double result;
	private String welcome;
		
	public static void main(String[] args) {
		
		Double num1;
		Double num2;
		Boolean isNumber = false;
		
		Calculator welcome = new Calculator();
		welcome.setWelcome("HOLA, bienvenido!!!");
		System.out.println(welcome.getWelcome());
		welcome.setWelcome("Vamos a realizar las cuatro operaciones aritmeticas básicas.");
		System.out.println(welcome.getWelcome());
		welcome.setWelcome("(Suma, Resta, Multiplicación y División) y además obtendremos el cuadrado del primer número ingresado.\n");
		System.out.println(welcome.getWelcome());
		
		Scanner keyBoard = new Scanner(System.in);
		
		while(!isNumber) {
		try {
		
		welcome.setWelcome("Por favor.");
		System.out.println(welcome.getWelcome());
		
		askForNum1();
		num1 = keyBoard.nextDouble();
		
		askForNum2();
		num2 = keyBoard.nextDouble();
		
		addition(num1,num2);
		
		subtraction(num1, num2);
		
		multiplication(num1, num2);
		
		if(num2 != 0) {
		division(num1, num2);
		} else {
			System.out.println("No podemos dividir entre cero.");
		}
		
		Calculator squ = new Calculator();
		squ.squared(num1);
		
		isNumber = true;
				
		} catch (InputMismatchException e) {
			System.out.println("Error, ingresaste un valor incorrecto. Debes agregar un tipo de dato Double.");
			e.printStackTrace();
			System.out.println("\nINTENTALO DE NUEVO!!!!\n");
		}
		
		finally {
			//isNumber = false;
			keyBoard = new Scanner(System.in);
			}
		
		}
		isNumber = true;
		keyBoard.close();

	}
	
	public static void addition(Double num1, Double num2) {
		Calculator cal = new Calculator();
		cal.result = (num1 + num2);
//		cal.setResult(num1 + num2);
		System.out.println("El resultado de la suma es: " + cal.result);
//		return cal.result;
		return;
//		return cal.getResult();
	}
	
	public static void subtraction(Double num1, Double num2) {
		Calculator cal = new Calculator();
		cal.result = (num1 - num2);
//		cal.setResult(num1 - num2);
		System.out.println("El resultado de la resta es: " + cal.result);
//		return cal.result;
		return;
//		return cal.getResult();
	}
	
	public static void multiplication(Double num1, Double num2) {
		Calculator cal = new Calculator();
		cal.result = (num1 * num2);
//		cal.setResult(num1 * num2);
		System.out.println("El resultado de la multiplicacion es: " + cal.result);
//		return cal.result;
		return;
//		return cal.getResult();
	}
	
	public static void division(Double num1, Double num2) {
		Calculator cal = new Calculator();
		cal.result = (num1 / num2);
//		cal.setResult(num1 / num2);
		System.out.println("El resultado de la division es: " + cal.result);
//		return cal.result;
		return;
//		return cal.getResult();
	}
	
	public void squared(Double num1) {
		Calculator cal = new Calculator();
		cal.result = (num1 * num1);
//		cal.setResult(num1 * num1);
		System.out.println("El resultado del cuadrado del número es: " + cal.result);
//		return cal.result;
		return;
//		return cal.getResult();
	}
	
	public static void askForNum1() {
		String message = "Ingresa tu primer número: ";
		System.out.println(message);
		return;
	}
	
	public static String askForNum2() {
		String message = "Ingresa tu segundo número: ";
		System.out.println(message);
		return message;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}
	
	public String getWelcome() {
		return welcome;
	}
	
	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}
	


}
