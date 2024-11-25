package ejerciciosNivelacion_3;

public class Calculator {
	
		//a. Un atributo llamado “resultado” para almacenar el resultado de las operaciones.
		private Double result;
		
		//b. Métodos estáticos para realizar operaciones matemáticas básicas.
		public static Double sum(Double number1, Double number2) {
			return number1 + number2;
		}
		public static Double subtract(Double number1, Double number2) {
			return number1 - number2;
		}
		public static Double division(Double number1, Double number2) {
				return number1 / number2;
		}
		public static Double multiplication(Double number1, Double number2) {
			return number1 * number2;
		}
		
		//c. Un método de instancia para calcular el cuadrado de un número.
		public void squared (Double number) {
			this.result = number * number;
		}
		
		//d. Getters y setters para obtener y establecer el resultado de la calculadora.
		public Double getResult() {
			return result;
		}
		public void setResult(Double result) {
			this.result = result;
		}
		
		//e. Un constructor que imprima un mensaje de bienvenida a la calculadora.
		public Calculator() {
			System.out.println("Hello, welcome to the calculator.");
		}
}
