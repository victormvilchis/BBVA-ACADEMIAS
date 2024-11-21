package principal;
import java.util.Scanner;
import Jueves21Nov.PersonalInformation;
import Jueves21Nov.Radio;
public class master {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PersonalInformation personalObj = new PersonalInformation();
		Radio radio = new Radio();
		System.out.println("Ingresa el número del ejercicio que deseas ejecutar \n 1. Información personal \n 2. Área circulo");
		int option = scanner.nextInt();
		
		switch(option) {
			case 1 : personalObj.run(); break;
			case 2:	radio.run(); break;
			default: System.out.println("Esta opción no éxiste"); break;
		}
		
	}
}
