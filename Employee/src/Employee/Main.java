package Employee;

import java.util.Scanner;
/* Definir la clase Main:
 * Crea una clase llamada Main.
 * En el método main, crea tres objetos Empleado con diferentes valores de nombre, edad y salario.
 * Utiliza un bucle do-while para aumentar el salario del primer empleado hasta que alcance al menos $5000.
 * Imprime la información de todos los empleados después de cada operación.
 * Verifica si el segundo empleado es joven y, si lo es, aumenta su salario en un 10%.
 * Calcula y muestra el salario anual de cada empleado.
 * Imprime el número total de empleados utilizando el método estático getTotalEmpleados().
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entry = new Scanner(System.in);
		
		Employee[] employee = new Employee[3];
		
		for(int i = 0; i<3; i++) {
			String name = null;
			Integer age = 0;
			Double salary = 0.0;
			Boolean datoValido = false;
			
			System.out.println("Ingresa los datos del empleado "+(i+1));
			
			while(!datoValido) {
				System.out.print("Nombre: ");
				name = entry.nextLine().trim();
				
				if(name.matches(".*\\d.*")) {
					System.out.println("Introduce un nombre valido");
				} else {
					datoValido = true;
				}
			}
			datoValido = false;
			
			while(!datoValido) {
				try {
					System.out.print("Edad: ");
					String ageIn = entry.nextLine().trim();
					
					if(ageIn.contains(" ")) {
						ageIn = ageIn.split(" ")[0];
					}
					age = Integer.parseInt(ageIn);
					
					if(age > 0) {
						datoValido = true;
					} else {
						System.out.println("No introducir numeros negativos o ceros");
					}
				} catch(NumberFormatException ex) {
					System.out.println("No introducir letras");
				}
			}
			datoValido = false;
			
			while(!datoValido) {
				try {
					System.out.print("Salario: ");
					String sarayIn = entry.nextLine().trim();
					
					if(sarayIn.contains(" ")) {
						sarayIn = sarayIn.split(" ")[0];
					}
					salary = Double.parseDouble(sarayIn);
					
					if(salary > 0) {
						datoValido = true;
					} else {
						System.out.println("No introducir numeros negativos o ceros");
					}
				} catch(NumberFormatException ex) {
					System.out.println("No introducir letras");
				}
			}
			
			employee[i] = new Employee(name, age, salary);
		}
		
		Employee employee1 = employee[0];
		Employee employee2 = employee[1];
		
		Boolean increase = false;
		do {
			employee1.increaseSalary();
			increase = true;
		}while(employee1.annualSalary() < (5000.0 * 12));
		
		if(increase) {
			System.out.println("\nEl salario del empleado 1 fue incrementado");
		}
		
		if(employee2.isYoung()) {
			System.out.println("\nEl empleado 2 es joven. Se aumentara su salario.");
			employee2.increaseSalary();
		}
		
		System.out.println("\nSalarios anuales");
		for(int i = 0; i < employee.length; i++) {
			System.out.println("Empleado "+ (i+1) + " $" + employee[i].annualSalary());
		}
		
		System.out.println("\nInformacion de los empleados");
		for(Employee employ : employee) {
			employ.printInformation();
		}
		
		System.out.println("Total de empleados: "+Employee.totalEmployees());
		
		entry.close();
	}

}
