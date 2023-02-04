package personas4;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Personas4 {

    public static void main(String[] args) {
        try {
            String[] datos;
            ArrayList <String> nombres = new ArrayList();
            ArrayList <Byte> edades = new ArrayList();
            File archivo = new File("DATA/Personas.txt");
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                datos = sc.nextLine().split(",");
                if (Byte.parseByte(datos[2]) > 50) {
                    nombres.add(datos[0]);
                    edades.add(Byte.parseByte(datos[2]));
                }
            }
            System.out.println("Listado personas de más de 50 años");
            System.out.println("Nombre               Edad");
            System.out.println("------------------   ----");
            for (byte i = 0; i < nombres.size(); i ++) {
                System.out.printf("%-21s%d%n", nombres.get(i), edades.get(i));
            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }
    
}