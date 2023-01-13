package paresimpares1;

import java.util.Scanner;

public class ParesImpares1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        int n,c_p,c_im;
        float prc_par,prc_imp;
        
        System.out.print ("¿Cuantos numeros desea ingresar? ");
        n = sc.nextInt();
        
        int prc_n[] = new int[n];
        
        for (int i = 0; i <= n - 1; i++) {
            System.out.print ("Ingrese el numero " + (i + 1)+ ": ");
            prc_n[i] = sc.nextInt();
        }
        c_p = 0;
        c_im = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (prc_n[i] % 2 == 0) {
                c_p = (short) (c_p + 1);
            } else {
                c_im = (short) (c_im + 1);
            }
        }
        prc_par = (float)c_p/n * 100;
        prc_imp = (float)c_im / n * 100;
        
        System.out.println ("\nEl " + prc_par + "% de los numeros son pares y el " + prc_imp + "% son impares");
    }
    
}