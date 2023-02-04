package seriediferenciaprimos1;

import java.util.Scanner;

public class SerieDiferenciaPrimos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
                int n, num, c, nm, nme,res;
        
        //Entrada de datos
        System.out.println("SUCESION NUMERICA DIFERENCIA ENTRE NUMEROS PRIMOS");
        System.out.println("=================================================");
        System.out.print("¿Cuantos numeros de la serie desea ver?: ");
        n = sc.nextInt();
        
        c = 1;
        num = 2;
        nm = 0;
        nme = 2;
        while(c <= n+1){
            if(primo(num) == true){
                c = c + 1;   
                nm = num ; 
            }else{ 
            }
           res = nm - nme;
           if (res > 0 ){
           System.out.print(res+", ");
           }
        num = num + 1; 
        nme = nm;
        }
    }
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