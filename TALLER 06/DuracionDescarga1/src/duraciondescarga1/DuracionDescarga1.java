package duraciondescarga1;

import java.util.Scanner;

public class DuracionDescarga1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        int arc_gb, vel_des;
        float arc_mb, vel_mb;
        float hrs; 
        float min; 
        float segundos;
        
        //Ingreso de datos
        System.out.print ("Ingrese el tamaño del archivo (GB): ");
        arc_gb = sc.nextInt();
        
        //calculo
        arc_mb = arc_gb * 1024;
        
        System.out.print ("Ingrese su velocidad efectiva de descarga en Mbps: ");
        vel_des = sc.nextInt ();
        
        //Calcular de Mbps a MBps
        vel_mb = vel_des / 8;
        
        //Calculo de tiempo

        segundos = arc_mb / vel_mb;
        min = segundos / 60;
        hrs = min / 60;
        
        //Resultados
        System.out.println ("El tiempo de descarga en horas es: " + hrs);
        System.out.println ("El tiempo de descarga en minutos es: " + min);
        System.out.println ("El tiempo de dsecarga en segundos es: " + segundos);
    }
    
}
