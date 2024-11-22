package Ejercicio2;

import java.util.Scanner;

public class EjercicioCilindro {
	private static final Double PI =3.14159;
	public static void main(String[] args)
	{
		Double lateralArea;
		Double totalArea;
		Double volume;
		Double radius;
		Double height;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Insert the radius of the cylinder: ");
			radius = scanner.nextDouble();
			System.out.print("Insert the height of the cylinder: ");
			height = scanner.nextDouble();
			
			if(radius > 0 && height > 0)
			{
				lateralArea = lateralArea(height,radius);
				totalArea = totalArea(lateralArea,radius);
				volume = volume(height,radius);
				
				System.out.println("The lateral area is: " + lateralArea);
				System.out.println("The total area is: "+ totalArea);
				System.out.println("The volume is: " + volume);
			}
			else
			{
				System.out.println("The radius and the height cannot be 0 or less than 0");
			}
		} catch(Exception e)
		{
			System.out.println("Please enter numeric values");
		}
		scanner.close();
	}
	static Double lateralArea(Double height, Double radius)
	{
		Double lateralArea;
		lateralArea = (2 * PI * radius * height);
		return lateralArea;
	}
	static Double totalArea(Double lateralArea, Double radius)
	{
		Double basesArea;
		Double totalArea;
		basesArea = (2 * PI * Math.pow(radius, 2));
		totalArea = (basesArea + lateralArea);
		return totalArea;
	}
	static Double volume(Double height, Double radius)
	{
		Double volume;
		volume = (PI * radius * height);
		return volume;
	}
}
