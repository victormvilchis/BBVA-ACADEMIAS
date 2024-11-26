package ejerciciosNivelacion_4;
/*
 * Definir la clase Empleado:
 * - Crea una clase llamada Empleado.
 * */
public class Employee {
	
// *********************************************************************************************************************
	// Declara los siguientes campos privados:
	// - nombre de tipo String.
	private String name;
	
	// - edad de tipo int.
	private Integer age;
	
	// - salario de tipo double.
	private Double salary;
	
	// - Declara una constante INCREMENTO_SALARIO de tipo double y asigna el valor de 10.
	private final Double SALARY_INCREASE = 10.0;
	
	// - Declara una variable estática contadorEmpleados de tipo int e inicialízala en 0.
	static Integer counterEmployees = 0;
	
	// - Define un constructor que tome como parámetros el nombre, la edad y el salario del empleado y los inicialice.
	public Employee(String name, Integer age, Double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		counterEmployees++;
	}
	
// ********************************************************************************************************************	
	// Implementa métodos para:
	//	- Aumentar el salario en un porcentaje dado (aumentarSalario()).
	public void increaseSalary() {
		Double salary = this.getSalary() + (this.getSalary() * (SALARY_INCREASE/100));
		this.setSalary(salary);
	}
	
	//	- Imprimir la información del empleado (imprimirInformacion()).
	public void printInformation() {
		System.out.println("\n********************************************************************************************");
		System.out.println("Employee's name: " + this.getName());
		System.out.println("Employee's age: " + this.getAge());
		System.out.println("Employee's salary: $" + String.format("%.2f", this.getSalary()));
	}
	
	//	- Determinar si el empleado es joven (menor de 30 años) (esJoven()).
	public Boolean isYoung() {
		return this.getAge() < 30;
	}
	
	//	- Calcular el salario anual del empleado (salarioAnual()).
	public void salaryAnnual() {
		System.out.println(this.getName() + "'s annual salary is: $" + String.format("%.2f", this.getSalary() * 12));
	}
	
	//	- Define un método estático () que devuelva el número total de empleados.
	static Integer totalEmployees() {
		return counterEmployees;
	}
	
// ********************************************************************************************************************	
	// Getters and Setters
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
}
