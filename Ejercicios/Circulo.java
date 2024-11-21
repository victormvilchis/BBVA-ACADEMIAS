/* 	Crear Constantes: Declara una constante de tipo double llamada PI y asigna el valor 3.14159.
   	Usar Constantes en Expresiones: Calcula el área de un círculo con radio 10 usando la constante PI y una variable radio
*/

public class Circulo {
	
	public static void main(String[] args){
		//Constante
		final double PI = 3.14159;
		double radio = 5.0;
		//Expresión
		double area = PI * radio * radio;
		System.out.println("El área del círculo es: " + area);
	}
}