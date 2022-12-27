package sumatoriamatriz1;

import java.util.Scanner;

public class SumatoriaMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int num, sum = 0;
        
        //Ingreso de datos
        do {
            System.out.print("Ingrese un numero para el tamaño de la matriz: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("!POR FAVOR¡Ingrese un numero entero positivo");
            }
            //Suma de los elementos sobre la diagonal
        } while (num < 0);
        int[][] elemetos = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
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
        //Salida
        System.out.println("La sumatoria sobre la diagonal principal es: " + sum);
    }
}