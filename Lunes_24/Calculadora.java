package Lunes_24;

public class Calculadora {
	/*Define una clase llamada Calculadora que contenga los siguientes elementos:
	 
	a. Un atributo llamado “resultado” para almacenar el resultado de las operaciones.
	 
	b. Métodos estáticos para realizar operaciones matemáticas básicas: suma, resta, multiplicación y división.
	 
	c. Un método de instancia para calcular el cuadrado de un número.
	 
	d. Getters y setters para obtener y establecer el resultado de la calculadora. */
	
	private static Double result;
	

	public static Double getResult() {
		return result;
	}

	public static void setResult(Double resultado) {
		Calculadora.result = resultado;
	}

	public static Double addition(Double n1, Double n2) {
		setResult((n1+n2));
		
		return getResult();
	}
	
	public static Double substraction(Double n1, Double n2) {
		setResult((n1-n2));
		
		return getResult();
	}
	
	public static Double multiplication(Double n1, Double n2) {
		setResult((n1*n2));
		
		return getResult();
	}
	
	public static Double division(Double n1, Double n2) {
		setResult((n1/n2));
		
		return getResult();
	}
	
	public Double numberSquare(double number) {
		return (number * number);
	}
	
	public void welcome() {
		System.out.println("Bienvenido a la calculadora");
	}
}
