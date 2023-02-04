package personas5;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;

public class Personas5 {

    public static void main(String[] args) {
        try {
            File archivo = new File("Data/Personas.txt");
            Scanner sc = new Scanner(archivo);
            String[] persona;
            ArrayList<String> nombres = new ArrayList();
            ArrayList<String> generos = new ArrayList();
            ArrayList<Integer> edades = new ArrayList();
            if (!sc.hasNextLine()){
                throw new Exception("Archivo vacio");
            }
            while (sc.hasNextLine()) {
                persona = sc.nextLine().split(",");
                if ( Integer.parseInt(persona[2]) < 0) {
                   throw new Exception("Edad negativa");
                }
                nombres.add(persona[0]);
                generos.add(persona[1]);
                edades.add(Integer.parseInt(persona[2]));
            }
            sc.close();
            int suma = 0, cf = 0;
            for (int i = 0; i <= edades.size() - 1; i++) {
                if (generos.get(i).equals("F")) {
                    suma += edades.get(i);
                    cf++;
                }
            }
            double media = (double) suma / cf;
            System.out.println("   EDAD PROMEDIO DE MUJERES");
            System.out.println("================================");
            System.out.println("La edad promedio es: " + media);
        } catch (FileNotFoundException e) {
            System.out.println("\nERROR! archivo no encontrado ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERROR! datos incompletos ");
        } catch (NumberFormatException e) {
            System.out.println("\nERROR formato de datos incorrectos! " + e.toString());
        } catch (Exception e) {
            System.out.println("\nERROR! " + e.getMessage());
        } 
    }
}