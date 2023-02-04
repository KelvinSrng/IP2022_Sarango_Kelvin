package maximocomundivisor2;

import java.util.Scanner;

public class MaximoComunDivisor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        int  num1, num2, aux;
        
        //Ingreso de datos
        System.out.println("MAXIMO COMUN DIVISOR DE DOS NUMEROS ENTEROS");
        System.out.println("            METODO EUCLIDES");
        System.out.println("===========================================");
        System.out.print("Ingrese el primer numero:");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero:");
        num2 = sc.nextInt();
        if ( num1 < num2 ) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        //Salida
        System.out.println("\nEl MCD es " + MCD(num1, num2));
    }

    public static int MCD(int a, int b) {
        if ( a % b == 0 ) {
            return b;
        } else {
            return MCD(b, a%b);
        } 
    }
}