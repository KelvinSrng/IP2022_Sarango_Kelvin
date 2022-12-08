package factorial1;

import java.util.Scanner;

public class Factorial1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int n, c, factorial;
        factorial = 1;
    do {
        System.out.print ("Ingrese un numero pasitivo mayor o igual a cero: ");
        n = sc.nextInt();
        
        for (c = 1; c <=n ; c = c + 1){
            
        factorial = factorial * c;
        }
        }
    while (n < 0);
    System.out.print("Ingrese un numero positivo.");
    
    System.out.println("El factorial del numero es: " + factorial);
            
    }
}  

