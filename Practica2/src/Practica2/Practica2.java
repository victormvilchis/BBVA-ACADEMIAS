package Practica2;

/*(Variables, Constantes y Operadores). No incluir ningún tema extra.*/

public class Practica2 {
	public static void main(String[] args) {
		final String EMPRESA = "Softtek";
		String nombre = "Carolina";
		String apellido = "Samperio";
		int edad = 24;
		int fechaNacimiento;
		int anio = 2024;
		
		int salarioM;
		int salarioS;
		int diasQuincena = 15;
		int salarioDia = 450;
		int contadorDiciembre = 23;
		int totalDias = 9;
		
		double suma;
		double resta;
		double mul;
		double div; 
		double mod;
		int a = 75;
		int b = 20;
		
		String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
		
		totalDias += contadorDiciembre;
		String mensaje2 = (totalDias >= 7) ? "Todavia hay tiempo" : "Tu examen esta cerca";
		
		fechaNacimiento = (anio - edad);
		
		salarioS = (salarioDia * diasQuincena);
		salarioM = (salarioDia * 30);
		
		suma = (a + b);
		resta = (a - b);
		div = (a / b);
		mul = (a * b);
		mod = (a % b);
		
		System.out.println("Bienvenida a nuestra empresa "+EMPRESA);
		System.out.println("\nNombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Edad: "+edad+" "+mensaje);
		System.out.println("Fecha de nacimiento: "+fechaNacimiento);
		System.out.println("\nTienes "+totalDias+" dias para prepararte para tu examen del 23 de Diciembre."+" "+mensaje2);
		System.out.println("\nTu salario de esta quincena es de $"+salarioS);
		System.out.println("Tu salario mensual es de $"+salarioM);
		System.out.println("\nResultados de tu calculadora funcional"+"\nSuma: "+suma+"\nResta: "+resta+"\nMultiplicacion: "+mul+"\nDivision: "+div+"\nModulo: "+mod);
	}
}
