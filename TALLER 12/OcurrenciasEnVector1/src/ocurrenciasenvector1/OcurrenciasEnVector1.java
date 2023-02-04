package ocurrenciasenvector1;

import java.util.Scanner;

public class OcurrenciasEnVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int num;
        
        //Ingreso de datos
        System.out.println("\tREPETICIONES EN VECTOR");
        System.out.println("=======================================");
        System.out.print("Ingrese el tamaño del vector: ");
        num = sc.nextInt();
        int[] elemento = new int[num];
        
        for ( int i = 0; i < num ; i ++) {
            System.out.print("Ingrese el valor del elemento " + (i + 1) + ": ");
            elemento[i] = sc.nextInt();
        }
        elemento = OrdenarVector(elemento);//Invocar la funcion para ordenar el vector
        mostrarOcurrencias(elemento);
        
    }
    //Funcion para ordenar un vector
    public static int[] OrdenarVector(int x[]) {
    int aux;
    for (int lim = x.length-1; lim >= 1; lim--) {
        for (int i = 0; i <= lim - 1; i++) {
            if (x[i] > x[i+1]) {
                aux = x[i];
                x[i] = x[i+1];
                x[i+1] = aux;
            }
        }
    }
    return x;
    }
    
    //Metodo para mostrar las ocurrencias del vector
    public static void mostrarOcurrencias(int[] x) {
        int ocurrencias = 0, num = 0;
        System.out.printf("%nValor         Ocurrencias%n");
        System.out.printf("-----         -----------%n");
        for ( int i = 0; i < x.length; i ++) {
            if (ocurrencias == 0) {
                num = x[i];
                ocurrencias ++;
            }
            if (i != x.length - 1) {
                if (num != x[i + 1]) {
                    System.out.printf("%5d%20d%n", num, ocurrencias);
                    ocurrencias = 0;
                } else {
                    ocurrencias ++;
                }
            } else {
                System.out.printf("%5d%20d%n", num, ocurrencias);
            }
        }
    }

}