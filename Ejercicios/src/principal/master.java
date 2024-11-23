package principal;
import java.util.Scanner;
import java.util.InputMismatchException;
import Jueves21Nov.PersonalInformation;
import Jueves21Nov.Radio;
import Viernes22Nov.TemasVistos;
import Viernes22Nov.Cilindro;
public class master {
	public static void main(String[] args) {
		Boolean flag = true;
		Boolean flagOption = true;
		String option = "";
		String desition = "";
		Scanner scanner = new Scanner(System.in);
		PersonalInformation personalObj = new PersonalInformation();
		TemasVistos temasObj = new TemasVistos();
		Cilindro cilindroObj = new Cilindro();
		Radio radio = new Radio();
		do {
			System.out.println("Ingresa el número del ejercicio que deseas ejecutar "
					+ "\n 1. Información personal (21-11-2024) "
					+ "\n 2. Área circulo (21-11-2024) "
					+ "\n 3. Temas vistos (22-11-2024)"
					+ "\n 4. Cilindro (22-11-2024)");

	        option = scanner.nextLine();
	            
			 
			
			 
	        switch(option) {
				case "1" : personalObj.run(); break;
				case "2":	radio.run(); break;
				case "3":	temasObj.run(); break;
				case "4":	cilindroObj.run(); break;
				default: System.out.println("Esta opción no éxiste"); break;
			}
			
			
			System.out.println("¿Deseas probar otro ejercicio? \n 1. Si 2. No \n Si Ingresas una opción diferente el programa terminará");
			desition = scanner.nextLine();
			
			if(desition.equals("1")) {
				flag = true;
			}
			else {
				flag = false;
			}
			
		}while(flag);
		
		
	}
	
}
