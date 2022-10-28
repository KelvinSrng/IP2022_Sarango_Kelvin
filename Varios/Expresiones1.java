public class Expresiones1 {
	public static void main(String[] args) {
		byte a=4, b=3, c=5;

		boolean resultado = (a>b+2) && !(c+a==b*c);

		System.out.println("Dados a=" + a +", b= " + b + ", c=" +c);
		System.out.print("\nEl resulado de la expresión:");
		System.out.println("(a>b+2) && !(c+a == b*c)");
		System.out.println("Es: " + resultado);

	}
}