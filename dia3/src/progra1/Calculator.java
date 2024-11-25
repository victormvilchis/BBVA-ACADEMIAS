package progra1;

//a. Un atributo llamado “resultado” para almacenar el resultado de las operaciones.
 
//b. Métodos estáticos para realizar operaciones matemáticas básicas: suma, resta, multiplicación y división.
 
//c. Un método de instancia para calcular el cuadrado de un número.
 
//d. Getters y setters para obtener y establecer el resultado de la calculadora.
 
//e. Un constructor que imprima un mensaje de bienvenida a la calculadora.
 
//En el método main, crea una instancia de la clase Calculadora y realiza llamadas a los diferentes métodos para realizar operaciones matemáticas y calcular el cuadrado de un número.
import java.util.Scanner;

public class Calculator {
    // Atributo para almacenar el resultado
    private Double result;

    // Constructor
    public Calculator() {
        System.out.println("Welcome to the calculator");
        this.result = 0.0; // Inicializacion del resultado
    }

    // Getters y Setters
    public Double getResult() { 
        return result;
    }

    public void setResult(Double result) { //setter para perimitir la modificacion del resultado 
        this.result = result;
    }

    // Metodos estaticos para operaciones basicas
    public static Double add(Double a, Double b) {
        return Double.valueOf(a + b);
    }

    public static Double subtract(Double a, Double b) {
        return Double.valueOf(a - b);
    }

    public static Double multiply(Double a, Double b) {
        return Double.valueOf(a * b);
    }

    public static Double divide(Double a, Double b) {
        if (b.equals(0.0)) {
            throw new ArithmeticException("Error: try a number other than 0");
        }
        return Double.valueOf(a / b);
    }

    // Metodo de instancia para calcular el cuadrado de un numero
    public Double calculateSquare(Double number) {
        return Double.valueOf(number * number);
    }

    // Metodo principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(); 

        try { 
            // Pedir primer numero
            System.out.println("Enter the first number:");
            String input1 = scanner.nextLine();
            Double num1 = Double.valueOf(input1);

            // Pedir segundo numero
            System.out.println("Enter the second number:");
            String input2 = scanner.nextLine();
            Double num2 = Double.valueOf(input2);

            // operaciones
            System.out.println("Addition: " + Calculator.add(num1, num2));
            System.out.println("Subtraction: " + Calculator.subtract(num1, num2));
            System.out.println("Multiplication: " + Calculator.multiply(num1, num2));

            try {
                System.out.println("Division: " + Calculator.divide(num1, num2));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            // Calcular el cuadrado de un numero
            System.out.println("Enter a number to calculate its square:");
            String input3 = scanner.nextLine();
            Double squareNumber = Double.valueOf(input3);

            calculator.setResult(calculator.calculateSquare(squareNumber));
            System.out.println("The square of " + squareNumber + " is: " + calculator.getResult());

        } catch (NumberFormatException e) {
            System.out.println("Error: Enter only numbers.");
        }  finally {
            scanner.close();
            System.out.println("Thank you for using the Calculator.");
        }
    }
}