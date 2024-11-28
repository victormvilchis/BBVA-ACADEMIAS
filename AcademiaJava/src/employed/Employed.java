package employed;
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
	public Boolean isYoung() {
		return age < 30;
	}
	
	//Calcular el salario anual del empleado (salarioAnual()).
	public Double annualSalary() {
		return (salary * 12);
	}
	
	//define un método estático   () que devuelva el número total de empleados.
	public static Integer getEmployed() {
		return count_employed;
	}
	
	 void employedInformation() { 
		System.out.println("Name: " + name + ", "
				          + "Salary: " + salary + ","
						  + " Age: " + age); 
		} 
	public Double getSalary() { 
		return salary; 
		}
	 public void setSalary(double salary) {
	    }
	 public int getAge() {
	        return age;
	    }

	 
}
