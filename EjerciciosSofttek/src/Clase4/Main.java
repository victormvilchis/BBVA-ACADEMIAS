package Clase4;
/*
Definir la clase Main:
Crea una clase llamada Main.
En el método main, crea tres objetos Empleado con diferentes valores de nombre, edad y salario.
Utiliza un bucle do-while para aumentar el salario del primer empleado hasta que alcance al menos $5000.
Imprime la información de todos los empleados después de cada operación.
Verifica si el segundo empleado es joven y, si lo es, aumenta su salario en un 10%.
Calcula y muestra el salario anual de cada empleado.
Imprime el número total de empleados utilizando el método estático getTotalEmpleados().*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	//constantes
   private final String MESSAGE_NAME = "Introduce un nombre válido: ";
   private final String MESSAGE_ERROR = "Error";
  //expresion regular
   public static boolean regexName(String name) {
       String regex = "^[A-Z][a-z]+(?:[A-Z][a-z]+)*$";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(name);
       return matcher.matches();
   }
   public String validateName(Scanner scanner) {
       String name = "";
       Boolean valid = false;
       while (!valid) {
           System.out.print(MESSAGE_NAME);
           name = scanner.nextLine();
           if (!regexName(name)) {
               System.out.println(MESSAGE_ERROR);
           } else {
               valid = true;
           }
       }
       return name;
   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       // Crear 3 objetos 
       System.out.println("Introduce los datos del primer empleado:");
       System.out.print("Nombre: ");
       String name1 = scanner.nextLine();
       System.out.print("Edad: ");
       Integer age1 = scanner.nextInt();
       System.out.print("Salario: ");
       Double salary1 = scanner.nextDouble();
       scanner.nextLine(); 
       Employee employee1 = new Employee(name1, age1, salary1);
       
       System.out.println("\nIntroduce los datos del segundo empleado:");
       System.out.print("Nombre: ");
       String name2 = scanner.nextLine();
       System.out.print("Edad: ");
       Integer age2 = scanner.nextInt();
       System.out.print("Salario: ");
       Double salary2 = scanner.nextDouble();
       scanner.nextLine(); 
       Employee employee2 = new Employee(name2, age2, salary2);
       
       System.out.println("\nIntroduce los datos del tercer empleado:");
       System.out.print("Nombre: ");
       String name3 = scanner.nextLine();
       System.out.print("Edad: ");
       Integer age3 = scanner.nextInt();
       System.out.print("Salario: ");
       Double salary3 = scanner.nextDouble();
       scanner.nextLine(); 
       Employee employee3 = new Employee(name3, age3, salary3);
      //aumento salario del primer empleado 
       do {
           employee1.salaryIncrease(Employee.SALARY_INCREASE);
       } while (employee1.annualSalary() / 12 < 5000);
       System.out.println("\nSalario del primer empleado incrementado");
       employee1.information();
       
       // Verificar si el segundo empleado es joven
       if (employee2.young()) {
    	   employee2.salaryIncrease((double) 10);
           System.out.println("El segundo empleado es joven.");
       }
       // Imprimir información 
      
       System.out.println("\nInformación de todos los empleados:");
       employee1.information();
       employee2.information();
       employee3.information();
       // imprimir salarios anuales
       System.out.println("\nSalarios anuales:");
       System.out.println("Empleado 1: " + employee1.annualSalary());
       System.out.println("Empleado 2: " + employee2.annualSalary());
       System.out.println("Empleado 3: " + employee3.annualSalary());
       // Total de empleados
       System.out.println("\nTotal de empleados creados: " + Employee.getTotalEmployees());
      
       scanner.close();
   }
}