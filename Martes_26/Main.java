package Martes_26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		employee();
	}
	
	public static void employee () {
		
		Scanner sc = new Scanner(System.in);
		String name, ageS, salaryS;
		Integer age = null;
		Double salary;
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		System.out.println("Welcome go to insert your first tree employees");
		System.out.println("");
		System.out.println("We can start for the first employee");
		System.out.println("");
		
		System.out.println("Write her name");
		name = sc.next();
		Boolean flag = true;
		
		while(flag) {	
			
			Boolean flagAge = true;
			Boolean flagSalary = true;
			try {
				while(flagAge) {
					System.out.println("");
					System.out.println("Write her age");
					ageS = sc.next();
					age = Integer.parseInt(ageS);
					if(age < 18) {
						System.out.println("This enterprise not acept employees without 17 years or less");
						System.out.println("Write again the age");
						ageS = sc.next();
						age = Integer.parseInt(ageS);
					}else {
						flagAge = false;
						e1.Employee(name, age, null);
					}
				}
				while(flagSalary) {
					System.out.println("");
					System.out.println("Write her Salary");
					salaryS = sc.next();
					salary = Double.parseDouble(salaryS);
					if(salary < 1) {
						System.out.println("The salary of your employee would be of $1 how minim");
						System.out.println("Write again the salary");
						salaryS = sc.next();
						salary = Double.parseDouble(salaryS);
					}else {
						flagSalary = false;
						e1.Employee(name, age, salary);
						flag = false;
					}
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Write just numbers");
			}
		}
		
		
		flag = true;
		System.out.println("Now Your second employee");
		System.out.println("");
		
			System.out.println("Write her name");
			System.out.println("");
			name = sc.next();	
		while(flag) {	
			
			Boolean flagAge = true;
			Boolean flagSalary = true;
			try {
				while(flagAge) {
					System.out.println("");
					System.out.println("Write her age");
					ageS = sc.next();
					age = Integer.parseInt(ageS);
					if(age < 18) {
						System.out.println("This enterprise not acept employees without 17 years or less");
						System.out.println("Write again the age");
						ageS = sc.next();
						age = Integer.parseInt(ageS);
					}else {
						flagAge = false;
						e2.Employee(name, age, null);
					}
				}
				while(flagSalary) {
					System.out.println("");
					System.out.println("Write her Salary");
					salaryS = sc.next();
					salary = Double.parseDouble(salaryS);
					if(salary < 1) {
						System.out.println("The salary of your employee would be of $1 how minim");
						System.out.println("Write again the salary");
						salaryS = sc.next();
						salary = Double.parseDouble(salaryS);
					}else {
						flagSalary = false;
						e2.Employee(name, age, salary);
						flag = false;
					}
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Write just numbers");
			}
		}
		
		flag = true;
		
		System.out.println("Now Your third employee");
		System.out.println("");
		System.out.println("Write her name");
		System.out.println("");
		name = sc.next();	
		while(flag) {	
			
			Boolean flagAge = true;
			Boolean flagSalary = true;
			try {
				while(flagAge) {
					System.out.println("");
					System.out.println("Write her age");
					ageS = sc.next();
					age = Integer.parseInt(ageS);
					if(age < 18) {
						System.out.println("This enterprise not acept employees without 17 years or less");
						System.out.println("Write again the age");
						ageS = sc.next();
						age = Integer.parseInt(ageS);
					}else {
						flagAge = false;
						e3.Employee(name, age, null);
					}
				}
				while(flagSalary) {
					System.out.println("");
					System.out.println("Write her Salary");
					salaryS = sc.next();
					salary = Double.parseDouble(salaryS);
					if(salary < 1) {
						System.out.println("The salary of your employee would be of $1 how minim");
						System.out.println("Write again the salary");
						salaryS = sc.next();
						salary = Double.parseDouble(salaryS);
					}else {
						flagSalary = false;
						e3.Employee(name, age, salary);
						flag = false;
					}
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Write just numbers");
			}
		}
		
		System.out.println("Ready wait a moment");
		
		do {
			e2.setSalary(e2.getSalary() + e2.getSalary_increase());
			System.out.println(e2.getSalary());
			System.out.println("");
			
			e1.printInfo(e1.getName(), e1.getAge(), e1.getSalary());
			System.out.println("");
			e2.printInfo(e2.getName(), e2.getAge(), e2.getSalary());
			System.out.println("");
			e3.printInfo(e3.getName(), e3.getAge(), e3.getSalary());
			System.out.println("");
		} while (e2.getSalary() < 5000);
		
		e2.isYoung(e2.getAge(), e2.getSalary());
		System.out.println("The interprise have " + Employee.getEmployees() + " Employees");
		
		System.out.println("The anual salary of Employee 1 is of: " + e1.annualSalary(e1.annualSalary(e1.getSalary())));
		System.out.println("The anual salary of Employee 2 is of: " + e2.annualSalary(e2.annualSalary(e2.getSalary())));
		System.out.println("The anual salary of Employee 3 is of: " + e3.annualSalary(e3.annualSalary(e1.getSalary())));
	}

}
