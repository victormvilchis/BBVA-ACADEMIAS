package Lunes_24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*En el método main, crea una instancia de la clase Calculadora y realiza llamadas a los diferentes métodos para realizar
		
		operaciones matemáticas y calcular el cuadrado de un número.*/
		
		Calculadora cal = new Calculadora();
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		String res;
		
		
		while(flag == true) {
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
		Integer option;
		System.out.println("Que operacion deseas realizar? 1.Suma, 2.Resta, 3.Multiplicacion, 4. Division, 5.Cuadrado de un numero, 6.Salir");
		option = sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Ingresa el primer numero");
			n1 = sc.nextDouble();
			System.out.println("Ingresa el segundo numero");
			n2 = sc.nextDouble();
			
			result = Calculadora.addition(n1, n2);
			System.out.println("El resultado de la suma es: " + result);
		break;
		
		case 2:
			System.out.println("Ingresa el primer numero");
			n1 = sc.nextDouble();
			System.out.println("Ingresa el segundo numero");
			n2 = sc.nextDouble();
			
			result = Calculadora.substraction(n1, n2);
			System.out.println("El resultado de la resta es: " + result);
		break;
		
		case 3:
			System.out.println("Ingresa el primer numero");
			n1 = sc.nextDouble();
			System.out.println("Ingresa el segundo numero");
			n2 = sc.nextDouble();
			
			result = Calculadora.multiplication(n1, n2);
			System.out.println("El resultado de la multiplicacion es: " + result);
		break;
		
		case 4:
			System.out.println("Ingresa el primer numero");
			n1 = sc.nextDouble();
			System.out.println("Ingresa el segundo numero");
			n2 = sc.nextDouble();
			
			result = Calculadora.division(n1, n2);
			System.out.println("El resultado de la division es: " + result);
		break;
		
		case 5:
			System.out.println("Ingresa el numero");
			n1 = sc.nextDouble();
			
			result = cal.numberSquare(n1);
			System.out.println("El resultado del cuadrado es: " + result);
		break;
		
		default:
			System.out.println("Opcion no valida, intenta de nuevo");
		break;
	}
	}
}
