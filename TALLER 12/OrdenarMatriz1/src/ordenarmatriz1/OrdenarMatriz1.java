package ordenarmatriz1;

import java.util.Scanner;

public class OrdenarMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        int n, m, c = 0;
        
        //Ingreso de datos
        System.out.println("\t\tORDENAR MATRIZ");
        System.out.println("==============================================");
        System.out.print("Ingrese el numero de filas para la matriz: "); 
        n = sc.nextInt();
        System.out.print("Ingrese el numero de columnas para la matriz: "); 
        m = sc.nextInt();
        int[][] elementos = new int[n][m]; int[] vector = new int[n * m];
        
        //Llenado de la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese el valor del elemento [ " + (i + 1) + ", " + (j + 1) + " ]: "); 
                elementos[i][j] = sc.nextInt();
                vector[c] = elementos[i][j];
                c ++;
            }
        }
        vector = OrdenarVector(vector); //Invocar la funcion para ordenar el vector
        c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                elementos[i][j] = vector[c];
                c ++;
            }
        }
        System.out.println("\n     MATRIZ ORDENADA ");
        MostrarMatriz(elementos);
    }
    //Mostrar matriz
    public static void MostrarMatriz(int [][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("+-----");
            }
            System.out.print("+\n");
            for (int j = 0; j < matriz[0].length; j ++) {
                System.out.printf("|%3d  ",matriz[i][j]);
            }   
            System.out.print("|\n");
        }
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print("+-----");
        }
        System.out.print("+\n");

        
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
}