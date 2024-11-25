package Lunes25Nov;

import java.util.Scanner;

public class Calculator {
	Double result;
	Double firstNum;
	Double secondNum;
	
	public Calculator() {
		
		this.result = 0.0;
		this.firstNum = 0.0;
		this.secondNum = 0.0;	
	}
	
	public Double getDouble(String msg, Scanner scanner) {
		Boolean flag = false;
		Double ret = 0.0;
		while (!flag) {
			System.out.println(msg);
			if (scanner.hasNextDouble()) {
				ret = scanner.nextDouble();
				flag = true;

			} else {
				System.out.println("Valor inválido. Introduce un número válido");
				flag = false;
				scanner.next();
			}
		}

		return ret;
	}
	
	public void setValues() {
		Scanner scanner = new Scanner(System.in);
		this.firstNum = getDouble("Ingresa un número", scanner);
		this.secondNum = getDouble("Ingresa otro número", scanner);
	}
	
	public static Double  getAdition() {
		Calculator calculatorObj = new Calculator();
		calculatorObj.setValues();
		calculatorObj.result = calculatorObj.firstNum + calculatorObj.secondNum;
		return calculatorObj.result;
	}
	
	public static Double  getSubstraction() {
		Calculator calculatorObj = new Calculator();
		calculatorObj.setValues();
		calculatorObj.result = calculatorObj.firstNum - calculatorObj.secondNum;
		return calculatorObj.result;
	}
	
	public static Double  getMultiplication() {
		Calculator calculatorObj = new Calculator();
		calculatorObj.setValues();
		calculatorObj.result = calculatorObj.firstNum * calculatorObj.secondNum;
		return calculatorObj.result;
	}
	
	public static Double  getDivision() {
		Calculator calculatorObj = new Calculator();
		calculatorObj.setValues();
		calculatorObj.result = calculatorObj.firstNum / calculatorObj.secondNum;
		return calculatorObj.result;
	}
	
	public Double getSquareRoot() {
		Scanner scanner = new Scanner(System.in);
		this.firstNum = this.getDouble("Ingresa el número que quieres que se calcule la raíz cuadrada",scanner);
		this.result = this.firstNum * this.firstNum;
		return this.result;
	}
	
	
	
	
}
