/*
 Define una clase llamada Calculadora que contenga los siguientes elementos:
	a. Un atributo llamado “resultado” para almacenar el resultado de las operaciones.
v	b. Métodos estáticos para realizar operaciones matemáticas básicas: suma, resta, multiplicación y división.
	c. Un método de instancia para calcular el cuadrado de un número.
	d. Getters y setters para obtener y establecer el resultado de la calculadora.
v	e. Un constructor que imprima un mensaje de bienvenida a la calculadora.
	   En el método main, crea una instancia de la clase Calculadora y realiza llamadas a los diferentes métodos para realizar operaciones matemáticas y calcular el cuadrado de un número.
	 * */

package com.academia.d03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	
	//Un atributo llamado “resultado” para almacenar el resultado de las operaciones:
	private Double result;
	
	//Un constructor que imprima un mensaje de bienvenida a la calculadora:
	public Calculadora() {
		//System.out.println("Welcome to calculator ...\n");
	}
	
	public void welcomeMsg(){
		System.out.println("Welcome to calculator ...\n");
	}
	
	//Métodos estáticos para realizar operaciones matemáticas básicas: suma, resta, multiplicación y división:
	public static Double addition(Double n1, Double n2) {
		return (n1 + n2);
	}
	
	public static Double subtraction(Double n1, Double n2) {
		return (n1 - n2);
	}
	
	public static Double multiplication(Double n1, Double n2) {
		return (n1 * n2);
	}
	
	public static Double division(Double n1, Double n2) {
		if(n2!=0) {
			return (n1 / n2);
		} else {
			return null;
		}
	}
	
	//Un método de instancia para calcular el cuadrado de un número:
	public Double squareNum(Double num) {
		//return this.result = (num * num);
		return (num * num);
	}
	
	//Getters y setters para obtener y establecer el resultado de la calculadora:
	public Double getResult() {
		return result;
	}
	
	public void setResult(Double result) {
		this.result = result;
	}
		
	
	public static void main(String[] args) {
		//Instancia de mensaje y métodos
		Calculadora cal = new Calculadora();
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		
		while(continuar) {
			
			try {	
				cal.welcomeMsg();
				System.out.print("Enter Value 1: ");
				Double n1 = sc.nextDouble();
				sc.nextLine();
				System.out.print("Enter Value 2: ");
				Double n2 = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("\n¿Qué desea hacer? \n"
						+ "1) Addition\n" 
						+ "2) Subtraction\n"
						+ "3) Multiplication\n"
						+ "4) Division\n"
						+ "5) Square\n"
						+ "6) Exit Calculator\n");
				System.out.print("Seleccione una opción: ");
				
				Integer opc = sc.nextInt();
				sc.nextLine();
				
				switch(opc) {
				
					case 1: 
						//Double resSuma = Calculadora.addition(n1, n2);
						cal.setResult(Calculadora.addition(n1, n2));
						System.out.print("Result: " + String.format("%.4f", cal.getResult()));
						break;
					
					case 2: 
						//Double resResta = Calculadora.subtraction(n1, n2);
						cal.setResult(Calculadora.subtraction(n1, n2));
						System.out.print("Result: " + String.format("%.4f", cal.getResult()));
						break;
						
					case 3: 
						//Double resMultiplicacion = Calculadora.multiplication(n1, n2);
						cal.setResult(Calculadora.multiplication(n1, n2));
						System.out.print("Result: " + String.format("%.4f", cal.getResult()));
						break;
						
					case 4: 
						//Double resDivision = Calculadora.division(n1, n2);
						if ( (Calculadora.division(n1, n2) ) != null){
							cal.setResult(Calculadora.division(n1, n2));
							System.out.print("Result: " + String.format("%.4f", cal.getResult()));
						} else {
							System.out.println("Error, No division by Zero\n");
						}
						break;
						
					case 5:
						//Instancia de cuadrado:
						System.out.print("Enter a new Value: ");
						
						try {
							Double newValue = sc.nextDouble();
							sc.nextLine();
							Double cuadrado = new Double(cal.squareNum(newValue));
							cal.setResult(cuadrado);
							System.out.println("Square result: " + String.format("%.4f", cal.getResult()) + "\n");
						} catch (InputMismatchException | NumberFormatException e){
							System.out.println("Invalid Input Data..." + " Log: " + e + "\n");
						}
						break;
						
					case 6:
						continuar = false;
						System.out.println("Thank you for usaing the Calculator...");
						break;
						
					default:
						System.out.println("Error, Value Out of Range.. Try Again\n");
				}
			
			} catch (InputMismatchException | NumberFormatException e){
				System.out.println("Invalid Input Data..." + " Log: " + e + "\n");
				sc.nextLine();
			}
			
		}
		sc.close();
		System.exit(0);
	}

}
