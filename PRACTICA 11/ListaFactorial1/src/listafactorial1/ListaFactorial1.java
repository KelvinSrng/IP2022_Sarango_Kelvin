package listafactorial1;

import java.util.Scanner;

public class ListaFactorial1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, n = 2;
        
        System.out.print ("Ingrese un numero: ");
        num = sc.nextInt();
        
        System.out.println ("El factorial de los " + num + " primeros numeros pares son: ");
        for (int c = 1; c <= num; c++) {
            System.out.println(factorial(n));
            n = n + 2;
        } 
    }
    public static long factorial(int num) {
        long fact = 1;
        for (int c = 1; c <= num; c++) {
            fact *= c; 
        }
        return fact;
    }
}
