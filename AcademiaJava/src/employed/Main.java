package employed;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// crea tres objetos Empleado con diferentes valores de name, edad y salary.
		Employed employed1 = newEmployed(scanner);
		Employed employed2 = newEmployed(scanner);
		Employed employed3 = newEmployed(scanner);

		// Mostrar los empleados
		System.out.println(employed1);
		System.out.println(employed2);
		System.out.println(employed3);

	}

	private static Employed newEmployed(Scanner scanner) {
		Employed nmp = null;
		String name = null;
		Integer age = null;
		Double salary = null;
		// INGRESAR NOMBRE DEL EMPLEADO
		
		while (name == null || !name.matches("[a-zA-Z]+")) {
			System.out.print("Enter the employee's name: ");
			name = scanner.nextLine();
			if (!name.matches("[a-zA-Z]+")) {
				System.out.println("Invalid name. Please enter alphabetic characters only.");
				name = null;
			}
		}

		while (true) {
			System.out.println("Enter the employee's age:");
			if (scanner.hasNextInt()) {
				age = scanner.nextInt();
				if (age > 0) {
					break;
				} else {
					System.out.println("Age should be a number.");
				}
			} else {
				System.out.println("Error. Enter a number.");
			}
			scanner.next();
		}

		// INGRESAR EL salary
		while (true) {
			System.out.println("Enter the employee's salary:");
			if (scanner.hasNextDouble()) {
				salary = scanner.nextDouble();
				if (salary > 0) {
					break;
				} else {
					System.out.println("Salary should be a positive number.");
				}
			} else {
				System.out.println("Error. Entener a valid number. ");
			}
			scanner.next();
		}

		// Utiliza un bucle do-while para aumentar el salary del primer empleado hasta
		// que alcance al menos $5000.
//Double incrementSalary =null;

		nmp = new Employed(name, age, salary);
		do {
			nmp.incrementSalary(.1);
			System.out.println("Despues del incremento del salario del primer empleado");
			nmp.employedInformation();

		} while (nmp.annualSalary() < 5000 * 12);
		
		// Verifica si el segundo empleado es joven y, si lo es, aumenta su salario en
		// un 10%.
		
//		  if (Employed.isYoung()) {
//              Employed.increaseSalary();
//              System.out.println("\nThe second employee is young, salary increased:");
//              Employed.employedInformation(); // imprime la información actualizada
//          }

		//numero total de empleados
		System.out.println("Total number of employees: " + nmp.getEmployed());

		// Informacion de los empleados
		System.out.println("This is employe information of annualSalary: " + nmp.annualSalary());
		return nmp;
	}
}
