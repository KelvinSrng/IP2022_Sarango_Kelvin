package decimalabinario3;

import java.util.Scanner;

public class DecimalABinario3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        int num;
        
        //Ingreso de datos
        System.out.println("\tCONVERTIR DECIMAL A BINARIO");
        System.out.println("==========================================");
        System.out.print("Ingrese un numero entero: ");
        num = sc.nextInt();
        System.out.print("\nEl numero " +num + " convertido a binario es : " );
        decimalAbinario(num);
        
    }
    public static void decimalAbinario(int n) {
        if (n < 2) {
            System.out.print("1");
        } else {
            decimalAbinario(n / 2);
            System.out.print(n % 2);
        }
    }
}
