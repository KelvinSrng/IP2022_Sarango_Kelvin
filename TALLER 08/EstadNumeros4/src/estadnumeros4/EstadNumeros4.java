package estadnumeros4;

import java.util.Scanner;

public class EstadNumeros4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        byte n, numM = 0, numMe = 0; 
        int suma_posi, cn, np;
        short suma, num;
        
        //Ingreso de datos
        System.out.print("Ingrese la cantidad de numeros: ");
        n = sc.nextByte();
        
        suma = 0;
        cn = 0;
        np = 0;
        suma_posi = 0;
        
        for (int c = 1; c <= n; c++ ) {
            System.out.println(  "Ingrese el numero " + c  );
            num = sc.nextByte();
            suma = (short) (suma + num);
               
                 if (c == 1){
                 numM = (byte) num;
                 } else if (num > numM){
                     numM = (byte) num;
                 }
                 
                 if (c == 1){
                 numMe = (byte) num;
                 } else if (num < numMe){
                     numMe = (byte) num;
                     
                 }if (num < 0){
                
                cn = cn + 1;
                 
                 } else {
                
                np = np + 1;  
                    
            }
        }
                 
        float media = (float) ( (float) suma / (float) (n));
        
        System.out.println("La media aritmetica es: "+ media);
        System.out.println("El numero mayor es :" + numM);
        System.out.println("El numero menor es :" + numMe);
        System.out.println("En total usted ingreso " + np + " numeros positivos");
        System.out.println("En total usted ingreso " + cn + " numeros negativos");
    } 
}