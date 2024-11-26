package com.ejercicios.clase4;

/*
Definir la clase Empleado:
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

has context menu


has context menu

*/

public class Employee {

	private String name;
	private Integer age;
	private Double salary;

	Double SALARY_INCREASE = 10.0;

	static Integer employeeCounter = 0;

	public Employee(String name, Integer age, Double salary) {
		this.setName(name);
		this.setAge(age);
		this.setSalary(salary);
	}

	public static void increaseSalary(Double salary, Double percentageIncrease) {
		Double percentage = (percentageIncrease / 100);
		Double totaPercentage = salary + (salary * percentage);
		System.out.println("Current salary: " + salary + ", Percentage to increase: " + percentageIncrease + "%"
				+ ", Increased salary: " + totaPercentage);
	}

	public static void printEmployeeInformation(String name, Integer age, Double salary) {
		System.out.println("Employee information: \n  name: " + name + ", age: " + age + ", salary: " + salary);
	}

	public static void isYoung(Integer age) {
		System.out.println("The age of employee is: " + age + ", therefore:");
		if (age < 30) {
			System.out.println("The employee is young.");
		} else {
			System.out.println("The employee Is not so young.");
		}
	}

	public static void annualSalary(Double salary) {
		Double totalAnnualSalary = (salary * 12);
		System.out.println("The employee´s annual salary is: " + totalAnnualSalary);
	}

	public static void totalEmployees() {
		employeeCounter++;
		System.out.println("Total employees: " + employeeCounter);
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

}
