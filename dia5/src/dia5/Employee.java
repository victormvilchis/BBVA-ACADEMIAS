package dia5;

public class Employee {
    // campos privados
    private String name; // Nombre del empleado
    private Integer age; // Edad del empleado
    private Double salary; // Salario del empleado

    // constante
    public static final Double salary_increment = 10.0; // incremento de salario del 10%

    // variable estatica para contar empleados inicializada en cero
    private static Integer employeeCount = 0;

    // Constructor
    public Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        employeeCount++; 
    }

    // metodo para aumentar el salario en un 10%
    public void increaseSalary() {
        Double increment = this.salary * salary_increment / 100;
        this.salary = this.salary + increment;
    }

    // metodo para imprimir la informacion del empleado
    public void printInformation() {
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
        System.out.println("Salary: " + salary); 
    }

    // metodo para verificar si el empleado es joven (menor de 30 años)
    public Boolean isYoung() {
        return age < 30 ? true : false;
    }

    // metodo para calcular el salario anual
    public Double annualSalary() {
        return salary * 12;
    }

    // metodo estatico para obtener el total de empleados creados
    public static Integer getTotalEmployees() {
        return employeeCount; 
    }
}