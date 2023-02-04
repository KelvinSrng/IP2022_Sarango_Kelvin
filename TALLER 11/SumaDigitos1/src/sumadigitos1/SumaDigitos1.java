package sumadigitos1;

import java.util.Scanner;

public class SumaDigitos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int num;
        
        //Ingreso de datos
        System.out.println("  SUMA DE DIGITOS DE UN NUMERO");
        System.out.println("================================");
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        System.out.println("\nLa suma de los dígitos del número " + num + " es: "+ sumaDigitos(num));
    }
     
    public static int sumaDigitos(int num){
        if(num==0){
            return 0;
        } else {
            return sumaDigitos(num/10) + num%10;
        }
    }
}