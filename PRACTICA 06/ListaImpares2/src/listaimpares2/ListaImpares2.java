package listaimpares2;

import java.util.Scanner;

public class ListaImpares2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n, c, impar;
        
        System.out.print("Ingrese el numero de impares a mostrar: ");
        n = sc.nextByte();
        
        impar = 0;
        c = 1;
        
        while (c <= n) {
            
            if (c % 2 != 0) {
           
                System.out.println (c);
                impar = impar + 2;
            }
            impar = (byte) (impar + 1);
            c = (byte) (c + 1);
        }
    }    
}
