package cuotafija1;

import java.util.Scanner;

public class CuotaFija1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        byte plazo;
        float monto, interes_anual, interes_mensual;
        float cuota_parcial, seguro_des, cuota_final;
        
        //Igreso de datos del prestamo        
        System.out.print ("Ingrese monto total de prestamo: ");
        monto = sc.nextFloat ();
        System.out.print ("Ingrese plazo para pago de prestamo (en meses): ");
        plazo = sc.nextByte();
        System.out.print ("Ingrese el % de a tasa de interes anual: ");
        interes_anual = sc.nextFloat ();
        
        //Validar plazo minimo
        
        if (plazo < 3) {
            System.out.println ("Error, el plazo no puede ser inferior a 3");
        } else  {
            //Validar plazo maximo
            if ((plazo > 36) && (monto < 20000)) {
                System.out.println ("Error, el pazo no puede ser mayor a 36 en prestamos inferiores a UDS 20000");
            
        } else {
                //Calculo de la cuota
                interes_mensual = interes_anual /12/100;
                cuota_parcial = ((float)(monto*((interes_mensual * (Math.pow((1 + interes_mensual), plazo))) / ((Math.pow((1 + interes_mensual ), plazo)) -1))));
                 seguro_des = (float) ((cuota_parcial * 0.05) / 100);
                cuota_final = cuota_parcial + seguro_des; {
        System.out.println ("LA CUOTA MENSUAL A PAGAR ASCIENDE A: " + cuota_final);    
    
        }
      } 
    }
  }
}