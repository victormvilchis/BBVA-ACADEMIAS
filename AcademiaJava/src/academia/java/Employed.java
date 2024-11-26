package academia.java;
public class Employed {

	private String name;
	private Integer age;
	private Double salary;
    private static final Double increment_salary = 10.0;
	private static Integer count_employed = 0;
	
	//constructor parametrizado, name
	public  Employed(String name, Integer age, Double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
		count_employed ++;
	}
	//Aumentar el salario en un porcentaje dado (aumentarSalario()).
	public void  incrementSalary(Double porcentage) {
		salary += salary *(porcentage /100);
	}
	
	
//	Determinar si el empleado es joven (menor de 30 años) (esJoven()).
	
//	public void young(Integer employed) {
//	if (employed < 30) {
//		System.out.println("Eres joven");
//	} else {
//		System.out.println("Estas viejesito");
//	}
//}
	public Boolean isYoung() {
		return age < 30;
	}
	
	//Calcular el salario anual del empleado (salarioAnual()).
	public Double annualSalary() {
		return (salary * 12);
	}
	
	//efine un método estático   () que devuelva el número total de empleados.
	public static Integer getEmployed() {
		return count_employed;
	}
	//Crea una clase llamada Main.
	public static void main(String [] args) {		
		//En el método main, crea tres objetos Empleado con diferentes valores de nombre, edad y salario.
		Employed employ1 = new Employed("Mar", 48, 1800.00);
		Employed employ2 = new Employed("Alfredo", 16, 1600.00);
		Employed employ3 = new Employed("Soledad", 15, 1230.00);
		
		
		
		//Imprime la información de todos los empleados después de cada operación.
		
		System.out.println("Employee 1's name is " + employ1.name + " his age is " + employ1.age + " and his salary is " + employ1.salary);
		System.out.println("Employee 2's name is " + employ2.name + " his age is " + employ2.age + " and his salary is " + employ2.salary);
		System.out.println("Employee 3's name is " + employ3.name + " his age is " + employ3.age + " and his salary is " + employ3.salary);

		do {
			System.out.println("the salary before the increment is ");
			employ1.incrementSalary(increment_salary); 
		} while (employ1.salary<5000);
	
	
		// Verifica si el segundo empleado es joven y, si lo es, aumenta su salario en un 10%.
		if (employ2.isYoung()) {
			employ2.incrementSalary(10.0);
		}
		System.out.println("------------------------------------------------------------------------------");
		//Calcula y muestra el salario anual de cada empleado
		System.out.println("The annual salary of: " + employ1.name + " is" + " $" + employ1.annualSalary());
		System.out.println("The annual salary of: " + employ2.name + " is" + " $" + employ2.annualSalary());
		System.out.println("The annual salary of: " + employ3.name + " is" + " $" + employ3.annualSalary());
		
		System.out.println("------------------------------------------------------------------------------");

		//total de empleados
		System.out.println("Total number of employees: " + Employed.getEmployed());
	}
}
