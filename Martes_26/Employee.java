package Martes_26;

import java.util.Scanner;

public class Employee {
	
	private String name;
	private Integer age;
	private Double salary;
	private final Double salary_increase = 10.0;
	private static Integer employees = 0;
	
	public void Employee (String name, Integer age, Double salary) {
		setName(name);
		setAge(age);
		setSalary(salary);
		employees++;
	}
	
	public Double salaryIncrease(Integer porcent, Double salary) {
		
		salary = (salary * porcent);
		salary = (salary / 10);
		setSalary(salary);
		return getSalary();
	}
	
	public void printInfo(String name, Integer age, Double salary) {
		System.out.println("The name of employe is: " + name + ", he have " + age + "years" + ", his actual salary is of " + salary);
	}
	
	public void isYoung(Integer age, Double salary) {
		if(age < 30) {
			Boolean flag = true;
			
			while(flag) {
				System.out.println("The employee are young");
				String porcentS;
				Integer porcent;
				System.out.println("The employee nubmer two is young, what porcent yo want increase in his salary?");
				try {
					Scanner sc = new Scanner(System.in);
					porcentS = sc.next();
					porcent = Integer.parseInt(porcentS);
					
					if(porcent < 1 || porcent > 100) {
						System.out.println("The range of porcent must be of 1 - 100");
						System.out.println("Try again");
						
						System.out.println("Write the porcent");
						porcentS = sc.next();
						porcent = Integer.parseInt(porcentS);
					}else {
						flag = false;
					}
					salaryIncrease(porcent, salary);
				}catch(NumberFormatException e) {
					System.out.println("Write just numbers");
				}
			}
		}
	}
	
	public Double annualSalary(Double salary) {
		salary = salary * 12;
		return salary;
	}
	
	public static Integer totalEmployees() {
		return getEmployees();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public static Integer getEmployees() {
		return employees;
	}
	public static void setEmployees(Integer employees) {
		Employee.employees = employees;
	}
	public Double getSalary_increase() {
		return salary_increase;
	}
	
}
