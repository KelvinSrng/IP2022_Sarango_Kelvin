import java.util.Scanner;

public class CalculoIMC2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);

		//Declaracion de variables
		String nombre;
		float peso_Kg;
		float estatura_m;

		//Interfaz
		System.out.println ("CALCULO DEL IMC");
		System.out.println ("====================================");
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
		System.out.println ("Escriba IMC de " + nombre + " es igual a: " + imc);
		System.out.println ("");

		//Tabla
		System.out.println ("Tabla IMC*");
		System.out.println ("");
		System.out.println ("______________________________________");
		System.out.println ("| Valor del IMC  " + "|" + " Estado             |");
		System.out.println ("______________________________________");
		System.out.println ("| Menos de 18.49 " + "|" + " Infra Peso         |");
		System.out.println ("______________________________________");
		System.out.println ("| 18.50 a 24.99  " + "|" + " Peso Normal        |");
		System.out.println ("______________________________________");
		System.out.println ("| 25 a 29.99     " + "|" + " Sobre Peso         |");
		System.out.println ("______________________________________");
		System.out.println ("| 30 a 34.99     " + "|" + " Obesidad Leve      |");
		System.out.println ("______________________________________");
		System.out.println ("| 35 a 39.99     " + "|" + " Obesidad Media     |");
		System.out.println ("______________________________________");
		System.out.println ("| 40 o mas       " + "|" + " Obesidad Morbida   |");
		System.out.println ("______________________________________");
	}
}