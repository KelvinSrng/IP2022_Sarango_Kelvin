
package saludo3;

import java.util.Scanner;

public class Saludo3 {
   public static void main(String[] args) {
       
       Scanner Im = new Scanner (System.in);
       String nombre;
       
       System.out.println ("¿Cual es su nombre?: ");
       nombre = Im.nextLine();
       
       System.out.println("Hola " + nombre + " un gusto saludarte");
   }
}
    
           