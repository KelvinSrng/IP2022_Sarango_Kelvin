package factorial1;

import java.util.Scanner;

public class Factorial1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int n, c, x, fact;
        
        c = 1;
        x = 0;
        fact = 1;
        
        //Ingreso de datos
        System.out.print ("CALCULO DE LA FUNCION FACTORIAL");
        System.out.print ("Ingrese un numero a factorizar: ");
        n = sc.nextInt();
        
        //Bucle
        while (c <= n){ 
            x = x + 1;
            fact = fact *x;
            c = c + 1;
        }
        System.out.println(fact);
        
    }
}