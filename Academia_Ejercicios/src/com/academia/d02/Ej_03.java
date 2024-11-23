package com.academia.d02;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ej_03 {

	public static void main(String[] args) {
		final Integer TWO = 2;
		final Double PI = 3.1459;
		
		try{
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Radius Value: ");
			Integer radius = sc.nextInt();
			sc.nextLine();
			//Double radius = new Double(sc.nextDouble());
			System.out.print("Enter Height Value: ");
			Integer height = sc.nextInt();
			sc.nextLine();
			//Double height = new Double(sc.nextDouble());
			
			sc.close();
			
			if(radius > 0 && height > 0) {
				
				Double lateralArea = new Double( (TWO * PI) * (radius) * (height) );
				Double basesArea = new Double( (TWO * PI) * (Math.pow(radius, TWO)) );
				Double totalArea = new Double( lateralArea + basesArea );
				Double volume = new Double( (PI * (Math.pow(radius, TWO))) * height );
				
				System.out.println("Lateral Area Result: " + String.format("%.4f", lateralArea));
				System.out.println("Total Area Result: " + String.format("%.4f", totalArea));
				System.out.println("Volume Result: " + String.format("%.4f", volume));
			
			} else {
				System.out.println("Error, All values must be positive...");
			}
			
		} catch (InputMismatchException | NumberFormatException e){
			System.out.println("Invalid Input Data..." + " Log: " + e);
		}

	}

}
