package aptitudsufragar1;

import java.util.Scanner;

public class AptitudSufragar1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
                
        int nac; 
        int año_actual;
        byte edad_actual;
        
        System.out.println ("Aptitud para sufragar en Ecuador");
        System.out.println ("---------------------------------");
        System.out.print ("Ingrese su año de nacimeinto: ");
        nac = sc.nextInt ();
        System.out.print ("Ingrese el año actual: ");
        año_actual = sc.nextInt ();
        
        edad_actual = (byte) (año_actual - nac);
        if (edad_actual <16 ) {
            System.out.println ("No puede votar");
        } else if(edad_actual >= 16 && edad_actual <18){
            System.out.println ("Puede votar opcionamente");
        } else if (edad_actual >= 18 && edad_actual <65) {
            System.out.println ("El voto es obligatorio");
        } else 
            {
            System.out.println ("El voto es opcional");
            }
    }
           
} 