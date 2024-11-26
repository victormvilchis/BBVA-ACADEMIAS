package ejercicios.ejemplos;

import java.util.Scanner;

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
Definir la clase Main:
Crea una clase llamada Main.
En el método main, crea tres objetos Empleado con diferentes valores de nombre, edad y salario.
Utiliza un bucle do-while para aumentar el salario del primer empleado hasta que alcance al menos $5000.
Imprime la información de todos los empleados después de cada operación.
Verifica si el segundo empleado es joven y, si lo es, aumenta su salario en un 10%.
Calcula y muestra el salario anual de cada empleado.
Imprime el número total de empleados utilizando el método estático getTotalEmpleados().*/

public class Employee {

	// SE AGREGAN VARIABLES TIPO WRAPPER
	private String name;
	private Integer age;
	private Double salary;

	// SE AGREGA CONSTANTE Y VARIABLE ESTATICA
	private static final Double SALARY_INCREMENT = 10.0;
	private static Integer employeeCount = 0;

	// SE DEFINE EL CONSTRUCTOR
	public Employee(String name, Integer age, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		employeeCount++;
	}

	// METODO PARA INCREMENTAR EL SALARIO
	public void increaseSalary(Double percentage) {
		this.salary += this.salary * (percentage / 100);
	}

	// METODO PARA IMPRIMIR INFORMACION DEL EMPLEADO
	public void printInformation() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}

	// METODO PARA VERIFICAR QUE EL EMPLEADO ES JOVEN
	public boolean isYoung() {
		return age < 30;
	}

	// METODO PARA CALCULAR EL SALARIO ANUAL DEL EMPLEADO
	public Double annualSalary() {
		return salary * 12;
	}

	// METODO ESTATICO QUE DEFINE EL NUMERO TOTAL DE EMPLEADOS
	public static Integer getTotalEmployees() {
		return employeeCount;
	}

	// METODO PARA CREAR LOS EMPLEADOS
	private static Employee createEmployees(Scanner scanner) {
		while (true) {
			try {
				System.out.print("Enter name: ");
				String name = scanner.nextLine();
				if (!name.matches("^[a-zA-Z]+$")) {
					System.out.println("Invalid name");
					continue;
				}

				System.out.print("Enter age: ");
				int age = Integer.parseInt(scanner.nextLine());

				if (age <= 0) {
					System.out.println("Invalid age.");
					continue;
				}

				System.out.print("Enter salary: ");
				double salary = Double.parseDouble(scanner.nextLine());

				if (salary <= 0) {
					System.out.println("Invalid salary.");
					continue;
				}

				return new Employee(name, age, salary);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input");
			} catch (Exception e) {
				System.out.println("Invalid input.");
			}
		}
	}

	// METODO MAIN
	public static void main(String[] args) {

		// ENTRADA DE DATOS CON SCANNER
		Scanner scanner = new Scanner(System.in);

		// OBJETOS DE EMPLEADO CON DIFERENTES VALORES
		Employee employee1 = null, employee2 = null, employee3 = null;

		// CICLO WHILE Y MANEJO DE ERRORES
		while (true) {
			try {
				System.out.println("Enter details for employee 1: ");
				employee1 = createEmployees(scanner);

				System.out.println("Enter details for employee 2: ");
				employee2 = createEmployees(scanner);

				System.out.println("Enter details for employee 3: ");
				employee3 = createEmployees(scanner);

				// BUCLE DO-WHILE PARA AUMENTAR EL SALRIO
				do {
					employee1.increaseSalary(SALARY_INCREMENT);
					System.out.println("Increased salary for employee 1: ");
					employee1.printInformation();
				} while (employee1.salary < 5000);

				// IMPRIMIR INFORMACON DE LOS EMPLEADOS
				System.out.println("Employee Information: ");
				employee1.printInformation();
				employee2.printInformation();
				employee3.printInformation();

				// VERIFICA SI EL EMPLEADO 2 ES JOVEN
				if (employee2.isYoung()) {
					employee2.increaseSalary(10.0);
					System.out.println("Increased salary for young employee 2:");
					employee2.printInformation();
				}

				// SALARIO ANUAL DE LOS EMPLEADOS
				System.out.println("Annual Salaries:");
				System.out.println("Employee 1 Annual Salary: " + employee1.annualSalary());
				System.out.println("Employee 2 Annual Salary: " + employee2.annualSalary());
				System.out.println("Employee 3 Annual Salary: " + employee3.annualSalary());

				// IMPRIME TOTAL DE EMPLEADOS
				System.out.println("Total Employees: " + getTotalEmployees());

			} catch (Exception e) {
				System.out.println("An error has occurred");
			} finally {
				scanner.close();
			}
		}
	}
}