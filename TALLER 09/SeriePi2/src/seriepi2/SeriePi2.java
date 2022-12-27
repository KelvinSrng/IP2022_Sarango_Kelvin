package seriepi2;

import java.util.Scanner;

public class SeriePi2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        int n, c;
        double pi, elemento ,i ;
        
        //Ingreso de datos
        System.out.print("Ingrese un numero para obtener el valor de Pi: ");
        n = sc.nextInt();
     
         pi = 3;
         c = 1;
         //Obtener Pi
        for(i = 2; c < n; i = i + 2) {
            elemento = (double)4 / (i * (i + 1) * (i + 2));
            if ((c + 1) % 2 != 0){
            elemento = elemento * (-1);
            }
            pi = pi + elemento;
            c = c+1;
        }
        //Salida
        System.out.println("El resultado es: " + pi);
    }
}