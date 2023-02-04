package paresenvector1;

import java.util.Scanner;

public class ParesEnVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracione de variables
        int num;
        
        //Ingreso de datos
        System.out.println("     Contar Pares en Vector");
        System.out.println("==================================");
        System.out.print("¿Cuantos numeros desea ingresar?: ");
        num = sc.nextInt();
        int[] elemento = new int[num];
        
        //Ingreso de datos al vector
        for ( int i = 0; i < num ; i ++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            elemento[i] = sc.nextInt();
        }
        System.out.println("\n"+ParesEnVector(elemento) + " elementos del vector son numeros pares.");
    }
    public static int ParesEnVector(int[] vector) {
        int c = 0;
        for ( int i = 0; i < vector.length; i ++) {
            if (vector[i] % 2 == 0) {
                c ++;
            }
        }
        return c;
    }

}