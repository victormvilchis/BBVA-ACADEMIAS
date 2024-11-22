package principal;
import java.util.Scanner;
import Jueves21Nov.PersonalInformation;
import Jueves21Nov.Radio;
import Viernes22Nov.TemasVistos;
public class master {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PersonalInformation personalObj = new PersonalInformation();
		TemasVistos temasObj = new TemasVistos();
		Radio radio = new Radio();
		System.out.println("Ingresa el número del ejercicio que deseas ejecutar \n 1. Información personal (21-11-2024) \n 2. Área circulo (21-11-2024) \n 3. Temas vistos (22-11-2024)");
		int option = scanner.nextInt();
		
		switch(option) {
			case 1 : personalObj.run(); break;
			case 2:	radio.run(); break;
			case 3:	temasObj.run(); break;
			default: System.out.println("Esta opción no éxiste"); break;
		}
		
	}
}
