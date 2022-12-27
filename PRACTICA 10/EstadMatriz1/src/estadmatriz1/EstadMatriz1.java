package estadmatriz1;

import java.util.Scanner;

public class EstadMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        float prom_p, prom_im, prom_g;
        byte numFil, numCol;
        int pares,impares,sump, sumImp, num_datos, sumU;
        
        //Definicion o creacion de la matriz
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
        
        sumU = 0;
        impares = 0;
        pares = 0;
        sump = 0;
        sumImp = 0;
        
        for (byte i = 0; i <= numFil - 1; i++) {
            for (byte j = 0; j <= numCol - 1; j++) {
                if (matriz [i][j] % 2 == 0) {
                    pares ++;
                    sump = sump + matriz[i][j];
                } else {
                    impares ++;
                    sumImp = sumImp + matriz[i][j];
                }
            }
        }
        for (byte i = 0; i <= numFil - 1; i++) {
            sumU = sumU + matriz[i][numCol-1];
        }
        prom_p = (float) (sump) / pares;
        prom_im = (float) (sumImp)/ impares;
        num_datos = pares + impares;
        prom_g = (float) (sump + sumImp) / num_datos;
        
        //Salida de datos
        System.out.println ("Son" + pares +"impares" + impares +"asd "+ sump +" " + sumImp);
        System.out.println ("Promedio pares: " + prom_p);
        System.out.println ("Promedio impares: " + prom_im);
        System.out.println ("Promedio general: " + prom_g);
        System.out.println ("Sumatoria ultima columna: " + sumU);
    }
    
}
