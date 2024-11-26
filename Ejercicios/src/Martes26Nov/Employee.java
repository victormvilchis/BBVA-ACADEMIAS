package Martes26Nov;

import java.util.Scanner;

public class Employee {
	private String name;
	private Integer age;
	private Double salary;
	final Double SALARY_INCREMENT = 10.0;
	public static Integer employedCount = 0;
	
	public Employee(String name, Integer age, Double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
		employedCount++;
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
				System.out.println("Invalid value. Enter a number valid");
				flag = false;
				scanner.next();
			}
		}

		return ret;
	}
	
	public void increaseSalary() {
		Scanner scanner = new Scanner(System.in);
		Double porcentage = getDouble("Enter the percentage by which you will increase the employee's salary " + this.name + " (withouth %)", scanner);
		Double porcentageSalary = (this.salary * (porcentage / 100.0));
		this.salary = this.salary + porcentageSalary;

	}
	
	public void increaseSalaryYoung() {
		Double porcentageSalary = (this.salary * .10);
		this.salary = this.salary + porcentageSalary;

	}
	
	public void employeeInformation() {
		System.out.println("The employee´s name is:" + this.name +"\n His age is: " + this.age + "\n His salary is: " + this.salary);
	}
	
	public Boolean isYoung() {
		if(this.age < 30) {
			System.out.println(this.name + " Is young");
			return true;
		}
		else {
			System.out.println(this.name + "Is old");
			return false;
		}
	}
	
	
	public void annualSalary() {
		System.out.println("The Anual Salary of "+ this.name + " is " + (this.salary * 12));
	}
	
	public static void gettotalEmployees() {
		System.out.println("The employees total are: " + Employee.employedCount);
	}
	
	public Double getSalary() {
		return this.salary;
	}
}
