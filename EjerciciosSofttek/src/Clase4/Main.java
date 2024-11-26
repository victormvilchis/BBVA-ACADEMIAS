package Clase4;

/*Crea una clase llamada Main.
En el método main, crea tres objetos Employee con diferentes valores de nombre, edad y salario.
Utiliza un bucle do-while para aumentar el salario del primer empleado hasta que alcance al menos $5000.
Imprime la información de todos los empleados después de cada operación.
Verifica si el segundo empleado es joven y, si lo es, aumenta su salario en un 10%.
Calcula y muestra el salario anual de cada empleado.
Imprime el número total de empleados utilizando el método estático getTotalEmpleados().*/
public class Main {
	public static void main(String[] args) {
		// crear 3 objetos y esto lo llamo a mi constructor de 3 parametros
		Employee employee1 = new Employee("Jorge", 35, 3000.0);
		Employee employee2 = new Employee("Carlos", 29, 3500.0);
		Employee employee3 = new Employee("Areli", 33, 3000.0);
		{
			do {
				employee1.salaryIncrease(Employee.SALARY_INCREASE);
			} while (employee1.annualSalary() / 12 < 5000);
			System.out.println("Informacion primer empleado");
			employee1.information();
			// verificar segundo empleado
			if (employee2.young()) {
				employee2.salaryIncrease((double) 10);
				System.out.println("Carlos es joven, aumentando su salario 10%.");
			}
			// imprimo info de los empleados
			employee2.information();
			employee3.information();

			// imprimo info de salarios
			System.out.println("Informacion actual de Jorge: " + employee1.annualSalary());
			System.out.println("Informacion actual de Carlos: " + employee2.annualSalary());
			System.out.println("Informacion actual de Areli: " + employee3.annualSalary());
			//imprimo total de empleados 
			System.out.println("Total de Empleados es: " + Employee.getTotalEmployees());
		}
	}
}
