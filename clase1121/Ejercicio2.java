package clase1121;

public class Ejercicio2 {
	private static final double PI = 3.14159;
	
	public static void calcularAreaCirculo(int radio) {
		System.out.print(PI * radio * radio);
	}
	
	public static void main(String [] args) {
		calcularAreaCirculo(10);
	}
}
