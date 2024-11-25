package academia.java;

import java.util.Scanner;

public class Calculator {
	
    private Double result;

//  e. Un constructor de la clas calc que imprima un mensaje de bienvenida a la calculadora

//  b. Métodos estáticos para realizar operaciones matemáticas 
//    básicas: suma, resta, multiplicación y división.
    
    public static Double plus(Double a, Double b) {
        return (a + b);
    }

    public static Double minus(Double a, Double b) {
        return (a - b);
    }

    public static Double times(Double a, Double b) {
        return (a * b);
    }  
    
    public static Double dividedBy(Double a, Double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (a / b);
    }


    // C. Método de instancia para calcular el squareNum de un número
    public Double squareNum(double a) {
        this.result = (a * a);
        return this.result;//mover
    }

// d. Getters y setters para obtener y establecer el resultado de la calculadora.
    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
    }
    
    
//Empieza el método main 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //creando instancia a la clase Calculadora
        Calculator calc = new Calculator();
        //variableInstancia
        System.out.println("Bienvenida a la Calculadora");
        Boolean validInput;
        
        double num1 = 0;
        double num2 = 0;

        // Validación y entrada de datos para las operaciones
        //método do-while, ciclo de validacion
        
//        if (input1.matches("-?\\d+(\\.\\d+)?")) {
//            num1 = Double.parseDouble(input1);
//            validInput = true;
//        } else {
//            System.out.println("Error. inválida. Por favor, introduce un número válido.");
//        }
        do {
            try {
                System.out.print("Ingresa el primer número: ");
                num1 = Double.parseDouble(scanner.nextLine());
                validInput = true;
                //validInput = validar el ingreso del primer numero 
            } catch (NumberFormatException e) {
            	//intento de conversión de una cadena a un número falla.
                System.out.println("Error. Ingresa un número válido.");
                validInput = false;
            }
        } while (!validInput);
        
        
        //probrando con if 
        if (validInput) {
            System.out.print("Ingresa el segundo número: ");
            String input2 = scanner.nextLine();
            //utilizando expresiones regulare
            if (input2.matches("-?\\d+(\\.\\d+)?")) {
                num2 = Double.parseDouble(input2);
            } else {
                System.out.println("Error. Ingresa un número válido.");
                validInput = false;
            }
        }
//        do {
//            try {
//                System.out.print("Introduce el segundo número: ");
//                num2 = Double.parseDouble(scanner.nextLine());
//                validInput = true;
//            } catch (NumberFormatException e) {
//                System.out.println("Error, ingresa un número válido.");
//                validInput = false;
//            }
//        } while (!validInput);

        // Las operaciones  
        Double plus = Calculator.plus(num1, num2);
        Double minus = Calculator.minus(num1, num2);
        Double times = Calculator.times(num1, num2);
        double dividedBy = 0;
        try {
            dividedBy = Calculator.dividedBy(num1, num2);
        } catch (ArithmeticException e) {
        	//excepcion si se intenta dividir por 0
            System.out.println(e.getMessage());
        }

        // Calcular el cuadrado de un número
        Double squareNum = calc.squareNum(num1);
        

        // Resultados de las operaciones 
        System.out.println("El resultado de la suma es: " + plus);
        System.out.println("El resultado de la resta: " + minus);
        System.out.println("El resultado de la multiplicación: " + times);
        System.out.println("El resultado de la división: " + dividedBy);
        System.out.println("El resultado del cuadrado del primer número es : " + squareNum);
        
        scanner.close();
    }
}

//error infinito = se sale del rango del double 
//NAN division
