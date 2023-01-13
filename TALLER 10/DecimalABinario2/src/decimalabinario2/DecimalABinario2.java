package decimalabinario2;

import java.util.Scanner;

public class DecimalABinario2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
                int num;

        //Titulo del programa
        System.out.println("\tCONVERTIR DECIMAL A BINARIO");
        System.out.println("--------------------------------------------------");

        // Pedimos el número entero positivo a convertir
        do {
            System.out.print("Ingrese un número entero positivo: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println();
                System.out.println("¡ERROR!POR FAVOR INGRESE UN NUMERO POSITIVO: ");
                System.out.println();
            }
        } while(num < 0);
        sc.close();

        //Llamada a la funcion y Salida de Datos
        System.out.println("\nEl número " + num + " representado en binario es " + convertidor(num));
    }

    public static String convertidor(int num) {
        //Declaracion de Variables
        int n = num;
        int resto;
        StringBuilder binario = new StringBuilder();
        //Proceso
        while (n > 0) {
            // Calculamos el resto de la división de n entre 2
            resto = n % 2;
            // Agregamos el resto a la cadena binario
            binario.insert(0, resto);
            // Dividimos n entre 2
            n = n / 2;
        }
        return binario.toString();
    }
}