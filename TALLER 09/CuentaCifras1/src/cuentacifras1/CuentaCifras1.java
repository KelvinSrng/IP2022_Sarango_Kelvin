package cuentacifras1;

import java.util.Scanner;

public class CuentaCifras1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int num, digitos = 0;
        
        //Ingreso de datos controlado que sea positivo
        System.out.print ("Ingrese un numero entero positivo: ");
        num = sc.nextInt();
        while (num < 0) {
            System.out.print ("!POR FAVOR¡Ingrese un numero entero positivo: ");
        num = sc.nextInt();
        }
        
        //Contar cifras 
        while(num !=0) {
        num = num /10;
        digitos++;
        }
        
        //Salida
        System.out.println ("El numero que ingreso tiene "+ digitos+ " cifras. ");
    }
}