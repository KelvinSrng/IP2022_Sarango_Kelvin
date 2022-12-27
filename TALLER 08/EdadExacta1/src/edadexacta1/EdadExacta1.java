package edadexacta1;

import java.util.Scanner;

public class EdadExacta1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int anioA, anioE, anioN, diaA, diaE, diaN, mesA, mesE, mesN;
        
        //Entrada de datos
        System.out.println ("FECHA DE NACIMIENTO:");
        System.out.print ("Dia: ");
        diaN = sc.nextInt();
        System.out.print ("Mes: ");
        mesN = sc.nextInt();
        System.out.print ("Año: ");
        anioN = sc.nextInt();
        System.out.println ("FECHA ACTUAL:");
        System.out.print ("Dia: ");
        diaA = sc.nextInt();
        System.out.print ("Mes: ");
        mesA = sc.nextInt();
        System.out.print ("Año: ");
        anioA = sc.nextInt();
        
        //Proceso
        diaE = diaA - diaN;
        mesE = mesA - mesN;
        anioE = anioA - anioN;
        
        if (diaE < 0) {
            mesE = mesE-1;
            diaE = diaE + 30;
        } if (mesE < 0) {
            anioE = anioE - 1;
            mesE = mesE + 12;
        } if (anioA < anioN) {
            System.out.println ("¡¡DATOS DE ENTRADA INCORRECTOS!!");
        } else {
            System.out.println ("Su edad exacta es " + anioE + " años con " + mesE + " meses y " + diaE + " dias.");
        }
    } 
}