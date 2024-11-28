/*
 * Definir la clase Main:
Crea una clase llamada Main.
En el método main, crea tres objetos Empleado con diferentes valores de nombre, edad y salario.
Utiliza un bucle do-while para aumentar el salario del primer empleado hasta que alcance al menos $5000.
Imprime la información de todos los empleados después de cada operación.
Verifica si el segundo empleado es joven y, si lo es, aumenta su salario en un 10%.
Calcula y muestra el salario anual de cada empleado.
Imprime el número total de empleados utilizando el método estático getTotalEmpleados().
 */
package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args)
	{
		Integer i;
		Double[] salary = new Double[3];
		String[] nameEmp = new String[3];
		Integer[] age = new Integer[3];
		Double increaseSalaryEmp2 = 0.0;
		Scanner scanner = new Scanner(System.in);
		try{
				for(i = 0; i < 3; i++)
				{
					String temName = " ";
					Integer temAge = 0;
					Double temSalary = 0.0;
					do
					{	System.out.print("Please enter the name of the employee " + (i+1) +": ");
						temName = scanner.next();
						System.out.print("Please enter age of the employee " + (i+1) +": ");
						temAge = scanner.nextInt();	
						System.out.print("Please enter the salary of the employee " + (i+1) +": ");
						temSalary = scanner.nextDouble();
						if((temAge >= 123 || temAge < 18) || temSalary <= 0 || (nameValidate(temName) == false))
						{
							System.out.println("Invalid inputs");
						}	
					}while((temAge >= 123 || temAge < 18) || (temSalary <= 0 ) || nameValidate(temName) == false);
					age[i] = temAge;
					salary[i] = temSalary;
					nameEmp[i] = temName;
				}
				
				Employee employee1 = new Employee(nameEmp[0], age[0], salary[0]);
				Employee employee2 = new Employee(nameEmp[1], age[1], salary[1]);
				Employee employee3 = new Employee(nameEmp[2], age[2], salary[2]);
				
				do { 
					salary[0] = employee1.increaseSalary(employee1.SALARY_INCREASE); 
					
					} while (salary[0] < 5000.0);
				
				System.out.println("----First operation----");
				employee1.printInformation(); 
				employee2.printInformation();
				employee3.printInformation();
				
				if(employee2.isYoung())
				{
					increaseSalaryEmp2 = employee2.increaseSalary(10.0);
					System.out.println(employee2.getName()+"'s after the raise is: " +increaseSalaryEmp2);
					
				}
				System.out.println("----second operation---");
				employee1.printInformation(); 
				employee2.printInformation();
				employee3.printInformation();
				
				System.out.println("----Third operation----");
				System.out.println("The annual salary of each employee is: ");
				System.out.println(employee1.getName() + ": " + employee1.annualSalary());
				System.out.println(employee2.getName() + ": " + employee2.annualSalary());
				System.out.println(employee3.getName() + ": " + employee3.annualSalary());
				System.out.println("Employees: " + Employee.totalEmployees());
		}	 	
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
		}finally
		{
			scanner.close();
		}
	}
	
	public static Boolean nameValidate(String name)
	{
		String regExp = "^[A-Z][a-z]+(?: [A-Z][a-z] +)*$";
		Pattern pattern = Pattern.compile(regExp);
		Matcher mattch = pattern.matcher(name);
		return mattch.matches();
	}
}
