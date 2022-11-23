package validarorden1;

import java.util.Scanner;

public class ValidarOrden1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        
        int num1, num2, num3;
        
        //Ingreso de datos
        
        System.out.print ("Ingrese el primer numero: ");
        num1 = sc.nextInt ();
        System.out.print ("Ingrese el segundo numero: ");
        num2 = sc.nextInt ();
        System.out.print ("Ingrese el tercer numero: ");
        num3 = sc.nextInt ();
        
        //Calculo
        
        if (num1 > num2 || num2 > num3) {
        System.out.println ("Los numeros ingresados no estan en orden ascendente o estan en desorden");
    } else {
        System.out.println ("Los numeros ingresados estan en orden ascendente");
        }
    }
    
}
