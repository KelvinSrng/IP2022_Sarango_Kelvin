package rangovector1;

import java.util.Scanner;

public class RangoVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int tmn;
        float d;
        
        
        //Ingreso de datos
        System.out.print ("Ingrese el tamanio para el vector: ");
        tmn = sc.nextInt();
        
        float vector[] = new float [tmn];
        
        for (int i = 0;i <= tmn - 1;i++) {
            System.out.println("Ingrese el valor " + (i + 1) + ": ");
            vector[i] = sc.nextFloat();
        }
        d = MayorEnVector (vector)- MenorEnVector(vector);
        System.out.println("La distancia es: " + d);
    }
 //Subproceso
            public static float MayorEnVector(float[] x) {
            float mayor = x[0];
            for (int i = 1; i <= x.length-1; i++) {
                if (x[i] > mayor) {
                    mayor = x[i];
                }
            }
            return mayor;
        }
            public static float MenorEnVector(float[] x) {
            float menor = x[0];
            for (int i = 1; i <= x.length-1; i++) {
                if (x[i] < menor) {
                    menor = x[i];
                }
            }
            return menor;
        }
}