package provincias3;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Provincias3 {

    public static void main(String[] args) {
        
         try {
            File archivo = new File("DATA/Provincias.txt");
            Scanner sc = new Scanner(archivo);
            String provincia[];
            int suma=0;
            float media;
            
            ArrayList<String> nomprov = new ArrayList();
            ArrayList<Byte> canprov = new ArrayList();
            
            while (sc.hasNextLine()) {
                provincia = sc.nextLine().split(",");
                //System.out.println("¡Viva " + provincia[0] + "! y sus " + provincia[1] + " cantones." );
                nomprov.add(provincia[0]);
                canprov.add(Byte.parseByte(provincia[1]));
            }
            sc.close();
            
            for (int i = 0;i <= nomprov.size()-1 ;i++) {
                System.out.println("¡Viva " + nomprov.get(i) + "! y sus " + canprov.get(i) + " cantones." );
                suma += canprov.get(i);
            }
                media = (float)((float)suma / nomprov.size());
                System.out.printf("\nEn promedio son %.1f cantones por provincia%n " , media);
        } catch (Exception e) {
            System.err.println("¡ERROR!: "+ e.getMessage());
        }
    }
    
}
