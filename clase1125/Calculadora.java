import java.util.Scanner;

public class Calculadora {

	private Double result; 
	private Boolean leave;
	private Boolean reset;
	
    private final String MESSAGE_ERROR = "Oops error!. Intente nuevamente";
    private final String MESSAGE_OPTION = "Digite la operación a realizar: ";
    private final String MESSAGE_RESULT = "El resultado es: ";
    
	public Calculadora() {
		System.out.println("¡Bienvenido a la calculadora Academia!");
	}
	
	public Calculadora(Boolean leave) {
    	this();
    	this.leave = leave;
    }
	
	public void setResult(Double result) {
		this.result = result;
	}
	
	public Double getResult() {
		return this.result;
	}
	
	public void setLeave(Boolean leave) {
		this.leave = leave;
	}
	
	public Boolean getLeave() {
		return this.leave;
	}
	
	public void setReset(Boolean reset) {
		this.reset = reset;
	}
	
	public Boolean getReset() {
		return this.reset;
	}	
	
	public static void sum(Double num1, Double num2, Calculadora calc) {
		calc.setResult(num1 + num2); 
	}
	
	public static void rest(Double num1, Double num2, Calculadora calc) {
		calc.setResult(num1 - num2); 
	}
	
	public static void mult(Double num1, Double num2, Calculadora calc) {
		calc.setResult(num1 * num2); 
	}
	
	public static void div(Double num1, Double num2, Calculadora calc) {
		calc.setResult(num1 / num2); 
	}
	
	public void pow(Double num1) {
		this.setResult(num1 * num1);
	}
	
	public void printOptionsOperations(Boolean init) {
		String optionsInit = 
				  "[1] Sumar \n"
				+ "[2] Restar \n"
				+ "[3] Multiplicar \n"
				+ "[4] dividir \n"
				+ "[5] potencia al cuadrado \n"
				+ "[6] salir \n";
		
		String optionsFinalize = 
				"[6] Salir \n" +
				"[7] Realizar otra operacion sin resetear el resultado previo \n" +
				"[8] Realizar otra operación con reseteo del resultado previo \n";
		
		System.out.println(init ? optionsInit : optionsFinalize);
	}
	
	public Double validateNumber(String message, Scanner scann, Boolean isDivision, Boolean isDivisor) {
	        Double number  = 0.0;
	        Boolean flag = false;

	        while (!flag) {
	            System.out.print(message);
	            String numberStr = scann.nextLine();

	            try {
	                number = Double.parseDouble(numberStr);
	                if(isDivision && isDivisor && number == 0.0) System.out.println(MESSAGE_ERROR);
	                else flag = true;
	            } catch (NumberFormatException e) {
	                System.out.println(MESSAGE_ERROR);
	            }
	        }
	        
	        return number;
	}
	
	public Integer validateNumberOption(String message, Scanner scann, Boolean init) {
		Integer option = 0;
		Boolean flag = false;
		while (!flag) {
	            System.out.print(message);
	            String numberStr = scann.nextLine();

	            try {
	                option = Integer.parseInt(numberStr);
	                
	                if(option < 1 || option > 8) System.out.println(MESSAGE_ERROR);
	                else if(init && option > 6) System.out.println(MESSAGE_ERROR);
	                else if(!init && option < 6) System.out.println(MESSAGE_ERROR);
	                
	                else flag = true;
	            } catch (NumberFormatException e) {
	                System.out.println(MESSAGE_ERROR);
	            }
	       }
	        
	    return option;
	}
	
	public Double getNumber1(Scanner scann, Boolean isDivision, Boolean isDivisor) {
		return getReset() != null && !getReset() ? getResult() : validateNumber("Digite el primer numero: ", scann, isDivision, isDivisor);
	}
	
	public Double getNumber2(Scanner scann, Boolean isDivision, Boolean isDivisor) {
		return validateNumber("Digite el segundo numero: ", scann, isDivision, isDivisor);
	}
	
	public void setLeaveAndReset( Integer option) {
		if(option == 6) setLeave(true);
		if(option == 7) setReset(false);
		if(option == 8) {
			setReset(true);
			setResult(0.0);
		}
	}
	
	public void printResult() {
		System.out.println(MESSAGE_RESULT + getResult());
		printOptionsOperations(false);
	}
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora(false);
		Scanner scann = new Scanner(System.in);
		
		while(!calc.getLeave()) {
			calc.printOptionsOperations(true);
			Integer option = calc.validateNumberOption(calc.MESSAGE_OPTION, scann, true);
			switch(option) {
				case 1:
					Calculadora.sum(calc.getNumber1( scann, false, false), calc.getNumber2( scann, false, false), calc);
					calc.printResult();
					option = calc.validateNumberOption(calc.MESSAGE_OPTION, scann, false);
					calc.setLeaveAndReset(option);
					break;
				case 2:
					Calculadora.rest(calc.getNumber1( scann, false, false), calc.getNumber2( scann, false, false), calc);
					calc.printResult();
					option = calc.validateNumberOption(calc.MESSAGE_OPTION, scann, false);
					calc.setLeaveAndReset(option);
					break;
				case 3:
					Calculadora.mult(calc.getNumber1( scann, false, false), calc.getNumber2(scann, false, false), calc);
					calc.printResult();
					option = calc.validateNumberOption(calc.MESSAGE_OPTION, scann, false);
					calc.setLeaveAndReset(option);
					break;
				case 4:
					Calculadora.div(calc.getNumber1( scann, false, false), calc.getNumber2(scann, true, true), calc);
					calc.printResult();
					option = calc.validateNumberOption(calc.MESSAGE_OPTION, scann, false);
					calc.setLeaveAndReset(option);
					break;
				case 5:
					calc.pow(calc.getNumber1( scann, false, false));
					calc.printResult();
					option = calc.validateNumberOption(calc.MESSAGE_OPTION, scann, false);
					calc.setLeaveAndReset(option);
					break;
				case 6: 
					calc.setLeave(true);
					break;
			}
		}
		
		scann.close();
	}

}
