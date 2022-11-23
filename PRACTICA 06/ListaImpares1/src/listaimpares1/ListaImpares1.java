package listaimpares1;

import java.util.Scanner;

public class ListaImpares1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        byte n, c, impar;
        
        System.out.print("Ingrese el numero de impares a mostrar: ");
        n = sc.nextByte();
        
        impar = 1;
        c = 1;
        while (c <= n) {
            System.out.println (impar);
            impar = (byte) (impar + 2);
            c = (byte) (c + 1);           
        }
    }    
}
