package sueldomasalto1;

import java.util.Scanner;

public class SueldoMasAlto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    //Declaracion de variables
    int nombres,mayorSueldo=0;
    String mayorNombre = null;
    int ba=0; 
    
    //Ingreso de datos
    System.out.print("Ingrese el numero de Empleados: ");
    nombres=sc.nextInt();
    
    //Arreglo
    String [] nomEmplea=new String[nombres];
    Integer [] salaEmplea=new Integer[nombres];
  
    for (int i = 0; i < nombres; i++) {
        
        System.out.print("Ingrese el nombre: ");
        nomEmplea[i]=sc.next();
        System.out.print("Su salario es: ");
        salaEmplea[i]=sc.nextInt();
    
            if(ba==0){
                mayorSueldo=salaEmplea[i];
                mayorNombre=nomEmplea[i]; 
                ba=1;
            }
            if(salaEmplea[i]>mayorSueldo){
                mayorSueldo=salaEmplea[i];  
                mayorNombre=nomEmplea[i];
            } 
    } 
    System.out.println("El sueldo mas alto es " + mayorSueldo + "$ y los empleados que lo ganan son: ");
    
    for (int i = 0; i < nombres; i++) {
        if(salaEmplea[i] == mayorSueldo){
            System.out.println(nomEmplea[i]);
        }
    }
    }
}