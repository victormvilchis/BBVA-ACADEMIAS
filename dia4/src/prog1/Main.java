package prog1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // pide al usuario los datos de los 3 empleados
            Employee[] employees = new Employee[3]; 
            for (int i = 0; i < employees.length; i++) { 
                System.out.println("Enter details for Employee " + (i + 1) + ":");

                // Validar el nombre
                String name = null;
                while (name == null || !name.matches("[a-zA-Z]+")) { 
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    if (!name.matches("[a-zA-Z]+")) {
                        System.out.println("Invalid name. Please enter alphabetic characters only.");
                        name = null; 
                    }
                }

                // Validar la edad
                Integer age = null;
                while (age == null) {
                    try {
                        System.out.print("Age: ");
                        age = Integer.parseInt(scanner.nextLine()); // convierte entrada a Integer
                        if (age <= 0) {
                            System.out.println("Age must be positive.");
                            age = null;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid age.");
                    }
                }

                // Validar el salario
                Double salary = null;
                while (salary == null) {
                    try {
                        System.out.print("Salary: ");
                        salary = Double.parseDouble(scanner.nextLine()); // convierte entrada a Double
                        if (salary <= 0) {
                            System.out.println("Salary must be positive.");
                            salary = null;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid salary.");
                    }
                }

                // Crear el empleado y añadirlo al arreglo
                employees[i] = new Employee(name, age, salary);
            }

            // incrementar el salario del primer empleado hasta que alcance al menos $5000
            do {
                employees[0].increaseSalary(); // incrementa el salario con el 10% 
                System.out.println("\nAfter salary increment for the first employee:");
                employees[0].printInformation(); 
            } while (employees[0].annualSalary() < 5000 * 12); // repite hasta alcanzar 5000 mensuales

            // Verifica si el segundo empleado es joven y aumenta su salario si lo es
            if (employees[1].isYoung()) {
                employees[1].increaseSalary(); 
                System.out.println("\nThe second employee is young, salary increased:");
                employees[1].printInformation(); // imprime la información actualizada
            }

            //  informaciin y el salario anual de todos los empleados
            System.out.println("\nFinal information of all employees:");
            for (Employee employee : employees) {
                employee.printInformation();
                System.out.println("Annual Salary: " + employee.annualSalary()); 
                System.out.println("----------------------------");
            }

            // numero total de empleados creados
            System.out.println("Total number of employees: " + Employee.getTotalEmployees());

        }  finally {
            scanner.close(); 
        }
    }
}