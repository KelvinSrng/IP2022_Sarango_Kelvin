package guardarautos1;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;

public class GuardarAutos1 {

    public static void main(String[] args) {
        try {
            String placa, marca, modelo, anio, litros;
            int num;
            Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter("Data/Autos1.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            System.out.println("\tALMACENAJE DE LOS DATOS DE UN AUTO");
            System.out.println("==================================================");
            System.out.print("¿De cuantos autos desea almacenar los datos?: ");
            num = sc.nextInt();
            sc.nextLine();
            for ( byte i = 0; i < num; i ++) {
                System.out.println("\n\tAuto " + (i + 1));
                System.out.print("Ingrese la placa del automovil: "); placa = sc.nextLine();
                System.out.print("Ingrese la marca del automovil: "); marca = sc.nextLine();
                System.out.print("Ingrese el modelo del automovil: "); modelo = sc.nextLine();
                System.out.print("Ingrese el año del automovil: "); anio = sc.nextLine();
                System.out.print("Ingrese los litros del automovil: "); litros = sc.nextLine();
                pw.println(placa + ";" + marca + ";" + modelo + ";" + anio + ";" + litros); 
                System.out.println("==================================================");
            }
            pw.close();
        } catch ( Exception e ) {
            System.err.println("¡Error! " + e);
        }  
    }
}