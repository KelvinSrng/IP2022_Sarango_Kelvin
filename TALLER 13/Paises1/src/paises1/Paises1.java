package paises1;

import java.io.File;
import java.util.Scanner;

public class Paises1 {

    public static void main(String[] args) {
        try {
            String[] datos;
            String nombre = "", codigo = "";
            float densidad = 0;
            File archivo = new File("Data/Paises.txt");
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                datos = sc.nextLine().split(":");
                if (!datos[0].equals("Nombre País")) {
                    if ((Integer.parseInt(datos[2]) / Float.parseFloat(datos[3])) > densidad) {
                        nombre = datos[0];
                        codigo = datos[1];
                        densidad = (float) Integer.parseInt(datos[2]) / Float.parseFloat(datos[3]);
                    }
                }
            }
            System.out.println("\tPAIS MAS DENSAMENTE POBLADO");
            System.out.println("==================================================");
            System.out.print("\nEl pais con la densidad mas alta es: ");
            System.out.println(nombre + " (" + codigo + ") \nCon una densidad poblacional de: " + densidad + " habitantes por km/2");
        } catch (Exception e) {
            System.err.println(e);
        }

    }

}