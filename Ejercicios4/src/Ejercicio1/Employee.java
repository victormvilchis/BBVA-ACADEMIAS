/*
 * Definir la clase Empleado:
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

 */
package Ejercicio1;

public class Employee {
	private String  name;
	private Integer age;
	private Double salary;
	final Double SALARY_INCREASE = 10.0;
	static Integer employeeCounter = 0;
	
	public Employee(String name, Integer age, Double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
		employeeCounter++;
	}
	
	public Double increaseSalary(Double percentage)
	{
		this.salary += this.salary * percentage / 100;
		return salary;
	}
	
	public void printInformation()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Salary: " + this.salary);
	}
	
	public Boolean isYoung()
	{
		return age < 30;
	}
	
	public Double annualSalary()
	{
		return this.salary * 12;
	}
	
	public static Integer totalEmployees()
	{
		return employeeCounter;
	}
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Double getSalary() {
		return salary;
	}

}
