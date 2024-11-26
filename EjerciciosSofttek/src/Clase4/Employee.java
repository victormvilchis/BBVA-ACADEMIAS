package Clase4;
/*Definir la clase Employee:
Crea una clase llamada Employee.
Declara los siguientes campos privados:
name de tipo String.
age de tipo int.
salary de tipo double.
Declara una constante SALARY_INCREASE de tipo double y asigna el valor de 10.
Declara una variable estática accountantEmployees de tipo int e inicialízala en 0.
Define un constructor que tome como parámetros el name, la age y el salary del empleado y los inicialice.
Implementa métodos para:
Aumentar el salary en un porcentaje dado (aumentarSalario()).
Imprimir la información del empleado (imprimirInformacion()).
Determinar si el empleado es joven (menor de 30 años) (esJoven()).
Calcular el salary anual del empleado (salarioAnual()).
Define un método estático 	() que devuelva el número total de empleados.
Definir la clase Main:
*/
//crear una clase 
public class Employee {
	// atributos privados
	private String name;
	private Integer age;
	private Double salary;
	// constante
	final static Double SALARY_INCREASE = 10.0;
	// variable statica
	static Integer accountantEmployees = 0;

	// constructor con 3 parametros, inicializandolos  e hice incremento de empleados
	public Employee(String name, Integer age, Double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		accountantEmployees++;
	}

	// metodo para incremetar el salario
	public void salaryIncrease(Double porcentage) {
		this.salary += this.salary * porcentage / 100;
	}

	// imprimo info
	public void information() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("salary : " + salary);
	}

	// empleado joven
	public Boolean young() {
		return age < 30;
	}

	// metodo salary anual
	public Double annualSalary() {
		return salary * 12;
	}

	// metodo statico del total de empleados
	public static Integer getTotalEmployees() {
		return accountantEmployees;
	}
}
