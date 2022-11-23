import java.util.Scanner;

public class Circulo1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);

		//Declaracion de variables
		int diame_cm, radio_cm;
		float area_cir;

		//Interfaz
		System.out.println ("Circunferencia y el area de un circulo");
		System.out.println ("------------------------------------------\n");
		System.out.print ("Ingrese diametro en cm: ");
		diame_cm = sc.nextInt();

		//Calculo del radio
		radio_cm = diame_cm / 2;
		System.out.println ("El radio es: " + radio_cm);

		//Calculo del area de un circulo
		area_cir = (float) (3.14 * (Math.pow(radio_cm,2)));
		System.out.println ("El diametro de un circulo " + diame_cm + " es: " + area_cir);
	}
}
