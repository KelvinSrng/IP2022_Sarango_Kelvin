package estadnumeros1;

import java.util.Scanner;

public class EstadNumeros1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        
        int num, suma, cn;
        
        System.out.print("Ingrese numeros positivos y negativos (Para terminar digite 0): ");
        
        num = 1;
        suma = 0;
        cn = 0;
        
        //Bucle
        while (num < 0 || num > 0){
            num = sc.nextInt();
            
                if (num < 0){
                    cn = cn + 1;
                   
                }
            
            suma = suma + num;
           
        }
        
        System.out.println("En total usted ingreso " + cn + " numeros negativos");
        System.out.println("La suma de los numeros ingresados es " + suma);
        
    }
}
