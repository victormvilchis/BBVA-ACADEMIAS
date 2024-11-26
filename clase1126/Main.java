import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private final String MESSAGE_NAME = "Input the employee name: ";
	private final String MESSAGE_AGE = "Input the employee age: ";
	private final String MESSAGE_SALARY = "Input the employee salary: ";
	private final String MESSAGE_ITERATIONS = "Input the number of entries: ";
	private final String MESSAGE_ERROR = "Oops error!. Check your input and try again";
	 
	public static boolean regexName(String name) {
        String regex = "^[A-Z][a-z]+(?: [A-Z][a-z]+)*$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        
        return matcher.matches();
    }
	
	public String validateName(Scanner scann) {
		String name = "";
		Boolean flag = false;
		
		while(!flag) {
			System.out.print(MESSAGE_NAME);
            name = scann.nextLine();
            if(!regexName(name)) System.out.println(MESSAGE_ERROR);
            else flag = true;
		}
		
		return name;
	}
	
	public Integer validateAgeOrIterations(Scanner scann, Boolean isAge) {
        Integer number  = 0;
        boolean flag = false;

        while (!flag) {
            System.out.print(isAge ? MESSAGE_AGE : MESSAGE_ITERATIONS);
            String numberStr = scann.nextLine();

            try {
                number = Integer.parseInt(numberStr);
                if(isAge && number >= 18 && number <= 112) flag = true;
                else if(!isAge && number > 0 && number <= 10) flag = true;
                else System.out.println(MESSAGE_ERROR);
            } catch (NumberFormatException e) {
                System.out.println(MESSAGE_ERROR);
            }
        }
        
        return number;
    }
	
	public Double validateSalary(Scanner scann) {
        Double number  = 0.0;
        boolean flag = false;

        while (!flag) {
            System.out.print(MESSAGE_SALARY);
            String numberStr = scann.nextLine();

            try {
                number = Double.parseDouble(numberStr);
                if(number > 0) flag = true;
                else System.out.println(MESSAGE_ERROR);
            } catch (NumberFormatException e) {
                System.out.println(MESSAGE_ERROR);
            }
        }
        
        return number;
    }	
	
	public Employee createEmployee(Scanner scann) {
		String name = validateName(scann);
		Integer age = validateAgeOrIterations(scann, true);
		Double salary = validateSalary(scann);
		
		return new Employee(name, age, salary);
	}
	
	public List<Employee> inputEmployees(){
		Scanner scann = new Scanner(System.in);
		Integer iterations = validateAgeOrIterations(scann, false);
		List<Employee> employees = new ArrayList<>();
		Integer count = 0;
		
		while(count < iterations) {
			employees.add(createEmployee(scann));
			Employee.setTotalEmployees();
			count++;
		}
		
		return employees;
	}
	
	public List<Employee> mutationEmployees(List<Employee> employees){
		do {
			if(employees.get(0).getSalary() < 5000) {
				employees.get(0).incrementSalary(5.0);
			}
		}while(employees.get(0).getSalary() <= 5000);
		
		if(employees.size() >= 2 && employees.get(1).isYoung()) {
			employees.get(1).incrementSalary(employees.get(0).SALARY_INCREMENT);
		}
		
		return employees;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		List<Employee> employees = main.inputEmployees();
		for(Employee employee: main.mutationEmployees(employees)) {
			employee.printInfoEmployee();
		}
		System.out.println("Total employees: "+ Employee.getTotalEmployees());
	}

}
