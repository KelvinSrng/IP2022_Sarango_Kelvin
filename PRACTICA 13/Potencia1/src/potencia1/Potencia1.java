package potencia1;

import java.util.Scanner;

public class Potencia1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int base, exponente;
        
        //Ingreso de datos
        System.out.println("\tPOTENCIA DE UN NUMERO");
        System.out.println("-----------------------------------");
        System.out.print("Ingrese la base: ");
        base = sc.nextInt();
        System.out.print("Ingrese el exponete: ");
        exponente = sc.nextInt();
        
        //Salidaf
        System.out.println("\nLa potencia es: " + Potencia(base,exponente));
    }
    public static long Potencia(int x, int y) {
        long pt;
       
        if (y == 0) {
            pt = 1;
        } else {
            pt = x * Potencia(x,y-1);
        }
        return pt;
    }   
}