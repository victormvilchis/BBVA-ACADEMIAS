import java.util.Scanner;

public class Expresiones {
    private final Double PI = 3.1416;
    private final String MESSAGE_ERROR = "Oops error!. Intente nuevamente";
    
    public Double lateralArea(Double radius, Double height) {
        return 2 * PI * radius * height;
    }
    
    public Double baseArea(Double radius) {
    	return 2 * PI * radius * radius;
    }
    
    public Double totalArea(Double radius, Double height) {
        return this.lateralArea(radius, height) + this.baseArea(radius);
    }

    public Double volume(Double radius, Double height) {
        return PI * radius * radius * height;
    }

    public Double validateNumber(String message, Scanner scann) {
        Double number  = 0.0;
        boolean flag = false;

        while (!flag) {
            System.out.print(message);
            String numberStr = scann.nextLine();

            try {
                number = Double.parseDouble(numberStr);
                if(number > 0) flag = true;
                else System.out.println(MESSAGE_ERROR);
            } catch (NumberFormatException e) {
                System.out.println(MESSAGE_ERROR);
            }
        }
        
        return number;
    }

    public static void main(String[] args) {
        Expresiones expressions = new Expresiones();
        Scanner scann = new Scanner(System.in);

        Double radius = expressions.validateNumber("Ingrese el radio del cilindro: ", scann);
        Double heigth = expressions.validateNumber("Ingrese la altura del cilindro: ", scann);
        
        System.out.println("====================");
        System.out.println("Altura: "+ heigth);
        System.out.println("Radio: "+ radius);
        System.out.println("Area lateral: " + expressions.lateralArea(radius, heigth));
        System.out.println("Area total: " + expressions.totalArea(radius, heigth));
        System.out.println("Volumen: " + expressions.volume(radius, heigth));
        System.out.println("====================");
        
        scann.close();
    }
}
