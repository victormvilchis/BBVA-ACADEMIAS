package ejerciciosNivelacion_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Definir la clase Main:
	// - Crea una clase llamada Main.
public class Main {
	
	public static Integer validateAge(Scanner in) {
		Boolean valid = false; 
		Integer number = 0;
		
		while (!valid) { 
			System.out.print("Enter your age: "); 
			String input = in.nextLine(); 
			try {
				number = Integer.parseInt(input); 
				if(number >= 18 && number <= 140) {
					valid = true;
				}
				else {
					System.out.println("You cannot enter a number less than 18 and greater than 140");
				}
			} 
			catch (NumberFormatException e) { 
				System.out.println("Invalid entry. Please enter a valid number.\n"); 
			} 
		}
		return number;
	}
	
	public static Double validateSalary(Scanner in) {
		Boolean valid = false; 
		Double number = 0.0;
		
		while (!valid) { 
			System.out.print("Enter your salary:"); 
			String input = in.nextLine(); 
			try { 
				number = Double.parseDouble(input);
				if(number >= 0) {
					valid = true;
				}
				else {
					System.out.println("you cannot enter a number less than 0");
				}
			} 
			catch (NumberFormatException e) { 
				System.out.println("Invalid entry. Please enter a valid decimal number.\n"); 
			} 
		} 
		return number;
	}
	
	public static String validateName(Scanner in) {
		Boolean valid = false;
		String name = "";
		
		while (!valid) {
			System.out.print("Enter your name: "); 
			String input = in.nextLine();
			
			Pattern regex = Pattern.compile("^[A-Za-z]{1,20}$");
			Matcher validate = regex.matcher(input);
			boolean value = validate.matches();
			
			if(value) {
				valid = true;
				name = input;
			}
			else {
				System.out.println("Enter only letters without spaces and up to 20 characters");
			}
		} 
		return name;
	}
	
	public static void main(String[] args) {
		
		String name;
		Integer age = 0;
		Double salary = 0.0;
		
		Scanner in = new Scanner(System.in);
		Employee[] employeeList = new Employee[3];
		
		System.out.print("Hello to start, enter the data for 3 employees\n\n");
		
		// - En el método main, crea tres objetos Empleado con diferentes valores de nombre, edad y salario.
		for(Integer i=0 ;i<employeeList.length; i++) {
			name = validateName(in);
			age = validateAge(in);
			salary = validateSalary(in);
			
			employeeList[i] = new Employee(name, age, salary);
		}
		
		// - Utiliza un bucle do-while para aumentar el salario del primer empleado hasta que alcance al menos $5000.
		do {
			if(employeeList[0].getSalary() < 5000) {
				employeeList[0].increaseSalary();
			}
			for(Integer i=0 ;i<employeeList.length; i++) {
				employeeList[i].printInformation();
			}
		}while(employeeList[0].getSalary() < 5000);
		
		// - Verifica si el segundo empleado es joven y, si lo es, aumenta su salario en un 10%.
		if(employeeList[1].isYoung()) {
			employeeList[1].increaseSalary();
		}
		System.out.println("\n");
		employeeList[1].printInformation();
		
		// - Calcula y muestra el salario anual de cada empleado.
		System.out.println("\n");
		for(Integer i=0 ;i<employeeList.length; i++) {
			employeeList[i].salaryAnnual();
		}
		
		// - Imprime el número total de empleados utilizando el método estático getTotalEmpleados().
		System.out.println("\n");
		System.out.println("The total number of employees is: " + Employee.totalEmployees());
		
		in.close();
	}
}
