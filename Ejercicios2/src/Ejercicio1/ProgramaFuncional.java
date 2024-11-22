package Ejercicio1;

import java.util.Scanner;

public class ProgramaFuncional {
    private static final double promAprobada = 6.0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double promedio;
        int aciertos, reactivos; 
        String calAprobatoria = "reprobado";
        
        System.out.println("Ingrese el numero de reactivos: " );
        reactivos = scanner.nextInt();
        System.out.print("Ingrese el número de reactivos correctos: ");
        aciertos = scanner.nextInt();
        promedio = ((double) aciertos / reactivos);  
        promedio *= 10;
        
        if(promedio>= promAprobada)
        {
        	calAprobatoria = "aprobado";
        }
        else
        {
        	calAprobatoria = "reprobado";
        }
        
        calAprobatoria = promedio >= promAprobada ? "aprobado" : "reprobado";
        System.out.println("El numero de reactivos es: " +reactivos);
        System.out.println("El alumno está " + calAprobatoria);
        System.out.println("La calificación de tu examen fue de: "+ promedio);
        if(calAprobatoria=="aprobado")
        {
        	System.out.println("Felicidades");
        }
        else 
        	System.out.println("Suerte para la proxima");
        scanner.close();
    }
}

