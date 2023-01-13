package listanumabundantes2;

import java.util.Scanner;

public class ListaNumAbundantes2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int n, nat;

        //Ingreso de datos
        System.out.println("\tLISTA DE NUMEROS ABUNDANTES ENTRE O Y N");
        System.out.println("-------------------------------------------------------------");
        System.out.print("Ingrese hasta que numero quiere mostrar: ");
        n = sc.nextInt();

        //Proceso
        System.out.println("\nLos números abundantes entre 0 y " + n + " son: ");
        for (nat = 0; nat <= n; nat++) {
            if (validarAbundante(nat)) {
                System.out.println(nat);
            }
        }
    }
    
    //Validar si un numero Abundante
    public static boolean validarAbundante(int num) {
        //Validar si nat es abundante
        int nat = num;
        int suma_div = 0;
        for (int c = 1; c < nat; c++) {
            if (nat % c == 0) {
                suma_div += c;
            }
        }
        if (suma_div > nat) {
            return true;
        } else {
            return false;
        }
    }
}