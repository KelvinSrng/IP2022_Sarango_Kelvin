package listanumabundantes1;

import java.util.Scanner;

public class ListaNumAbundantes1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracionde variables
         int n, c, suma, num,i;
        
        num = 0;
        suma = 0;
        
        //Ingreso de datos 
        System.out.print ("Ingrese un numero: ");
        n = sc.nextInt();
        
        for (c = 1; c <= n; c++){
            num = num + 1;
            
            suma = 0;
            
            for (i = 1; i < num-1; i++){
                if (num % i == 0){
                    suma = suma + i;
                }
            }
            if (suma > num){
                System.out.println("Los numeros abundantes entre 0 y " + n + " son: " + num);
            }
        }
    }
}