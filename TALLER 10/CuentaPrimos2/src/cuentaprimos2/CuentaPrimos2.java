package cuentaprimos2;

import java.util.Scanner;

public class CuentaPrimos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        byte tmn, contador;
        int p;

        System.out.println("\t\tCONTADOR DE PRIMOS");
        System.out.println("-------------------------------------------------");
        System.out.print("Ingrese la cantidad de numeros a digitar: ");
        tmn = sc.nextByte();

        //Crear vector
        int [] lista_numeros = new int[tmn];

        //Llenado del vector
        for (int i = 0; i <= tmn -1; i++) {
            System.out.print("Ingrese el numero " + (i+1) + ": ");
            lista_numeros[i] = sc.nextInt();
        }
        
        contador = 0;
        for (int i = 0; i < tmn; i++) {
            p = lista_numeros[i];
            if (primo(p)) { //Invocacion a la funcion
                contador++;
            }
        }

        //Salida
        System.out.println("\nDe los elementos ingresados " + contador + " son primos");
    }
    
    public static boolean primo(int num) {
        int c;
        boolean esPrimo = false;
        if (num >= 2) {
            c = num - 1;
            while (num % c != 0) {
                c--;
            }
            if (c == 1) {
                esPrimo = true;
            }
        }
        return esPrimo;
    }   
}