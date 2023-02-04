package muestraprimos1;

import java.util.Scanner;

public class MuestraPrimos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        int num, m = 0;
        
        //Ingreso de datos
        System.out.println("\tMOSTRAR PRIMOS DE VECTOR");
        System.out.println("=============================================");
        System.out.print("¿Cuantos numeros desea ingresar?: ");
        num = sc.nextInt();
        int [] elementos = new int[num];
        
        for ( int i = 0; i < num; i ++) {
           System.out.print("Ingrese el valor "+ (i + 1) + ": ");
           elementos[i] = sc.nextInt();
        }
        ordenarVector(elementos);
        System.out.println("\nLos numeros primos encontrados en el vector son: ");
        for ( int i = 0; i < num; i ++) {
           if (primo (elementos[i]) && elementos[i] != m) {
               System.out.println(elementos[i]);
               m = elementos[i];
           }
        }
    }
    //Funcion para ordenar un vector
    public static int[] ordenarVector(int[] x) {
        int aux, c = x.length - 1;
        while (c >= 1) {
            for (int i = 0; i < c; i++) {
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
            c--;
        }
        return x;
    }
    //Funcion para primo
    public static boolean primo(int num){
        boolean esPrimo = false; 
        int c;
        if (num >= 2) {
            c = num - 1;
            while ( num % c != 0) {
                c = c - 1;
            }
            if (c == 1 ) {
                esPrimo = true;
            }
        }
        return esPrimo;
    }
}