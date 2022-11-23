import java.util.Scanner;

public class MayorMenorEdad1 {
	public static void main (String[] args) {
		//declaracion de variables
		Scanner sc = new Scanner (System.in);	
		short anioN, anioA;
		byte edad;
		String mensaje;

		//Entradad de datos
		System.out.print("Ingrese el año de nacimiento: ");
		anioN = sc.nextShort();
		System.out.print("Ingrese el año actual: ");
		anioA = sc.nextShort();

		//Proceso
		edad = (byte)(anioA - anioN);
		if (edad >= 18) {
			mensaje = "Mayor";
		} else {
			mensaje = "Menor";
		}

		//Salida de datos
		System.out.println("\nUsted es " + mensaje +" de edad");
	}
}