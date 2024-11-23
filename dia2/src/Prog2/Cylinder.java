package Prog2;
import java.util.Scanner;

public class Cylinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pi 
        Double pi = 3.14159;

        //radio
        System.out.print("Enter the cylinder radius: ");
        Double radius = Double.valueOf(scanner.nextLine()); 

        //altura 
        System.out.print("Enter the cylinder height: ");
        Double height = Double.valueOf(scanner.nextLine()); 

        //el cuadrado del radio
        Double squaredRadius = radius * radius;

        //calculos 
        Double lateralArea = 2 * pi * radius * height;
        Double totalArea = lateralArea + 2 * pi * squaredRadius;
        Double volume = pi * squaredRadius * height;

        //resultados
        System.out.println("Lateral Area: " + lateralArea);
        System.out.println("Total Area: " + totalArea);
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}