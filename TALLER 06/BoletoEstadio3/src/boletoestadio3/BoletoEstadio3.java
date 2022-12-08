package boletoestadio3;

import java.util.Scanner;

public class BoletoEstadio3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        int edad;
        String genero;
        byte tp_entrada;
        float palco_35;
        float tribuna_25;
        float preferencia_20;
        float general_10;
        float costo;
        
        palco_35 = 35; 
        tribuna_25 = 25;
        preferencia_20 = 20;
        general_10 = 10;

        //Ingreso de datos
        System.out.println ("Precio a pagar por boleto");
        System.out.println ("-------------------------");
        System.out.println ("Ingrese tipo de entrada: ");
        System.out.println("1) Palco");
        System.out.println("2) Tribuna");
        System.out.println("3) Preferencia");
        System.out.println("4) General");
        System.out.print("Escoja una opcion (1-4): ");
        tp_entrada = sc.nextByte();
        System.out.print ("Ingrese su género, si es maculino (M) y si es femenino (F): ");
        genero = sc.next();
        System.out.print ("Ingrese edad: ");
        edad = sc.nextInt();

        //Dependiendo de 
        switch (tp_entrada) { 
            case 1:

        //Condicion
                costo = palco_35;
        if (edad < 13 && (genero.equals ("M"))){
            costo = (float) (costo * 0.40);
        } else {
            if (edad < 13 && (genero.equals ("F"))){
                costo = (float) (costo * 0.50);
            }
        }
        System.out.println ("El valor a pagar por el boleto en USD es: " + costo);
        break;
            case 2:
                costo = tribuna_25;
        if (edad < 13 && (genero.equals ("M"))){
            costo = (float) (costo * 0.40);
        } else {
            if (edad < 13 && (genero.equals ("F"))){
                costo = (float) (costo * 0.50);
            }
        }
        System.out.println ("El valor a pagar por el boleto en USD es: " + costo);
            break;
        case 3:
                costo = preferencia_20;
                if (edad < 13 && (genero.equals ("M"))){
                    costo = (float) (costo * 0.40);
        } else {
                    if (edad < 13 && (genero.equals ("F"))){
                        costo = (float) (costo * 0.50);
                    }
                }
                System.out.println ("El valor a pagar por el boleto en USD es: " + costo);
                break;
        case 4:
            costo = general_10;
            if (edad < 13 && (genero.equals ("M"))){
                costo = (float) (costo * 0.40);
            } else {
                if (edad < 13 && (genero.equals ("F"))){
                    costo = (float) (costo * 0.50);
                }
            }
            System.out.println ("El valor a pagar por el boleto en USD es: " + costo);
            break;
        default:
            System.out.println("\nOpcion incorrecta!");
        }
    }
}