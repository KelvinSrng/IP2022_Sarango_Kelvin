package maximocomundivisor1;

import java.util.Scanner;

public class MaximoComunDivisor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        int num1, num2;
        
        //Ingreso de datos
        System.out.println("MAXIMO COMUN DIVISOR DE DOS NUMEROS ENTEROS");
        System.out.println("            METODO EUCLIDES");
        System.out.println("===========================================");
        System.out.print("Ingrese el primer numero:");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero:");
        num2 = sc.nextInt();
        
        //Salida
        System.out.println("\nEl MCD es " + MCD(num1, num2));
    }
    
    //Funcion para devolver el MCD
    public static int MCD(int a, int b) {
        int aux;
        if ( a < b ) {
            aux = a;
            a = b;
            b = aux;
        }
        while ( a % b != 0) {
            aux = a % b;
            a = b;
            b = aux;
        }
        return b;
    }       
}