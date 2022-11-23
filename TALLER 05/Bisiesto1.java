import java.util.Scanner;
public class Bisiesto1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
         
        int num;

        System.out.print ("Ingrese el anio que quiera comprobar: ");
        num = sc.nextInt();

        if ((num % 100 != 0 || num % 400 == 0) && num % 4 ==0) {
        	System.out.println("El anio es bisiesto");
        } else {
        	System.out.println("El anio no es bisiesto");
        }
    }
}