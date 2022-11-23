import java.util.Scanner;

public class CompraElectrodomestico1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);

		//Declaracion de variables
		float precio_relectrod;
		int peso_lb;
		int dist_km_domic;

		//Interfaz
		System.out.println ("Facturacion de un elctrodomewstico");
		System.out.println ("------------------------------------------");
		System.out.print ("\nIngrese el precio del elctrodomestico: ");
		precio_relectrod = sc.nextFloat ();
		System.out.print ("Ingrese el peso en libras: ");
		peso_lb = sc.nextInt ();
		System.out.print ("Ingrese distancia del domicilio en km: ");
		dist_km_domic = sc.nextInt ();

		//Calculos
		float precio_mas_IVA = (float) (precio_relectrod + (precio_relectrod * 0.12));
		float costo_envio = (float) ((peso_lb * dist_km_domic) * 0.01);
		float costo_total = precio_mas_IVA + costo_envio;

		System.out.print ("\nTotal a pagar incluido IVA y entrega a domicilio: " + costo_total + "USD");
	}
}