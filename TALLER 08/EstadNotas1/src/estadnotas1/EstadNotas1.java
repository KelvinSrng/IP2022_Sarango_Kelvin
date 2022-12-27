package estadnotas1;

import java.util.Scanner;

public class EstadNotas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        byte arriba_prom, debajo_prom, numN;
        float suma, prom;
        
        //Ingreso de datos
        System.out.print ("Ingrese el numero de notas: ");
        numN = sc.nextByte();
        
        float[] matriz = new float [numN];
        
           for (byte i =0; i <= numN - 1; i++) {
            System.out.print ("Ingrese nota " + (i + 1) + ": ");
            matriz[i] = sc.nextFloat();
        }
           
           suma = 0;
           
           for (byte i =0; i <= numN - 1; i++) {
               suma = suma + matriz[i];
           }
           prom = suma / (float) (numN);
           
           debajo_prom = 0;
           arriba_prom = 0;
           
           for (byte i =0; i <= numN - 1; i++) {
               if (matriz[i] <= prom) {
                   debajo_prom++;
               } else {
                   arriba_prom++;
               }
           }
           System.out.println ("El promedio es: " + prom);
           System.out.println ("Estudiantes por arriba de la media: " + arriba_prom);
           System.out.println ("Estudiantes por debajo de la media: " + debajo_prom);
    }
    
}