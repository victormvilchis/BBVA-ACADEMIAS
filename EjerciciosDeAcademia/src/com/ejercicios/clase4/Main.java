package com.ejercicios.clase4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String name;
		Integer age;
		Double salary;
		Double percentage;
		Boolean go = true;
		Scanner keyBoard = new Scanner(System.in);
		Integer count = 0;

		while (go) {
			try {
				System.out.println("Ingresa el nombre del empleado:");
				name = keyBoard.next();
				System.out.println("Ingresa la edad del empleado: ");
				age = keyBoard.nextInt();
				System.out.println("Ingresa el salario del trabajador: ");
				salary = keyBoard.nextDouble();
				System.out.println("Ingresa el porcentage que le deseas aumentar al empleado: ");
				percentage = keyBoard.nextDouble();

				Employee employee = new Employee(name, age, salary);

				Employee.printEmployeeInformation(employee.getName(), employee.getAge(), employee.getSalary());

				Employee.increaseSalary(employee.getSalary(), percentage);

				Employee.isYoung(employee.getAge());

				Employee.annualSalary(employee.getSalary());

				Employee.totalEmployees();

				System.out.println("\n");

				count++;

				if (count == 3) {
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Error, ingresaste un valor invalido");
			}
		}

		keyBoard.close();

	}

}
