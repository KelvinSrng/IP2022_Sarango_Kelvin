package multiplicamatriz1;

import java.util.Scanner;

public class MultiplicaMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int n, m, val;
        
        //Ingreso de datos
        System.out.println("\tMULTIPLICAR MATRIZ POR NUMERO");
        System.out.println("============================================");
        System.out.print("Ingreso el tamaño para las filas: ");
        n = sc.nextInt();
        System.out.print("Ingreso el tamaño para las columnas: ");
        m = sc.nextInt();
        
        int[][] matriz = new int [n][m];
        int[][] matriz2 = new int [n][m];
        
        for(int i = 0; i <= n - 1; i++ ){            
            for(int j = 0; j <= n - 1; j++ ){              
                System.out.print("Ingrese el valor de la celda [" + (i + 1) + ", " + (j + 1) + "]: " );
                matriz[i][j]= sc.nextInt();                  
            }           
        }
        
        System.out.print("Ingrese el numero por el que desea multiplicar los valores de la matriz: ");
        val = sc.nextInt();
        
        for(int i = 0; i <= n - 1; i++ ){            
            for(int j = 0; j <= n - 1; j++ ){               
                matriz2[i][j] = matriz[i][j] * val;                                
            }
            
        }
        
        //Graficar Matriz
        System.out.println("\nMatriz original: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < n; j++) {
                System.out.print("+-----");
            }
        for (int j = 0; j < n; j++) {
            if (j == n - 1) {
                if (n == 1) {
                    System.out.printf("\n|%3d  |",matriz[i][j]);
                }else {
                    System.out.printf("|%3d  |",matriz[i][j]);
                }
            } else if (j == 0) {
                System.out.printf("\n|%3d  ",matriz[i][j]);
            } else {
                System.out.printf("|%3d  ",matriz[i][j]);
            }
        }
            if ( i == n -1) {
                System.out.print("\n");
                for (int j = 0; j < n; j++) {
                    System.out.print("+-----");
                }
            }
    }       
    
    //Graficar Matriz
    System.out.print("\nMatriz resultante: ");
    for (int i = 0; i < n; i++) {
        System.out.print("\n");
        for (int j = 0; j < n; j++) {
            System.out.print("+-----");
        }
        for (int j = 0; j < n; j++) {
            if (j == n - 1) {
                if (n == 1) {
                    System.out.printf("\n|%3d  |",matriz2[i][j]);
                }else {
                    System.out.printf("|%3d  |",matriz2[i][j]);
                }
            } else if (j == 0) {
                System.out.printf("\n|%3d  ",matriz2[i][j]);
            } else {
                System.out.printf("|%3d  ",matriz2[i][j]);
            }
        }
            if ( i == n -1) {
                System.out.print("\n");
                for (int j = 0; j < n; j++) {
                    System.out.print("+-----");
                }
            }
    }
    } 
}