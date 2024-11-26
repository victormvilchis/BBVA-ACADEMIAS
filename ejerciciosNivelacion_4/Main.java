package ejerciciosNivelacion_4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Definir la clase Main:
	// - Crea una clase llamada Main.
public class Main {

	public static void main(String[] args) {
		
		// - En el método main, crea tres objetos Empleado con diferentes valores de nombre, edad y salario.
		Employee employee_1 = new Employee("Erick", 23, 3962.35);
		Employee employee_2 = new Employee("Luis" , 25, 2696.54);
		Employee employee_3 = new Employee("Pedro", 26, 5163.71);
		
		// - Utiliza un bucle do-while para aumentar el salario del primer empleado hasta que alcance al menos $5000.
		do {
			 employee_1.increaseSalary();
			 
			// - Imprime la información de todos los empleados después de cada operación.
			 employee_1.printInformation();
			 employee_2.printInformation();
			 employee_3.printInformation();
			 
		}while(employee_1.getSalary() < 5000);
		
		// - Verifica si el segundo empleado es joven y, si lo es, aumenta su salario en un 10%.
		if(employee_2.isYoung()) {
			employee_2.increaseSalary();
		}
		System.out.println("\n");
		employee_2.printInformation();
		
		// - Calcula y muestra el salario anual de cada empleado.
		System.out.println("\n");
		employee_1.salaryAnnual();
		employee_2.salaryAnnual();
		employee_3.salaryAnnual();
		
		// - Imprime el número total de empleados utilizando el método estático getTotalEmpleados().
		System.out.println("\n");
		System.out.println("The total number of employees is: " + Employee.totalEmployees());
		
		
		
		// ***********************************************************************************************************
		// Sección extra para pedir empleados y almacenarlos en un Arraylist.
		
		/*
		 	Nota: Me faltó realizar un menú el cual esté ligado a los métodos que se puedes hacer en los empleados
		 	y que desde la consola eligiera el empleado que quiere seleccionar y posteriormente un menu que le diga 
		 	lo que puede hacer del empleado.
		*/
		
		String name;
		Integer age = 0,employees = 0;
		Double salary = 0.0;
		
		Scanner in = new Scanner(System.in);
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		System.out.print("Hello! how many employees do you want to add? ");
		employees = in.nextInt();
		in.nextLine().trim();
		
		for(Integer i=1 ;i<=employees; i++) {
			
			System.out.print("Enter your name: ");
			name = in.nextLine().trim();
			try {
				System.out.print("Enter your age: ");
				if(in.hasNextInt()) {
					age = in.nextInt();
					in.nextLine().trim();
				}
				else {
					System.out.print("you can only enter numbers");
					in.next();
				}
				
				System.out.print("Enter your salary: ");
				if(in.hasNextDouble()) {
					salary = in.nextDouble();
					in.nextLine().trim();
				}
				else {
					System.out.print("you can only enter numbers");
					in.next();
				}
				
				if((age >= 0 && age <= 140) && (salary >= 0)){
					Employee employee = new Employee(name, age, salary);
					employeeList.add(employee);
				}
				
				else {
					System.out.println("NOTE: The age range is from 0 to 140 and the salary cannot be negative.");
					continue;
				}
			}
			catch (InputMismatchException e){
				System.out.println("\nYou did not enter a valid numeric value.");
				continue;
			}
			
		}
		
		System.out.println("\n\nLos empleados registrados son: ");
		for(Employee emp : employeeList) {
			emp.printInformation();
			System.out.println("************************************************");
		}
		
		in.close();
		
	}

}
