import java.util.Scanner;

public class CalculoIMC1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);

		//Declaracion de variables
		String nombre;
		float peso_Kg;
		float estatura_m;

		//Interfaz
		System.out.println ("Calculo del IMC");
		System.out.println ("=========================");
		System.out.println ("");
		System.out.print ("Ingrese su nombre: ");
		nombre = sc.nextLine();
		System.out.print ("Ingrese su peso en kg: ");
		peso_Kg = sc.nextFloat();
		System.out.print ("Ingrese su estatura en metros: ");
		estatura_m = sc.nextFloat();

		//Calculos
		double imc = (float) peso_Kg / Math.pow (estatura_m,2);

		//Mostrar
		System.out.println ("Escriba IMC de " + nombre + " es igua a: " + imc);

	}
}