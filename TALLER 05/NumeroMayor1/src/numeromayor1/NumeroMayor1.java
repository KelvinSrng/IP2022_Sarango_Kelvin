package numeromayor1;

import java.util.Scanner;

public class NumeroMayor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        
        int nu1, nu2, nu3;
        
        //Ingreso de datos
        
        System.out.print ("Ingrese el primer numero ");
        nu1 = sc.nextInt();
        System.out.print ("Ingrese el segundo numero ");
        nu2 = sc.nextInt();
        System.out.print ("Ingrese el tercer numero ");
        nu3 = sc.nextInt();
        
        if (nu1>nu2 & nu1>nu3) {
            System.out.println ("El numero mayor es " + nu1);
        } else if (nu2>nu1 & nu2>nu3) {
            System.out.println ("El numero mayor es " + nu2);
        } else if (nu3>nu1 & nu3>nu2) {
        System.out.println ("El numero mayor es "  +  nu3);
        }
    }  
}