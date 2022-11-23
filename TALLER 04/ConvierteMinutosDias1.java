import java.util.Scanner;

public class ConvierteMinutosDias1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);

		//Declaracion de variables
		int min;

		//Interfaz
		System.out.println ("Convierte minutos en dias");
		System.out.println ("--------------------------------");
		System.out.print ("\nIngrese los minutos: ");
		min = sc.nextInt ();

		//Calculos
		int hora_minu = 60;
		int dia_minu = 1440;

		int dias = (int) (min / dia_minu);
		int horas = (int) (min % dia_minu / hora_minu);
		int minu = (int) (min % dia_minu % hora_minu);
		System.out.println ("");
		System.out.println (dias + " dias con " + horas + " horas y " + minu + " minutos ");
	}
}