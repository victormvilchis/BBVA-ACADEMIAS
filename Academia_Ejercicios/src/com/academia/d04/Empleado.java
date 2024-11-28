package com.academia.d04;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Definir la clase Empleado:
 * 
	Crea una clase llamada Empleado.
	Declara los siguientes campos privados:
		nombre de tipo String.
		edad de tipo int.
		salario de tipo double.
	Declara una constante INCREMENTO_SALARIO de tipo double y asigna el valor de 10.
	Declara una variable estática contadorEmpleados de tipo int e inicialízala en 0.
	Define un constructor que tome como parámetros el nombre, la edad y el salario del empleado y los inicialice.
	
	Implementa métodos para:
		Aumentar el salario en un porcentaje dado (aumentarSalario()).
		Imprimir la información del empleado (imprimirInformacion()).
		Determinar si el empleado es joven (menor de 30 años) (esJoven()).
		Calcular el salario anual del empleado (salarioAnual()).
	Define un método estático 	() que devuelva el número total de empleados.
	
	Definir la clase Main:
		Crea una clase llamada Main.
		En el método main, crea tres objetos Empleado con diferentes valores de nombre, edad y salario.
		Utiliza un bucle do-while para aumentar el salario del primer empleado hasta que alcance al menos $5000.
		Imprime la información de todos los empleados después de cada operación.
		Verifica si el segundo empleado es joven y, si lo es, aumenta su salario en un 10%.
		Calcula y muestra el salario anual de cada empleado.
		Imprime el número total de empleados utilizando el método estático getTotalEmpleados().
 */

public class Empleado {

	private String name;
	private Integer age;
	private Double salary;
	
	private final static Double SALARY_INCREMENT = 10.0;
	
	private static Integer countEmployee = 0;
	
	private final static String DECIMAL_FORMAT_TWO = "%.2f";
	private final static Double LIMIT = 5000.00;
	private final static String ERR_MSG_INPUT = "Invalid Input Data... ";
	
	public Empleado (String name, Integer age, Double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		countEmployee++;
	}
	
	
	
	public static Integer getTotalEmployee() {
		return countEmployee;
	}
	
	//Métodos
	public Double increaseSalary(Double percentage) {
		/*System.out.println("\nPercentage: " + percentage);
		System.out.println(this.salary * (percentage / 100.0));*/
		return (this.salary += this.salary * (percentage / 100.0));
	}
	
	public void printInfo() {
		System.out.println("\nHello, my name is " + name + " and I´m " + age + " years old." + " My Salary is " + "$ " + salary);
	}
	
	public boolean isYoung() {
		return (age < 30);
	}
	
	public Double yearSalary() {
		return this.salary * 12;
	}
	
	public static void main(String[] args) {
		//Boolean continuar = true;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			/*Empleado emp1 = new Empleado("Jorge", 25, 700.00);
			Empleado emp2 = new Empleado("Jose", 28, 8900.99);
			Empleado emp3 = new Empleado("Maria", 31, 1499.99);
			Empleado emp4 = new Empleado("Alberto", 41, 1899.99);
			
			do {
				emp1.increaseSalary(SALARY_INCREMENT);
				System.out.print(Updated Salary of " + emp1.name + " : " + "$ " + String.format("%.2f", emp1.salary) + "\n");
			} while(emp1.salary < 4999.99);
			
			if (emp2.isYoung()) {
				emp2.printInfo();
				System.out.println("New Salary: " + String.format(DECIMAL_FORMAT_TWO, emp2.increaseSalary(SALARY_INCREMENT)));
			} else {
				emp2.printInfo();
				System.out.println("Not Young: " + String.format(DECIMAL_FORMAT_TWO, emp2.increaseSalary(SALARY_INCREMENT)));
			}
			
			System.out.println("All anual salaries: ");
			System.out.println("Employee 1: " + String.format(DECIMAL_FORMAT_TWO, emp1.yearSalary()));
			System.out.println("Employee 2: " + String.format(DECIMAL_FORMAT_TWO, emp2.yearSalary()));
			System.out.println("Employee 3: " + String.format(DECIMAL_FORMAT_TWO, emp3.yearSalary()));
			
			System.out.println("\nTotal Count Employee: " + Empleado.getTotalEmployee());*/
			
			Integer total;
			while(true) {
				System.out.print("Enter total employee: ");
				total = sc.nextInt();
				sc.nextLine();
				if(total > 0 && total <= 10) {
					break;
				}
				else {
					System.out.print("Error, total must be positive and greater than cero and less than limit, ");
				}
				
			}
						
			//Arreglo para contener a los empleados que voy a almacenar
			Empleado[] activeEmployee = new Empleado[total];
			
			for (Integer a = 0; a < total; a++) {
				System.out.println("\nEnter data of Employee N° " + (a+1) + " :");
				String nameIn;
				Integer ageIn;
				Double salaryIn;
				
				while(true) {
					System.out.print("Enter Name: ");
					nameIn = sc.nextLine();
					if(nameIn.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+") && nameIn.length() > 2)
						break;
					else 
						System.out.print("Error, must be Letters and greater than two, ");
				}
				
				while(true){
					System.out.print("Enter Age: ");
					ageIn = sc.nextInt();
					if(ageIn >= 18 && ageIn <= 80) {
						break;
					} else {
						System.out.print("Error, Under-age or Limit-age, ");
					}
				}
				
				while(true) {
					System.out.print("Enter Monthly Salary: ");
					salaryIn = sc.nextDouble();
					if(salaryIn > 0) {
						break;
					} else {
						System.out.print("Error, Salary must be positive and greater than cero, ");
					}
				}
				
				sc.nextLine();
				
				//Se establece el objeto del Empleado en base a lo insertado
				activeEmployee[a] = new Empleado(nameIn, ageIn, salaryIn);
			}
			
			//Mostrar la información capturada
			System.out.println("\nEmployee Info: ");
			for(Empleado emp : activeEmployee) {
				emp.printInfo();
			}
			
			//Salario del primer empleado
			if(activeEmployee.length > 0) {
				do {
					activeEmployee[0].increaseSalary(SALARY_INCREMENT);
					System.out.print("\nUpdated Salary of " + activeEmployee[0].name + " : " + "$ " + String.format(DECIMAL_FORMAT_TWO, activeEmployee[0].salary));
				} while(activeEmployee[0].salary < LIMIT);
			}
			
			//Salario del segundo empleado (si existe) en base a edad
			if(activeEmployee.length > 1) {
				if(activeEmployee[1].isYoung()) {
					activeEmployee[1].printInfo();
					System.out.println("New Salary: " + "$ " + String.format(DECIMAL_FORMAT_TWO, activeEmployee[1].increaseSalary(SALARY_INCREMENT)));
				} else {
					activeEmployee[1].printInfo();
					System.out.println("Not Young: " + "$ " + String.format(DECIMAL_FORMAT_TWO, activeEmployee[1].salary));
				}
			}
			
			//Salarios anuales
			System.out.println("\nAll anual salaries: ");
			for (Empleado emp: activeEmployee) {
				System.out.println("Employee " +  emp.name + " : " + "$ " + String.format(DECIMAL_FORMAT_TWO, emp.yearSalary()));
			}
			
			System.out.println("\nTotal Employees: " + Empleado.getTotalEmployee());
			
			
		} catch (InputMismatchException | NumberFormatException | NegativeArraySizeException | ArrayIndexOutOfBoundsException | OutOfMemoryError e) {
			System.out.println(ERR_MSG_INPUT + e);
		}

		sc.close();

	}

}
