package estadnumeros3;

import java.util.Scanner;

public class EstadNumeros3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n, c, numM = 0;
        short suma, num;
        
        System.out.print("Ingrese la cantidad de numeros: ");
        n = sc.nextByte();
        
        c = 1; 
        suma = 0;
        
        while (c <= n) {
           System.out.print(  c  );
          num = sc.nextByte();
          suma = (short) (suma + num);
                
          c = (byte) (c + 1);
               
                 if (c == 1){
                 numM = (byte) num;
                 } else if (num > numM){
                     numM = (byte) num;
                 }  
                
                        
        }
        
        float media = (float) ( (float) suma / (float) (n));
        System.out.print("La media aritmetica es: "+ media);
        System.out.print("\nEl numero mayor es :" + numM+ "\n");
        System.out.print("");
    }
    
}