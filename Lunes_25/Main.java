package Lunes_25;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		/*En el método main, crea una instancia de la clase Calculadora y realiza llamadas a los diferentes métodos para realizar
		
		operaciones matemáticas y calcular el cuadrado de un número.*/
		
		Calculadora cal = new Calculadora();
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		String res;
		
		
		while(flag) {
			cal.welcome();
			
			panel();
			System.out.println("Deseas realizar otra operacion? S/N");
			res = sc.nextLine();
			
			if(res.toLowerCase().equals(" ")) {
				
			}else if(!res.toLowerCase().equals("s")) {
				
				System.out.println("Hasta pronto");
				flag = false;
				
			}else if(res.toLowerCase().equals("n")) {
				panel();
			}
		}
	}
	
	private static void panel() {
		Calculadora cal = new Calculadora();
		Scanner sc = new Scanner(System.in);
		Double n1, n2, result;
		String res1, res2, option;
		System.out.println("Que operacion deseas realizar? 1.Suma, 2.Resta, 3.Multiplicacion, 4. Division, 5.Cuadrado de un numero, 6.Salir");
		option = sc.next();
		
		switch(option) {
		case "1":
			
			try {
				
				System.out.println("Ingresa el primer numero");
				res1 = sc.next();
				System.out.println("Ingresa el segundo numero");
				res2 = sc.next();
				
				n1 = Double.parseDouble(res1);
				n2 = Double.parseDouble(res2);
				
				
				
				if (n1 < 0 || n2 < 0) {
					System.out.println("Por favor ingresa numeros positivos");
					System.out.println("Ingresa el primer numero");
					n1 = sc.nextDouble();
					System.out.println("Ingresa el segundo numero");
					n2 = sc.nextDouble();
				}else {
					result = Calculadora.addition(n1, n2);
					System.out.println("El resultado de la suma es: " + result);
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Ingresa el solo numeros");
				panel();
			}
			
		break;
		
		case "2":
			
			try {
				
				System.out.println("Ingresa el primer numero");
				res1 = sc.next();
				System.out.println("Ingresa el segundo numero");
				res2 = sc.next();
				
				n1 = Double.parseDouble(res1);
				n2 = Double.parseDouble(res2);
				
				if (n1 < 0 || n2 < 0) {
					System.out.println("Por favor ingresa numeros positivos");
					System.out.println("Ingresa el primer numero");
					n1 = sc.nextDouble();
					System.out.println("Ingresa el segundo numero");
					n2 = sc.nextDouble();
				}else {
					result = Calculadora.substraction(n1, n2);
					System.out.println("El resultado de la resta es: " + result);
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Ingresa el solo numeros");
				panel();
			}
			
			
		break;
		
		case "3":
			
			try {
				
				System.out.println("Ingresa el primer numero");
				res1 = sc.next();
				System.out.println("Ingresa el segundo numero");
				res2 = sc.next();
		
				n1 = Double.parseDouble(res1);
				n2 = Double.parseDouble(res2);
				
				if (n1 < 0 || n2 < 0) {
					System.out.println("Por favor ingresa numeros positivos");
					System.out.println("Ingresa el primer numero");
					n1 = sc.nextDouble();
					System.out.println("Ingresa el segundo numero");
					n2 = sc.nextDouble();
				}else {
					result = Calculadora.multiplication(n1, n2);
					System.out.println("El resultado de la multiplicacion es: " + result);
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Ingresa el solo numeros");
				panel();
			}
			
		break;
		
		case "4":
			
			try {
				
				System.out.println("Ingresa el primer numero");
				res1 = sc.next();
				System.out.println("Ingresa el segundo numero");
				res2 = sc.next();
		
				n1 = Double.parseDouble(res1);
				n2 = Double.parseDouble(res2);
				
				if (n1 < 0 || n2 < 0) {
					System.out.println("Por favor ingresa numeros positivos");
					System.out.println("Ingresa el primer numero");
					n1 = sc.nextDouble();
					System.out.println("Ingresa el segundo numero");
					n2 = sc.nextDouble();
				}else {
					result = Calculadora.division(n1, n2);
					System.out.println("El resultado de la division es: " + result);
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Ingresa el solo numeros");
				panel();
			}
			
		break;
		
		case "5":
			
			try {
				
				System.out.println("Ingresa el primer numero");
				res1 = sc.next();
		
				n1 = Double.parseDouble(res1);
				if (n1 < 0) {
					System.out.println("Por favor ingresa numeros positivos");
					System.out.println("Ingresa el primer numero");
					n1 = sc.nextDouble();
					System.out.println("Ingresa el segundo numero");
					n2 = sc.nextDouble();
				}else {
					result = cal.numberSquare(n1);
					System.out.println("El resultado del cuadrado es: " + result);
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Ingresa el solo numeros");
				panel();
			}
			
			
		break;
		
		default:
			System.out.println("Opcion no valida, intenta de nuevo");
		break;
	}
	}
}
