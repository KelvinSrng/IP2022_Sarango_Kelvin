package sumarvectors1;

import java.util.Arrays;
import java.util.Scanner;

public class SumarVectors1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int num;
        
        //Ingreso de datos
        System.out.println("\t  SUMA DE VECTORES");
        System.out.println("==========================================");
        System.out.print("Ingrese en tamaño para los vectores: ");
        num = sc.nextInt();
        int[] vector1 = new int [num];
	int[] vector2 = new int [num];
			
        
       //Ingreso de valores al vector
       System.out.println("\n\tVECTOR A");
       System.out.println("========================");
       for (int i = 0; i < num; i++) {
           System.out.print("Ingrese el valor "+(i+1)+": ");
           vector1[i] = sc.nextInt();
        }
       System.out.println("\n\tVECTOR B");
       System.out.println("========================");
       for (int j = 0; j < num; j++) {
           System.out.print("Ingrese el valor "+(j+1)+": ");
           vector2[j] = sc.nextInt();
        }
        System.out.println("\nLa suma de los vectores A y B es: "+Arrays.toString(sum(vector1,vector2)));
       
    }
    
    public static int[] sum(int[] v1, int[] v2){
        int[] result = new int [v1.length];
 
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] + v2[i];
        }
        return result;
    }
 }