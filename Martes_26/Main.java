package Martes_26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		employee();
	}
	
	
	public static void employee () {
		
		System.out.println("The interprise have " + Employee.getEmployees() + " Employees");
		
		Scanner sc = new Scanner(System.in);
		String name, AGE, Salary;
		Integer age;
		Double salary;
		Employee E1 = new Employee();
		Employee E2 = new Employee();
		Employee E3 = new Employee();
		
		System.out.println("Welcome go to insert your first tree employees");
		System.out.println("We can start for the first employee");
		
		System.out.println("Write her name");
		name = sc.next();	
		try {
			System.out.println("Write her age");
			AGE = sc.next();
			System.out.println("Write her Salary");
			Salary = sc.next();
			
			age = Integer.parseInt(AGE);
			salary = Double.parseDouble(Salary);
			
			E1.Employee(name, age, salary);
		}catch(NumberFormatException e) {
			System.out.println("Ingresa el solo numeros");
			
			System.out.println("Write her age");
			AGE = sc.next();
			System.out.println("Write her Salary");
			Salary = sc.next();
			
			age = Integer.parseInt(AGE);
			salary = Double.parseDouble(Salary);
			
			E1.Employee(name, age, salary);
		}
		
		
		
		System.out.println("Now Your second employee");
		System.out.println("");
		System.out.println("Write her name");
		System.out.println("");
		name = sc.next();		
		try {
			System.out.println("Write her age");
			AGE = sc.next();
			System.out.println("Write her Salary");
			Salary = sc.next();
			
			age = Integer.parseInt(AGE);
			salary = Double.parseDouble(Salary);
			
			E2.Employee(name, age, salary);
		}catch(NumberFormatException e) {
			System.out.println("Ingresa el solo numeros");
			
			System.out.println("Write her age");
			AGE = sc.next();
			System.out.println("Write her Salary");
			Salary = sc.next();
			
			age = Integer.parseInt(AGE);
			salary = Double.parseDouble(Salary);
			
			E2.Employee(name, age, salary);
		}
		
		System.out.println("Now Your third employee");
		System.out.println("Write her name");
		name = sc.next();		
		try {
			System.out.println("Write her age");
			AGE = sc.next();
			System.out.println("Write her Salary");
			Salary = sc.next();
			
			age = Integer.parseInt(AGE);
			salary = Double.parseDouble(Salary);
			
			E3.Employee(name, age, salary);
		}catch(NumberFormatException e) {
			System.out.println("Ingresa el solo numeros");
			
			System.out.println("Write her age");
			AGE = sc.next();
			System.out.println("Write her Salary");
			Salary = sc.next();
			
			age = Integer.parseInt(AGE);
			salary = Double.parseDouble(Salary);
			
			E3.Employee(name, age, salary);
		}
		
		System.out.println("Ready wait a moment");
		
		
		while(E1.getSalary() < 5000) {
			E1.setSalary(E1.getSalary() + E1.getSalary_increase());
			System.out.println(E1.getSalary());
			System.out.println("");
			E1.printInfo(E1.getName(), E1.getAge(), E1.getSalary());
			System.out.println("");
			E2.printInfo(E2.getName(), E2.getAge(), E2.getSalary());
			System.out.println("");
			E3.printInfo(E3.getName(), E3.getAge(), E3.getSalary());
			System.out.println("");
		}
		
		E2.isYoung(E2.getAge());
		System.out.println("The interprise have " + Employee.getEmployees() + " Employees");
	}

}
