package ejerciciosNivelacion_3;

import java.util.InputMismatchException;
import static java.lang.System.exit;
import java.util.Scanner;

public class Exercise_5 {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		Double number1, number2, number3;
		String option = "continue";
		
		Scanner in = new Scanner(System.in);
		
		while(option.equals("continue")) {
			try {
				System.out.print("Enter a number for basic operations: ");
				number1 = in.nextDouble();
				in.nextLine().trim();
				
				System.out.print("Enter another number for basic operations: ");
				number2 = in.nextDouble();
				in.nextLine().trim();
				
				System.out.print("finally, enter a number to square it: ");
				number3 = in.nextDouble();
				in.nextLine().trim();
				
				
				if((number1 >= 0) && (number2 >= 0) && (number3 >= 0)){
					
					//We call the static methods..
					c.setResult(Calculator.sum(number1, number2));
					System.out.println("The result of the sum is: " + c.getResult());
					
					c.setResult(Calculator.subtract(number1, number2));
					System.out.println("The result of the subtraction is: " + c.getResult());
					
					c.setResult(Calculator.multiplication(number1, number2));
					System.out.println("The result of the multiplication is: " + c.getResult());
					
					c.setResult(Calculator.division(number1, number2));
					System.out.println("The result of the division is: " + c.getResult());
					
					//We call the instance method.
					c.squared(number3);
					System.out.println("The result of the number squared is: " + c.getResult());
					
				}
				else {
					System.out.println("You did not enter positive values.");
				}
				System.out.print("\nDo you want to continue? enter 'no' if you want to exit: ");
				String value = in.next();
				in.nextLine();
				
				if(value.equalsIgnoreCase("no")) {
					option = "";
					System.out.println("See you!");
					exit(0);
				}
			}
			catch (InputMismatchException e){
				System.out.println("\nYou did not enter a valid numeric value.");
				option = "";
			}
		}
		in.close();	
	}
}