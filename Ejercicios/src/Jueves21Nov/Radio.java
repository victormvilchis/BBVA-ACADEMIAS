package Jueves21Nov;


public class Radio {
	final double PI = 3.1416;
	double radio = 10;
	public double calculaArea() {
		return PI * (radio * radio);
	}
	
	public void run() {
		System.out.println("El área del circulo es: " + calculaArea());
	}
	
}
