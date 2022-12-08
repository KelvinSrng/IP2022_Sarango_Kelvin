package estadviaje1;

import java.util.Scanner;

public class EstadViaje1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        int km_recorridos, tmp_viaje_hrs, gals_consum, m_rec, viaje_s;
        float ltrs_consum, rendi_auto, vel_ms;
        
        //Ingreso de datos
        System.out.println ("             ESTADISTICAS DE VIAJE");
        System.out.println (" ");
        System.out.print ("Ingrese los KM recorridos: ");
        km_recorridos = sc.nextInt();
        System.out.print ("Ingrese la duracion del viaje en horas: ");
        tmp_viaje_hrs = sc.nextInt();
        System.out.print ("Ingrese los galones consumidos: ");
        gals_consum = sc.nextInt();
        
        //Calculo
        m_rec = km_recorridos * 1000;
        viaje_s = tmp_viaje_hrs * 3600;
        vel_ms = m_rec / viaje_s;
        ltrs_consum = (float)(gals_consum * 3.785);
        rendi_auto = (float) (km_recorridos / ltrs_consum);
        
        //MOstrar
        System.out.println("El rendimiento del auto en Km/lt fue de: " + rendi_auto);
        System.out.println ("La velocidad media del viaje fue de: " + vel_ms);
    }
    
}
