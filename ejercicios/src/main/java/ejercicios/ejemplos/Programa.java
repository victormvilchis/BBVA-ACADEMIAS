package ejercicios.ejemplos;

public class Programa {

    public static void main(String[] args) {
        // VARIABLES
        int edad = 22; 
        String msg1 = "No tienes licencia";
        String msg2 = "Si tienes licencia.";
        
        // CONSTANTES
        final String NOMBRE = "Efrain";
        final String APELLIDOS = "Cruz Lobato";
        final int AÑO_ACTUAL = 2024;
        final int EDAD_MINIMA = 18;
        final int EDAD_OBJETIVO = 30;

        // OPERACIONES
        int añoNacimiento = AÑO_ACTUAL - edad;
        boolean mayorDeEdad = edad >= EDAD_MINIMA;
        boolean licencia = false;
        int añosPara30 = EDAD_OBJETIVO - edad;
        boolean puedeConducir = mayorDeEdad && licencia;
        boolean esMenorDe30 = edad < EDAD_OBJETIVO;
        boolean tieneLicencia = mayorDeEdad && licencia;
        int añosDesde18 = edad - EDAD_MINIMA;
        añosDesde18++; 

        // IMPRIMIR RESULTADO
        System.out.println("Mi nombre es: " + NOMBRE + " " + APELLIDOS);
        System.out.println(NOMBRE + ", tengo " + edad + " años, nací en " + añoNacimiento + 
                           ", soy mayor de edad: " + mayorDeEdad + 
                           ", y puedo conducir: " + puedeConducir + ".");
        System.out.println("Me faltan " + añosPara30 + " años para cumplir 30.");
        System.out.println("¿Soy menor de 30 años? " + esMenorDe30);
        System.out.println("¿Tengo licencia para conducir? " + (tieneLicencia ? msg2 : msg1));
        System.out.println("Han pasado " + añosDesde18 + " años desde que cumplí 18.");
    }
}
