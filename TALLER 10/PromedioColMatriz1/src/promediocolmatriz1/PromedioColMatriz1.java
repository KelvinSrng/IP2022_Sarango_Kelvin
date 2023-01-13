package promediocolmatriz1;

import java.util.Scanner;

public class PromedioColMatriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int numF, numC, sumU, vm;
        float promedio = 0;
        
        //Ingreso de datos
        System.out.println("\tPROMEDIO COLUMNAS EN MATRIZ");
        System.out.println("----------------------------------------------");
        System.out.print("Ingrese el numero de filas de la matriz: ");
        numF = sc.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz: ");
        numC = sc.nextInt();
        
        int matriz[][] = new int[numF][numC];
        
        //Llenado de la matriz
        System.out.println ("\nIngrese el contenido de la matriz");
        for (byte i =0; i <= numF - 1; i++) {
            for (byte j = 0; j <= numC - 1; j++) {
                System.out.print ("Elemento [" + (i+1) + "," + (j+1) + "]: ");
                matriz[i][j] = sc.nextInt();
            } 
        }
        
        sumU= 0;
        
        for (byte i = 0; i <= numC - 1; i++) {
            
            vm = matriz[0][i];
            
            for (byte j = 0; j <= numF - 1; j++) {
                
                if(matriz[j][i] < vm){
                    
                    vm = matriz[j][i];
                    
                }
                
                sumU = sumU + matriz[j][i];
                promedio = (float)((float) sumU  / (numF));
            }
            
            //System.out.println("la suma de la columna " + (i+1)+ " ES: " + sumU);
            System.out.println("\nColumna " +(i+1) + ": promedio = "+ promedio + ", valor mas bajo = " + vm);
            sumU = 0;
        }
    }
}