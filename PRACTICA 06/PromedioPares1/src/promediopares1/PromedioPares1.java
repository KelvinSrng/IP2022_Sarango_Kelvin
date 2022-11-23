package promediopares1;

import java.util.Scanner;

public class PromedioPares1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        short n, c, par;
        short prom, suma;
        
        System.out.print("Ingrese el numero de pares a promediar: ");
        n = sc.nextShort();
        
        suma = 0;
        par = 0;
        c = 1;
        
        while (c <= n) {
            
            par = (short) (par + 2);
            suma = (short) (suma + par);
            c = (byte) (c + 1);
            }
        
            prom = (short) (suma /n);
        
        System.out.println("El promedio de la suma de los numeros pares en: " + prom );
    }    
}
