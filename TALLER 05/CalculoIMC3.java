import java.util.Scanner;
public class CalculoIMC3 {
	public static void main (String[] args){
    Scanner sc = new Scanner (System.in);

    //Variables
    
    String name;
    float peso,estatura;

    //Entrada de datos
    
    System.out.println ("CALCULO DEL IMC");
    System.out.println ("==================");
    System.out.print ("\nIngrese su nombre: ");
    name = sc.nextLine();
    System.out.print("Ingrese su peso en Kg: ");
    peso = sc.nextFloat();
    System.out.print ("Ingrese su estatura en metros: ");
    estatura = sc.nextFloat();

    //Proceso
    
    double imc = (float) peso / Math.pow(estatura,2);
    
    //Calculo
    
    if (imc<18.49) {
    	System.out.println(name + " su IMC es: " + imc + " por lo que usted esta  con infrapeso");
    } else if (imc>18.5 || imc<24.99) {
    	System.out.println(name + " su IMC es: " + imc + " por lo que usted esta con peso normal");	
    } else if (imc>25 || imc<29.99) {
    	System.out.println(name + " su IMC es: " + imc + " por lo que usted esta con sobrepeso");
    } else if (imc>30 || imc<34.99) {
    	System.out.println(name + " su IMC es: " + imc + " por lo que usted esta Obesidad leve");	
    } else if (imc>35 || imc<39.99) {
    	System.out.println(name + " su IMC es: " + imc + " por lo que usted esta con Obesidad media");
    } else if (imc>40) {
    	System.out.println(name + " su IMC es: " + imc + " por lo que usted esta con Obesidad morbida");	
    }

    //Salida de datos

    System.out.println("\n*Clasificacion de la OMS de acuerdo con el IMC");

  }
}