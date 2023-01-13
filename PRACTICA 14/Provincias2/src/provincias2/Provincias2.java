package provincias2;

import java.io.File;
import java.util.Scanner;

public class Provincias2 {

    public static void main(String[] args) {
        try {
            File archivo = new File("DATA/Provincias.txt");
            Scanner sc = new Scanner(archivo);
            String provincia[];
            
            while (sc.hasNextLine()) {
                provincia = sc.nextLine().split(",");
                System.out.println("¡Viva " + provincia[0] + "! y sus " + provincia[1] + " cantones." );
            }
            sc.close();
        } catch (Exception e) {
            System.err.println("¡ERROR!: "+ e.getMessage());
        }
        
    }
    
}