package invertirvector1;

import java.util.Scanner;

public class InvertirVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int num,i ,aux;
        
        //Ingreso de datos
        System.out.println("\tINVERTIR VECTOR");
        System.out.println("======================================");
        System.out.print("Ingrese el tamaño del vector: ");
        num = sc.nextInt();
        int[] numeros = new int[num];
       
        for (i=0; i<num;i++){
            System.out.print("Ingrese el numero " + (i+1) + ": ");
            numeros[i]= sc.nextInt();
        }
        
        for (i=0; i<num/2; i++) {
            aux = numeros[i];
            numeros[i] = numeros[num-1-i];
            numeros[num-1-i] = aux;
        }
        System.out.print("\nEl vector invertido es");
        mostrar(numeros);
    }
    public static void mostrar(int[] vector){
        String matriz = " ";
        for (int i = 0; i < vector.length; i++) {
            matriz += vector[i] + ", ";
        }
        matriz = matriz.substring(0, matriz.length()-2);
        System.out.println(matriz);
    }
    
}