package Viernes_22;

import java.util.Random;

public class EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operaciones();

	}
	
	public static void operaciones() {
		Random randomNum = new Random();
		
		int N1 = randomNum.nextInt(100); //Asignaion de variables
		
		final int N2 = 30; //Asignacion de Constante
		
		System.out.println("Los numeros a utilizar para las operaciones seran " + N1 + " Y " + N2); //Impresion de numeros
		
		int sum, res, mult, div, mod;
		//Uso de operadores aritmeticos
		sum = N1 + N2;
		res = N1 - N2;
		mult = N1 * N2;
		div = N1 / N2;
		mod = N1 % N2;
		//Impresion de resultados
		System.out.println("Los resultados de las operaciones son: Suma: " + sum + ", Resta: " + res+ ", Multiplicacion: " + mult + ", Division: " + div + ", Residuo: " + mod);
		//Usos de operador logico
		if(sum == res || sum == mult || sum == div) {
			System.out.println("El resultafo de dos eperaciones es similar");
		}else {
			System.out.println("Todas las operaciones tienen resultados diferentes");
		}
	}

}
