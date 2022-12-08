package primo1;

import java.util.Scanner;

public class Primo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        int n, c;
        String esPrimo;
        
        //Ingreso de datos
        System.out.print ("Ingrese un numero entero: ");
        n = sc.nextInt();
        
        esPrimo = "S";
        c = n - 1;
        
        //Bucle
        while (c >= 2) {
            if (n % c == 0) {
                esPrimo = "N";
                c = 1;
            } else {
                c = c - 1;
            }
        }
        if ( esPrimo == "S") {
            System.out.println ("El numero " + n + " es primo.");
        } else {
            System.out.println ("El numero " + n + " no es primo.");
        }
    }
    
}