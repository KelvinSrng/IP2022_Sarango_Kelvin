package ordenarnumeros3;

import java.util.Scanner;

public class OrdenarNumeros3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        int num;
        
        //Ingreso de datos
        System.out.println("\t  ORDENAR VECTOR");
        System.out.println("=============================================");
        System.out.print("¿Cuantos numeros desea ingresar?: ");
        num = sc.nextInt();
        
        int[] vector = new int[num];
        
        for (int i = 0; i < num; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        //Salida
        System.out.println("\nEl vector ordenado es:");
        System.out.print("[");
        vector = ordenarVector(vector, num - 1);
        for (int i = 0; i < num; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.print("]");
    }
    //Funcion para ordenar vector con recursividad
    public static int[] ordenarVector(int[] x, int posicion) {
        int mayor = 0, aux, index = 0;
        for (int i = 0; i <= posicion; i++) {
            if (i == 0 || x[i] > mayor) {
                mayor = x[i];
                index = i;
            }
        }
        aux = x[posicion];
        x[posicion] = mayor;
        x[index] = aux;
        if (posicion == 1) {
            return x;
        } else {
            return ordenarVector(x, posicion - 1);
        }
    }

}