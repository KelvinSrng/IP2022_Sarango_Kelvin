package listanumprimos2;

import java.util.Scanner;

public class ListaNumPrimos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, c;
        
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();
        c = 0;
        
      while (c <= num) {
           if (primo(c)== true) {
                   System.out.println (" " + c);
           } 
           c++;
       }
    }
        //Funcion par validar si un numero es primo
    //recibe el numero a validar y devuelve true o false
    public static boolean primo(int num) {
        int c;
        boolean esPrimo = false;
        if (num >= 2) {
            c = num - 1;
            while (num % c != 0) {
                c--;
            }
            if (c == 1) {
                esPrimo = true;
            }
        }
        return esPrimo;
    }
}
