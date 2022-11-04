import java.util.Scanner;

public class Venta1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		float precio1, precio2, precio3;
		float subtotal, iva, total;

		System.out.println("COMPRA DE ARTICULOS");
		System.out.println("========================\n");
		System.out.print("Ingrese el precio del articulo 1: ");
		precio1 = sc.nextFloat();
		System.out.print("Ingrese el precio del articulo 2: ");
		precio2 = sc.nextFloat();
		System.out.print("Ingrese el precio del articulo 3: ");
		precio3 = sc.nextFloat();

		subtotal = precio1 + precio2 + precio3;
		iva = subtotal *(float) 0.12;
		total = subtotal + iva;

		System.out.println("\nGracias por su compra!");
		System.out.println("El total a pagar incluido IVA es: USD " + total);

	}
}