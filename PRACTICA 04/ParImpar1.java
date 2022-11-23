import java.util.Scanner;

public class ParImpar1 {
	public static void main (String[] args) {
		//daclaracion de variables
		Scanner sc = new Scanner (System.in);
		int numero;
		String mensaje;

		//Entrada de datos
		System.out.print("Ingrese el numero: ");
		numero = sc.nextInt();

		//Proceso
		if (numero % 2 == 0) {
			mensaje = " Par";
		} else {
			mensaje = " Impar";
		}
		System.out.println("\nEl numero " + numero + " es" + mensaje);
	}
}