package busquedarepetidos1;

import java.util.Scanner;

public class BusquedaRepetidos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        byte n, rep;
        
        //Ingreso de datos
        System.out.print("Ingrese el numero de valores que tendra el vector: ");
        n = sc.nextByte();
        int[] lista = new int[n];
        
        for ( byte i = 0; i <= n - 1; i++){
            System.out.print("Ingrese elemento "+(i+1)+": ");
            lista[i] = sc.nextInt();  
        }
        // Contador de repeticion
        rep = 0;
        for ( byte i = 0; i <= n - 1; i++){
            if(lista[n-1] == lista[i]) {
                rep = (byte)(rep + 1); 
            }  
        }
    
    // Salida y posicion en donde se repite
    System.out.print("El ultimo elemento " +lista[n-1]+ ", se repite "+rep+" veces en las pociciones: ");  
    for ( byte i = 0; i <= n - 1; i++){
        if(lista[n-1] == lista[i]) {
            System.out.print( (i+1) + " ");  
        }  
    }
    } 
}