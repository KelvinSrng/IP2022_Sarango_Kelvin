package numeroperfecto1;

import java.util.Scanner;

public class NumeroPerfecto1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        
        int n;
        int c;
        int num_p;
        
        c = 2;
        num_p = 0;
        
        //Ingreso de datos
        System.out.print("Escribe n numero: ");
        n = sc.nextInt();
        
        //Bucle
        while (c <= 0){
            if (n % c == 0){
                num_p = num_p +(n / c);  
            }
            c = c + 1;
        }
        if (num_p == n){
            System.out.println("El numero es perfecto");
        } else {
            System.out.println("El numero no es perfecto");
        }

    }
}