package maximocomundivisor3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaximoComunDivisor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int  a, b;
        
        //Ingreso de datos
        System.out.println("   MAXIMO COMUN DIVISOR");
        System.out.println("==========================");
        
        do { 
        System.out.print("Ingrese el primer numero:");
        a = sc.nextInt();
        sc.nextLine();
        }while (Positivo(a)  == false); 
        do{
        System.out.print("Ingrese el segundo numero:");
        b = sc.nextInt();
        }while (Positivo(b) == false);
        System.out.println("\nEl mcd es: " + MCD(a,b) ); 
    }
                 
    public static boolean Positivo(int n){
        int i = n;
        Scanner sc = new Scanner(System.in); 
        boolean datovalido = false; 
        
            try {
                
           if (i < 0) {
    
            throw new Exception ("Debe ingresar un entero positivo!");
                }
                datovalido = true;
            } catch (InputMismatchException error) {
                System.err.println("ERROR: Debe ingresar un número entero!");
                sc.nextLine();
            } catch (Exception error) {
                System.err.println("ERROR: " + error.getMessage());
            }
        return datovalido; 
    
    }
    public static int MCD(int a, int b){
        
           if ( a % b == 0 ) {
            return b;
        } else {
            return MCD(b, a%b);

           }
           
    }
    
}