package ejerciciosNivelacion_1;

public class Ejercicio_2 {

	public static void main(String[] args) {
		/*
		Crear Constantes: Declara una constante de tipo double llamada PI y asigna el valor 3.14159.
		Usar Constantes en Expresiones: Calcula el área de un círculo con radio 10 usando la constante PI
		y una variable radio*/
		
		final double PI = 3.14159;
		double radio = 10, area;
		
		area = PI * Math.pow(radio, 2);
		
		System.out.println("Cálculo del área del círculo.");
		System.out.println("El area es " + area);

	}

}
