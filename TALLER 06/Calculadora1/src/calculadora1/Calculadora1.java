package calculadora1;

import java.util.Scanner;

public class Calculadora1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //Asignacion de variables
        int n_1;
        int n_2;
        int operacion;
        int total;
        float tot_div;

        //Ingreso de datos
        System.out.println ("        Calculadora Simple");
        System.out.print ("\nIngrese el primer valor a operar: ");
        n_1 = sc.nextInt();
        System.out.print ("Ingrese el segundo valor a operar: ");
        n_2 = sc.nextInt();
        System.out.println ("Seleccione la operacion que desea hacer: ");
        System.out.println ("1) Sumar ( + ) ");
        System.out.println ("2) Restar ( - ) ");
        System.out.println ("3) Producto ( * ) ");
        System.out.println ("4) Cociente ( / )");
        System.out.println ("5) Residuo ( % ) ");
        operacion = sc.nextInt();

        //Dependiendo de
        switch (operacion){
            case 1:
                total = n_1 + n_2;
                System.out.println ("El resultado al sumar los valores es: " + total);
                break;
            case 2:
                total = n_1 - n_2;
                System.out.println ("El resultado al restar los valores es: " + total);
                break;
            case 3:
                total = n_1 * n_2;
                System.out.println ("El producto es de: " + total);
                break;
            case 4:
                tot_div = ( (float) n_1 / (float) n_2);
                System.out.println ("El cociente de los valores es de: " + tot_div);
                break;
            case 5:
                total = n_1 % n_2;
                System.out.println ("El residuo entre los valores es: " + total);
                break;
            default:
                System.out.println ("\nOpcion incorrecta!");
        }
    }
}