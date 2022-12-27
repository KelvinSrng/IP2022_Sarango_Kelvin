package listacuadradosperfectos1;

import java.util.Scanner;

public class ListaCuadradosPerfectos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int num1, num2, cuadperf, c;
        
        //Ingreso de datos
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        while (num1 < 0) {
        System.out.print ("!POR FAVOR¡Ingrese un numero entero positivo: ");
        num1 = sc.nextInt();
        }
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        while (num2 < 0) {
        System.out.print ("!POR FAVOR¡Ingrese un numero entero positivo: ");
        num2 = sc.nextInt();
        }
        
        c = 1;
        while (c <= num2){
            cuadperf = c * c;
            if (cuadperf >= num1 && cuadperf <= num2) {
                System.out.println(cuadperf);
            }
            c = c + 1;
        }
    }
    
}