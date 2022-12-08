package validadivisor1;

import java.util.Scanner;

public class ValidaDivisor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        int n1, n2;
        int div;
        
        //Ingreso de datos
        System.out.print ("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.print ("Ingrese el segundo numero: ");
        n2 = sc.nextInt();
        
        if (n1 < n2) {
            div = n2 / n1;
        }
        if (n2 % n1 == 0) {
            System.out.println ("El numero " + n1 + " es divisor de " + n2);
        } else {
            System.out.println ("El numero " + n1 + " no es divisor de " + n2);
        }
        if (n2 < n1) {
            div = n1 / n2;
        }
        if (n1 % n2 == 0) {
            System.out.println ("El numero " + n2 + " es divisor de " + n1);
        } else {
            System.out.println ("El numero " + n2 + " no es divisor de " + n1);
        }
    }   
}