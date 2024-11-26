
public class Employee {
	private String name;
	private Integer age;
	private Double salary;
	
	public final Double SALARY_INCREMENT = 10.00;
	private static Integer countEmployees = 0;
	
	public Employee(String name, Integer age, Double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public Double getSalary() {
		return this.salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void incrementSalary(Double percent) {
		this.setSalary((this.salary * (percent / 100)) + salary);
	}
	
	public void printInfoEmployee() {
		String info = 
				"============= INFORMATION EMPLOYEE ============= \n" +
		        "Name: " + getName() + "\n" +
		        "Age: " + getAge() + "\n" +
		        "Salary: " + getSalary() + "\n" +
		        "Annual salary: " + this.annualSalary() + "\n" +
		        "================================================";
		
		System.out.println(info);
	}
	
	public Boolean isYoung() {
		return this.age < 30;
	}
	
	public Double annualSalary() {
		return this.salary * 12;
	}
	
	public static Integer getTotalEmployees() {
		return countEmployees;
	}
	
	public static void setTotalEmployees() {
		countEmployees++;
	}
}
