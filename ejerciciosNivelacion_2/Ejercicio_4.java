 /*
  * Desarrolla un programa en java que calcule el area latera, el area total y volumen de un cilindro
  * dados su radio y su altura. Utiliza las siguientes formulas.
  * 
  * area lateral = 2 * PI * radio * altura
  * area de bases = 2 * PI * radio^2
  * area total = Area lateral + Area de bases
  * volumen de un cilindro PI * radio^2 * altura
  * */

package ejerciciosNivelacion_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		final Double PI = 3.141592;
		Double radius;
		Double height;
		
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.println("Welcome, enter the radius and height of a cylinder.");
			System.out.print("Enter the radius of your cylinder: ");
			radius = in.nextDouble();
			in.nextLine(); //Corrección al problema de validación de "5 5"
			
			System.out.print("Now, enter the height of the same: ");
			height = in.nextDouble();
			in.nextLine(); //Corrección al problema de validación de "5 5"
			
			if((radius > 0) && (height > 0)){
				Double sideArea = 2 * PI * radius * height;
				Double baseArea = 2 * PI * (radius * radius);
				Double totalArea = sideArea + baseArea;
				Double volume = PI * (radius * radius) * height;
				
				System.out.println("\nThe lateral area is : " + String.format("%.2f", sideArea)
								 + "\nThe total area is: "    + String.format("%.2f", totalArea)
								 + "\nThe volume is of: " 	  + String.format("%.2f", volume));
			}
			else {
				System.out.println("You did not enter positive values.");
			}
		}
		catch (InputMismatchException e){
			System.out.println("You did not enter a valid numeric value.");
		}
		
		in.close();
	}
}
