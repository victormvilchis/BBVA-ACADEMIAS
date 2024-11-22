package com.academia.d02; //Primero el package

import java.util.Scanner; // Después la importación necesaria
import com.academia.d01.*;

public class Ej_02 { //Luego la clase

	public static void main(String[] args) {
		
		final int DIAS_LABORALES = 5;
		final int MAYOR_EDAD = 18;
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Ingresa tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingresaste: " + nombre);
		
		System.out.print("Ingresa edad: ");
		int num = sc.nextInt();
		
		if(num >= MAYOR_EDAD) {
			System.out.print("Trámite de identificación oficial iniciado");
		} else {
			System.out.println("No apto para iniciar trámite");
		}
		System.out.println("");
		
		System.out.print("¿Cuántos días tiene la semana para laborar?: ");
		Integer dias = new Integer(sc.nextInt());
		String respuesta = (dias == DIAS_LABORALES) ? "Ok" : "No.";
		System.out.println("Respuesta: " + respuesta);
		
		Integer a = new Integer(2);
		Integer b = new Integer(8);
		//Integer c = 2;

		int suma = (a + b);
		int resta = (a - b);
		int multiplica = (a * b);
		int divide = (b == 0) ? 0: (a/b);
		
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicación: " + multiplica);
		System.out.println("División: " + divide);
		System.out.println("");
		
		Integer Value = new Integer(9);
		System.out.println("Value: " + Value);
		System.out.println("New Value on 1: " + (Value++));
		System.out.println("New Value on 2: " + (++Value));
		System.out.println("New Value minus 1: " + (Value--));
		System.out.println("New Value minus: " + (--Value));
		
		Integer asignNewValue = new Integer((Value += 8));
		System.out.println(asignNewValue);

	}

}
 