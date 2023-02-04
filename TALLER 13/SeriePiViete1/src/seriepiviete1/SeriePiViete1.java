package seriepiviete1;

import java.util.Scanner;

public class SeriePiViete1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        int numprox;
        double pi = 1;
        
        //Ingreso de datos
        System.out.println("\tSERIE PI POR EL METODO VIETE");
        System.out.println("=================================================");
        System.out.print("Ingrese cuantas aproximaciones desea hacer: ");
        numprox = sc.nextInt();
        for ( int i = numprox; i >= 1; i --) {
            pi = pi * piViete(i);
        }
        //Salida
        System.out.println("\nLa aproximacion a pi con el numero " + numprox + " es :" + 2/pi);
    }
    
    public static double piViete(int n) {
        if ( n == 1 ) {
            return Math.sqrt((double) 1/2);
        } else {
            return Math.sqrt((double) 1/2 + (double)1/2 * piViete(n - 1));
        }
    }   
}