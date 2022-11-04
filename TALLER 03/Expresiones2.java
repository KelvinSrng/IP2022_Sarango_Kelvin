public class Expresiones2 {
	public static void main(String[] args) {

		System.out.println("EVALUACION DE EXPRESIONES");
		System.out.println("=======================================\n");
		System.out.println("Expresion 1:");
		System.out.println("    2 * 8 / 2 / 2 - 22 * 4 / 8 - (100 + 25) / 5 ^ 2");
		System.out.println("Resultado: ");
		byte Resultado1 = (2 * 8 / 2 / 2 - 22 * 4 / 8 - (100 + 25) / 5^2);
		System.out.println("    " + Resultado1);

		System.out.println("\nExpresion 2:");
		System.out.println("    (2 * 16 / 2 ^ 3 - 4 ) + 32 - ( 125 / 5 / 5 + 3)");
		System.out.println("Resultado: ");
		byte Resultado2 = (2*16/2^3-4)+32-(125/5/5+3);
		System.out.println("    " + Resultado2);

		boolean Resultado3 = (12>12||8>4&&22<21);
	    System.out.println("\nExpresion 3:");
	    System.out.println("    12 >= 12 OR 8 > 4 AND 22 < 21");
	    System.out.println("Resultado: ");
	    System.out.println("    " + Resultado3);

	    boolean Resultado4 = (( 12 >= 12 || 8 > 4 ) && 22 < 21);
	    System.out.println("\nExpresion 4:");
	    System.out.println("    ( 12 >= 12 or 8 > 4 ) and 22 < 21");
	    System.out.println("Resultado: ");
	    System.out.println("    " + Resultado4);

	    System.out.println ("Expresion 5:");
		System.out.println ("1 + 8 * ( 12 - 3 + 9 / ( 9 - 4 ^ 5) + 7 ) > 2.8 * 2 and 3 ^ 4 = 100 - 19");
		System.out.println ("Resultado:");
		//Calculo
		boolean Resultado5 = ((1 + 8) * (12 - 3 + 9) / ( 9 - (Math.pow(4,5)) + 7 ) > 2.8 * 2 && (Math.pow(3,4)) == (100 - 19));
		System.out.println(Resultado5);

	    byte a = 100, b = -12, d = 5, e = 0;
	    short c = 4000;
	    System.out.println("\nExpresion 6:");
		System.out.println("    ( a + b * c + e ) <= e * d * b AND ( c / a + e -d) < e + d –c+ b * a");
		System.out.println("Resultado: ");
		boolean Resultado6 = (( a + b * c + e ) <= e * d * b && ( c / a + e -d) < e + d - c + b * a);
		System.out.println("    " + Resultado6);

	    boolean v = true, f = false; 

	    boolean Resultado7 = (v || f && (f || ! (f || v && v)));
	    System.out.println("\nExpresion 7:");
	    System.out.println("    V or F and (V or not (F or V and V))");
	    System.out.println("Resultado: ");
	    System.out.println("    " + Resultado7);

	    boolean resultado8 = false || 1 == Math.pow ((Math.pow(2,3)/4),0) && ! ((Math.pow(2,-1)<0));
	    System.out.println("\nExpresion 8:");
	    System.out.println("    Falso OR 1 = ( 2 ^ 3 / 4 ) ^ 0 AND NOT ( 2 ^ -1 < 0 )");
	    System.out.println("Resultado: ");
	    System.out.println("    " + resultado8);
	}
}