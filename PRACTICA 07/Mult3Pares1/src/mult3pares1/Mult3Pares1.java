package mult3pares1;

import java.util.Scanner;

public class Mult3Pares1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        byte n;
        int x;
        byte c;
        
        System.out.print ("Ingrese cantida de ellementos a mostrar: ");
        n = sc.nextByte();
        
        x = 0;
        c = 1;
        
        while (c <= n ) {
            x = x + 2;
            if  (x % 3 >= 1) {
                System.out.println ( x);
                c = (byte) (c + 1);
            }
        }
    }
}
