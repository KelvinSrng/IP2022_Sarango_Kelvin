package venta5;

import java.util.Scanner;

public class Venta5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        byte num, c;
        float subtot = 0;
        
        //Ingreso de datos
        System.out.println("\t\t\t\tFACTURA");
        System.out.println("================================================================================ ");
        System.out.print("Ingrese el numero cuantos productos desea facturar: ");
        num = sc.nextByte();
        
        byte[] numprodcts = new byte[num];
        String[] nombre = new String[num];
        float[] precios = new float[num];
        
        for (c = 0; c < num; c++) {
        sc.nextLine();
        System.out.println("\n\t\t\t\t PRODUCTO " + (c + 1));
        System.out.println("******************************************************************************** ");
        System.out.print("Ingrese el nombre del item " + (c + 1) + ": ");
        nombre[c] = sc.nextLine();
        System.out.print("Ingrese el precio unitario del producto " + (c + 1) + ": "); precios[c] = sc.nextFloat();
        System.out.print("Ingrese la cantidad de los items " + (c + 1) + " desea facturar: ");
        numprodcts[c] = sc.nextByte();
        }
        System.out.println("+---------------------------------------------------------------------------------+");
        System.out.println("| Cantidad | Item                            | Precio Unitario   | Precio Total   |");
        System.out.println("+----------+---------------------------------+-------------------+----------------+");
        for (c = 0; c < num; c++) {
        System.out.printf("| %-9d| %-32s| %,18.2f| %,15.2f|%n",
        numprodcts[c], nombre[c], precios[c], (precios[c] * numprodcts[c]));
        if (c == num - 1) {
        System.out.println("+----------+---------------------------------+-------------------+----------------+");
        }
        subtot += (precios[c] * numprodcts[c]);
        }
        System.out.printf("%65s| %,15.2f|%n", "Subtotal", subtot );
        System.out.printf("%65s| %,15.2f|%n", "IVA (12%)", (subtot * 0.12) );
        System.out.printf("%65s| %,15.2f|%n", "Total a pagar",(subtot +(subtot * 0.12)));
        System.out.printf("%83s", "+----------------+");
    }
}