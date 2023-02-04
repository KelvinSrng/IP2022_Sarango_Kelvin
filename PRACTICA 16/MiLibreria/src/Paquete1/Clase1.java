package Paquete1;

public class Clase1 {
    
    
    public static void mostrarVector(int[] x) {
        System.out.print("\nContenido del vector: [ ");
        for (int i = 0; i <= x.length - 1; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("]");
    }

    //Función que calcula la sumatoria de los elementos del vector
    public static float promedioVector(int x[]) {
        int suma = 0;
        for (int i = 0; i <= x.length - 1; i++) {
            suma += x[i];
        }
        return (float) suma / x.length;
    }

    // Función que calcula el rango de un vector
    public static int rangoVector(int[] v) {
        int menor = v[0], mayor = v[0];
        for (int i = 1; i <= v.length - 1; i++) {
            if (v[i] > mayor) {
                mayor = v[i];
            }
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        return mayor - menor;
    }
    
    // Función que determina si un número es primo
    public static boolean primo(int num) {
        boolean esPrimo;
        if (num < 2) {
            esPrimo = false;
        } else {
            int c = num / 2;
            while (num % c != 0) {
                c--;
            }
            esPrimo = c == 1; 
        }
        return esPrimo;
    }
}