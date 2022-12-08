package estadnumeros2;

import java.util.Scanner;

public class EstadNumeros2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Asignacion de variables
        
        int num, suma, cn, np;
        float promedio;
        int num_ingresados, suma_posi;
        float prom_posi;
        
        System.out.print("SUMAR DE ENTEROS Y CONTAR");
        System.out.print("\nIngrese numeros positivos y negativos (Para terminar digite 0): ");
        
        num_ingresados = 0;
        num = 1;
        suma = 0;
        cn = 0;
        np = 0;
        promedio = 0;
        prom_posi = 0;
        suma_posi = 0;
        
        //Bucle      
        while (num < 0 || num > 0){
            num = sc.nextInt();
            
            if (num > 0 || num < 0 ){
                num_ingresados = num_ingresados + 1;
            }
            
            if (num > 0){
                suma_posi = suma_posi + num;
            }
                if (num < 0){
                    cn = cn + 1;
                } else {
                    if (num > 0 ){ 
                        np = np + 1;  
                    }    
                }
        suma = suma + num; 
        promedio = (float) (suma / num_ingresados);
        prom_posi = (float)(suma_posi / np);
        }
        System.out.println("En total usted ingreso " + num_ingresados);
        System.out.println("En total usted ingreso " + np + " numeros positivos");
        System.out.println("En total usted ingreso " + cn + " numeros negativos");
        System.out.println("El promedio total es " + promedio);
        System.out.println("El promedio de los numeros positivos es " + prom_posi);
        System.out.println("La suma de los numeros ingresados es " + suma);   
    }
}