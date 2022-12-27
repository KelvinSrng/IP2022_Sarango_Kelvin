package sumatoriamatriz2;

import java.util.Scanner;

public class SumatoriaMatriz2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        int n, sum = 0;
        
        //Ingreso de datos
        do {
            System.out.print("Ingrese un numero para el tamaño de la matriz: ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("!POR FAVOR¡Ingrese un numero entero positivo");
            }
        } while (n < 0);
        int[][] elemetos = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                do {
                    System.out.print("Ingrese el valor para la fila " + (i + 1) + " y la columna " + (j + 1) + " de la matriz:");
                    elemetos[i][j] = sc.nextInt();
                    if (elemetos[i][j] > 99 || elemetos[i][j] < -99 ) {
                        System.out.println("!ERROR¡ INGRESE UN NUMERO MENOR");
                    }
                } while (elemetos[i][j] > 99 || elemetos[i][j] < -99 );
                if ( j > i) {
                    sum += elemetos[i][j];
                }
            }
        }
        System.out.println("La matriz que usted ingreso es la siguiente: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\n+");
            for (int j = 0; j < n; j++) {
                System.out.print("-----+");
            }
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    if (n == 1) {
                        System.out.printf("\n|%3d  |",elemetos[i][j]);
                    }else {
                        System.out.printf("|%3d  |",elemetos[i][j]);
                    }
                } else if (j == 0) {
                    System.out.printf("\n|%3d  ",elemetos[i][j]);
                } else {
                    System.out.printf("|%3d  ",elemetos[i][j]);
                }
            }
            if ( i == n -1) {
                System.out.print("\n+");
                for (int j = 0; j < n; j++) {
                    System.out.print("-----+");
                }
            }
        }
        System.out.print("\nLa sumatoria sobre la diagonal principal es: " + sum);
    } 
}