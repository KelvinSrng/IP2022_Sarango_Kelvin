public class PrecioTV1 {
	public static void main (String[] args ) {
		float precio = 837;
		float iva; 
		float total;

		iva = (float) (precio * 0.12);
		total = precio + iva;

		System.out.println("El precio total del TV es: " + total);
	}
}