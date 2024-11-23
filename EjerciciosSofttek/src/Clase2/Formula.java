package Clase2;

import java.util.Scanner;

public class Formula {

	Double radius;
	Double height;

	public Formula(Double radio, Double height) {
		this.radius = radio;
		this.height = height;
	}

	public double lateralArea() {
		return 2 * Math.PI * radius * height;
	}

	public double totalArea() {
		return lateralArea() + 2 * Math.PI * radius * radius;
	}

	public double volume() {
		return Math.PI * radius * radius * height;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the radius of the cylinder:");
		Double radio = scanner.nextDouble();

		System.out.println("enter the height of the cylinder:");
		Double height = scanner.nextDouble();

		Formula formula = new Formula(radio, height);

		System.out.println("Lateral Area:" + formula.lateralArea());
		System.out.println("Total Area:" + formula.totalArea());
		System.out.println("volume:" + formula.volume());

		scanner.close();
	}
}
