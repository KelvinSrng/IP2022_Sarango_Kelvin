package primo4;

import java.util.Scanner;

public class Primo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print ("Ingrese un numero a validar si es primo: ");
        num = sc.nextInt();
        
        if (primo(num)) {
            System.out.println("El numero ingresado " + num + " SI es primo");
        } else {
            System.out.println("El numero ingresado " + num + " NO es primo");
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