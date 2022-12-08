import java.util.Scanner;

public class BoletoAutobus1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        //Declaracion de variables

        float precioT, km, precioKm, des, des2;
        char dia;
        dia = 'l';
        dia = 'f';

        //Interfaz

        System.out.println ("Precio de un boleto de autobus");
        System.out.println ("-------------------------------");
        System.out.print ("Ingrese la distancia del recorrido en km: ");
        km = sc.nextFloat ();
        System.out.print ("Ingrese el tipo de dia en que se realizo el recorrido (l o f): ");
        dia = sc.next().charAt(0);
        precioT = km * 5;
        des = (float)(precioT * 0.15);
        des2 = (float)(des * 0.05);
        
        //Calculo

        if (km>80 && dia=='l') {
            System.out.println("EL PRECIO DEL BOLETO EN USD ES: " + (precioT - des - des2) );
        } else if (km<80 && dia=='l') {
            System.out.println("EL PRECIO DEL BOLETO EN USD ES: " + (precioT - des2) );
        } else if (km<80 && dia=='f') {
            System.out.println("EL PRECIO DEL BOLETO EN USD ES: " + precioT);
        } else if (km>80 && dia=='f') {
            System.out.println("EL PRECIO DEL BOLETO EN USD ES: " + (precioT - des));		
     }
  }
}