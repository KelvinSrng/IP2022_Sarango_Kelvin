package decimalabinario1;

import java.util.Scanner;

public class DecimalABinario1 {
@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Asignacion de variables
        int num, div, bin, c, g ;
        
        bin = 0;
        c = 0;
        g = 0;
        
        //Ingreso de datos
        System.out.println("REPRESENTACION DE UN NUMERO A BINARIO");
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        
        while(num >= 1) {
            div = num % 2;
            bin = (int) ((bin + div) * (Math.pow(10,c)));
            g = g + bin;
            bin = 0;
            c = c + 1;
            num = (int)num / 2;
        }
        System.out.println("El numero representado en sistema binario es: " + g);
    }
}