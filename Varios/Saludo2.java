import java.util.Scanner;
public class Saludo2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String nombrePer;
	System.out.print("Dime tu nombre: ");
	nombrePer = sc.nextLine ();
	System.out.print("Hola " + nombrePer);
	System.out.println(", un gusto saludarte!");
	}
}