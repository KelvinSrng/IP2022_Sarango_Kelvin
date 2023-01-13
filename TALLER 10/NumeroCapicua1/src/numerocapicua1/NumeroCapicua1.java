package numerocapicua1;

import java.util.Scanner;

public class NumeroCapicua1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int num, inverso = 0, aux, cf;
        
        //Ingreso de datos
        System.out.println("VERIFICAR SI EL NUMERO ES CAPICUA");
        System.out.println ("--------------------------------");
        System.out.print ("Ingrese un numero: ");
        num = sc.nextInt();
        
        aux = num;
        
        while (aux  != 0) {
            cf = aux % 10;
            inverso = inverso * 10 + cf;
            aux = aux / 10;
        }
        if (num == inverso) {
            System.out.println("\nEl numero " + num + " SI es capicua."); //Salidda
        }else {
            System.out.println("\nEl numero " + num + " NO es capicua."); //Salida
        }
    }
}