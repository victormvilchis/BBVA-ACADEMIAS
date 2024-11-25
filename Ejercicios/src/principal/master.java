package principal;
import java.util.Scanner;
import java.util.InputMismatchException;
import Jueves21Nov.PersonalInformation;
import Jueves21Nov.Radio;
import Viernes22Nov.TemasVistos;
import Viernes22Nov.Cilindro;
import Lunes25Nov.Calculator;
public class master {
	public static void main(String[] args) {
		Boolean flag = true;
		Boolean flagOption = true;
		String option = "";
		String desition = "";
		Scanner scanner = new Scanner(System.in);
		PersonalInformation personalObj = new PersonalInformation();
		TemasVistos temasObj = new TemasVistos();
		Cilindro cilindroObj = new Cilindro();
		Radio radio = new Radio();
		do {
			System.out.println("Ingresa el número del ejercicio que deseas ejecutar "
					+ "\n 1. Información personal (21-11-2024) "
					+ "\n 2. Área circulo (21-11-2024) "
					+ "\n 3. Temas vistos (22-11-2024)"
					+ "\n 4. Cilindro (22-11-2024)"
					+ "\n 5. Calculator (25-11-2024)");

	        option = scanner.nextLine();
	        option = option.replaceAll("\\s+", "");
			 
			
			 
	        switch(option) {
				case "1" : personalObj.run(); break;
				case "2":	radio.run(); break;
				case "3":	temasObj.run(); break;
				case "4":	cilindroObj.run(); break;
				case "5":	
					System.out.println("----------------------------------------------\n Bienvenido a la calculadora 25-11-2024\n----------------------------------------------\n");
					
					Boolean flagS = false;
					do {
						System.out.println("¿Qué operación deseas realizar?\n"
								+ "   1. Suma\n"
								+ "   2. Resta\n"
								+ "   3. Multiplicación\n"
								+ "   4. División\n"
								+ "   5. Raíz cuadrada\n");
						
						String optionS = scanner.nextLine();
						optionS = optionS.replaceAll("\\s+", "");
						switch(optionS) {
							case "1":  
										System.out.println("El resultado de la suma es " + Calculator.getAdition());
										break;
							case "2":  
										System.out.println("El resultado de la resta es " + Calculator.getSubstraction());
										break;
							case "3":  
										System.out.println("El resultado de la multiplicación es " + Calculator.getMultiplication());
										break;
							case "4":  
										System.out.println("El resultado de la división es " + Calculator.getDivision());
										break;
							case "5": 
								Calculator calculatorObj = new Calculator();
								Double res = calculatorObj.getSquareRoot();
								System.out.println("El resultado de la raíz es " + res);
								break;
							default: System.out.println("Esta opcion no existe " );
							break;
						}
						
						System.out.println("Deseas realizar otra operacion 1. Si 2. No");
						
						String optionR = scanner.nextLine();
						optionR = optionR.replaceAll("\\s+", "");
						
						if(optionR.equals("1")) {
							flagS = true;
						}
						
						
					}while(flagS);
				break;
				default: System.out.println("Esta opción no éxiste"); break;
			}
			
			
			System.out.println("¿Deseas probar otro ejercicio? \n 1. Si 2. No \n Si Ingresas una opción diferente el programa terminará");
			desition = scanner.nextLine();
			
			if(desition.equals("1")) {
				flag = true;
			}
			else {
				flag = false;
			}
			
		}while(flag);
		
		
	}
	
}
