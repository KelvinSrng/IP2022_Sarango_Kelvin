package ciudades1;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ciudades1 {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter ("data/cuidades.txt" ,true);
            PrintWriter pw = new PrintWriter(fw);
            Scanner sc = new Scanner(System.in);
            
            short n;
            String ciudad, pais;
            int poblacion;
            
            System.out.print("¿Cuantas ciudades va a ingresar? ");
            n = sc.nextShort();
            sc.nextLine();
            
            
            
            for(short c = 1; c <= n; c++) {
                System.out.println("Ingrese los datos de la ciudad " + c + ": ");
                System.out.print("Nombre de la ciudad:  ");
                ciudad = sc.nextLine();
                System.out.print("Poblacion:  ");
                poblacion = sc.nextInt();
                sc.nextLine();
                System.out.print("País:  ");
                pais = sc.nextLine();
                
                
                pw.println(ciudad + "-" + poblacion + "-" + pais);
            }
            
            
            pw.close();
            
        }catch (Exception e) {
            System.err.println("ERORR: " + e.getMessage());
        }
    }
    
}
