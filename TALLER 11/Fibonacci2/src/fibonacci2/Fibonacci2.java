package fibonacci2;

import java.util.Scanner;

public class Fibonacci2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int n, nesimo;
        
        //Ingreso de datos
        System.out.println("  OBTENER N-ESIMO FIBONACCI");
        System.out.println("==============================");
        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();
        
        nesimo = 0;
        for(int num = 0; num < n; num++){
           nesimo = Fibonacci(num);
        }
        
        //Salida
        System.out.println("\nEl elemento numero " + n + " de la serie de Fibonacci es: " + nesimo); 
    }
 
    public static int Fibonacci(int num){
           if(num == 0 || num==1)
               return num;
          else
               return Fibonacci(num - 2) + Fibonacci(num - 1);
     }
    
}