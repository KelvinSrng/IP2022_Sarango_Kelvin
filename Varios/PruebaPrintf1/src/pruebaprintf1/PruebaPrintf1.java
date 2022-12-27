
package pruebaprintf1;

import java.util.Scanner;

public class PruebaPrintf1 {

    public static void main(String[] args) {
        short n1 = 2656;                   //Numero de empleados
        double n2 = 25963.787435354;       //Sueldo anua promedio
        float n3 = (float) 957.325168;     //Sueldo mensual promedio
        
        //Mostrar SIN formato
        System.out.println ("ESTADISTICAS EXPRESA XYZ");
        System.out.println ("========================");
        System.out.println ("Total de empleados: " + n1);
        System.out.println ("Sueldo anual promedio: " + n2);
        System.out.println ("Sueldo mensual promedio: " + n3 );
        System.out.println ("");
        
        //Mostrar CON formato
        System.out.printf ("ESTADISTICAS EXPRESA XYZ%n");
        System.out.printf ("========================\n");
        System.out.printf ("total de empleados:      %,7d%n" , n1);
        System.out.printf ("Sueldo anual promedio:   %,10.2f%n" , n2 );
        System.out.printf ("Sueldo mensual promedio: %,10.2f%n%n" , n3 );
        
        String art1 = "Refrigeradora Indurama";
        String art2 = "Laptop Linux AS851";
        float pre1 = (float) 876.99;
        float pre2 = (float) 1257.49;
        
        System.out.println ("+----------------------------------------+");
        System.out.printf ("| %-25s | $%,10.2f|%n", art1, pre1);
        System.out.printf ("| %-25s | $%,10.2f|%n", art2, pre2);
        System.out.println ("+----------------------------------------+");
    }
    
}
