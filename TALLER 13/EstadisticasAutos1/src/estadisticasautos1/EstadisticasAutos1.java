package estadisticasautos1;

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;


public class EstadisticasAutos1 {

    public static void main(String[] args) {
        try {
            int c = 0;
            String[] datos;
            String[] codigos;
            ArrayList <String> letra = new ArrayList();
            ArrayList <String> provincia = new ArrayList();
            ArrayList <String> placas = new ArrayList();
            ArrayList <String> modelos = new ArrayList();
            ArrayList <String> anios = new ArrayList();
            ArrayList <String> cc = new ArrayList();
            ArrayList <String> provincias = new ArrayList();
            File archivo = new File("Data/PlacasProvincias.txt");
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                codigos = sc.nextLine().split("–");
                letra.add(codigos[0].trim());
                provincia.add(codigos[1].trim());
            }
            sc.close();
            File archivo2 = new File("Data/Autos1.txt");
            Scanner sc2 = new Scanner(archivo2);
            while (sc2.hasNextLine()) {
                c ++;
                datos = sc2.nextLine().split(";");
                if (datos[1].toUpperCase().equals("KIA")) {
                    placas.add(datos[0].toUpperCase());
                    modelos.add(datos[2]);
                    anios.add(datos[3]);
                    cc.add(datos[4]);
                    for (int i = 0; i < letra.size(); i++ ) {
                        if (placas.get(placas.size() - 1).substring(0,1).equals(letra.get(i))) {
                            if (provincia.get(i).length() > 15) {
                                provincias.add(provincia.get(i).substring(0,14));
                            } else {
                                provincias.add(provincia.get(i));
                            }
                        }
                    }
                }
            }
            sc.close();
            System.out.println("Numero de autos registrados: " + c);
            System.out.println("Listado de autos KIA registrados");
            System.out.println("Placa       Provincia         Modelo            Año       Cilindraje ");
            System.out.println("---------   ---------------   ---------------   --------  -----------");
            for (int i = 0; i <= placas.size(); i++) {
                System.out.printf("%-12s%-18s%-18s%-10s%-11s%n", placas.get(i), provincias.get(i), modelos.get(i), anios.get(i), cc.get(i));
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}