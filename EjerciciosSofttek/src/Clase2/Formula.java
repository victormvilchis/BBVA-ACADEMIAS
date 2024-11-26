package Clase2;
/*area lateral del cilindro 2 x PI x radio x altura.
 * area total de un cilindro area lateral + el area de la base (2 x PI x radio al 2)
 * volumen de un cilindro  PI x radio al cuadrado x altura
 */
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
