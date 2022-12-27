package negativosenmatriz1;

import java.util.Scanner;

public class NegativosEnMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        byte numFil, numCol;
        short cneg;
        
        //Definicion o creacino de la matriz
        System.out.print ("Ingrese el numero de filas de la matriz: ");
        numFil = sc.nextByte();
        System.out.print ("Ingrese el numero de columnas de la matriz: ");
        numCol = sc.nextByte();
        
        short[][] matriz = new short [numFil][numCol];
        
        //Llenado de la matriz
        System.out.println ("Ingrese el contenido de la matriz");
        for (byte i =0; i <= numFil - 1; i++) {
            for (byte j = 0; j <= numCol - 1; j++) {
                System.out.print ("Elemento [" + (i+1) + "," + (j+1) + "]: ");
                matriz[i][j] = sc.nextShort();
        } 
            }
        
        //Conteo y conversion de negativos
        cneg = 0;
        for (byte i = 0; i <= numFil - 1; i++) {
            for (byte j = 0; j <= numCol - 1; j++) {
                if (matriz [i][j] < 0) {
                    cneg++;
                    matriz[i][j] = (short)(matriz[i][j] * (-1));
                }
            }
        }
        
        //Salida de datos
        System.out.println ("\nSe encontraron " + cneg + " elementos negativos");
        System.out.println("La matriz convertida es:");
        for (byte i =0; i <= numFil - 1; i++) {
            for (byte j = 0; j <= numCol - 1; j++) {
                System.out.println ("Elemento [" + (i+1) + "," + (j+1) + "]: " + matriz[i][j]);
            }
        } 
    }
    
}
