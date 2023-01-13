package ordenarnumeros1;

import java.util.Scanner;

public class OrdenarNumeros1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de Variables
        int tmn, aux;

        //Ingreso de datos
        System.out.println("\tORDENAR NUMEROS DE MENOR A MAYOR");
        System.out.println("---------------------------------------------");
        System.out.print("¿Cuantos numeros desea ingresar?: ");
        tmn = sc.nextInt();
        
        int [] lista_numeros = new int[tmn];

        //Llenado del vector
        for (int i = 0; i < tmn; i++) {
            System.out.print("Ingrese el numero "+ (i+1) + ": ");
            lista_numeros[i] = sc.nextInt();
        }

        //Ordenar numeros de menor a mayor
        for (int i = 0; i < tmn; i++) {
            for (int j = i + 1; j < tmn; j++) {
                if (lista_numeros[i] > lista_numeros[j]) {
                    aux = lista_numeros[i];
                    lista_numeros[i] = lista_numeros[j];
                    lista_numeros[j] = aux;
                }
            }
        }

        //Salida
        System.out.println("\nEl vector rodenado es: ");
        for (int i = 0; i < tmn; i++) {
            System.out.println(lista_numeros[i]);
        }
    }
    
}
