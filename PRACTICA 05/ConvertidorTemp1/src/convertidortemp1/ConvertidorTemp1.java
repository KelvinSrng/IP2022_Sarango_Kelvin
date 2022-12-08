package convertidortemp1;

import java.util.Scanner;

public class ConvertidorTemp1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Asignacion de variables
        float valor_temp, grad;
        byte uni_medida;
        
        System.out.println("Convertidor de Temperatura ");
        System.out.println("===========================");
        System.out.print("Ingrese el valor de la temeperatura: ");
        valor_temp = sc.nextByte();
        System.out.print("Ingrese '1' para fahrenheit o '2' para Celcius: ");
        uni_medida = sc.nextByte();
        
        switch (uni_medida ) {
            case 1:
                grad = ((float)9 / 5) * valor_temp + 32;
                System.out.println ("La temperatura en grados Farenheit es: " + grad);
                break;
            case 2:
                grad = ((float) 5 / 9) * (valor_temp - 32);
                System.out.println ("La temperatura en grados Celsius es: " + grad);
                break;
            default:
                System.out.println ("\nOpcion incorercta");
        }
                
    }
    
}