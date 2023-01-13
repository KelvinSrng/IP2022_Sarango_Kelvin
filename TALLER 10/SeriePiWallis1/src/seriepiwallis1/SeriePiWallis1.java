package seriepiwallis1;

import java.util.Scanner;

public class SeriePiWallis1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int num;
        //double total =1 ;
        double b = 1;
        
        //Ingreso de datos
        System.out.println("\tMETODO WALLIS PI");
        System.out.println ("--------------------------------");
        System.out.print ("Ingrese un numero: ");
        num = sc.nextInt();
        
        for (int i = 1;i <= num; i++) {
            b = b * (double)(( (double)(2*i) / (double)((2*i) - 1)) * (double)((double)(2*i) / (double)((2*i)+1)));
            //System.out.println(b);
            //total = total*b;
        }
        System.out.println ("\nEl resultado es " + b*2);
    } 
}