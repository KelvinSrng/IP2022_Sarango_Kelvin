package venta2;

import java.util.Scanner;

public class Venta2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        int m, n, suma_m, c;
        float resultado;
        
        suma_m = 0;
        c = 1;
        
        //Ingreso de datos
        System.out.println("CALCULAR EL  COSTO DE N ARTICULOS");
        System.out.print("Ingrese el numero de articulos: ");
        n = sc.nextInt();
                
        //Bucle      
        while (c <= n){
            System.out.print("Ingrese costo: ");
            m = sc.nextInt();
            suma_m = suma_m + m;
            c = c + 1; 
        }
        resultado = (float) (suma_m + (suma_m * 0.12));
        
        System.out.println("El precio total mas IVA es: " + resultado);
    }
}