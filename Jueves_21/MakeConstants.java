package Jueves_21;

public class MakeConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constants();
	}
	
	public static void constants() {
		
		//Creacion de constante PI
		final double PI = 3.1416;
		
		//Calcular el area de un circulo
		double radio = 10, result;
		result = PI * radio * radio;
		System.out.println("El area del circulo es: " + result);
		
	}

}
