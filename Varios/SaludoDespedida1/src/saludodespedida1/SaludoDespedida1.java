package saludodespedida1;

import java.util.Scanner;

public class SaludoDespedida1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        System.out.print ("¿Cual es tu nombre? ");
        nombre = sc.nextLine();
        
        saludar(nombre);         //Llamada al metodo saludar
        despedir(nombre);        //Llamada al metodo despedir
    }
    //Procedimiento para saludar
    public static void saludar(String x) {
        System.out.println ("Hola " + x + " un gusto conocerte!");
    }
//Procedimiento para despedir
    public static void despedir(String x) {
        System.out.println ("Adios " + x + " hasta la proxima!");
    }
}
