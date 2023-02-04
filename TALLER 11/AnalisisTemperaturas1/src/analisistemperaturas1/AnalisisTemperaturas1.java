package analisistemperaturas1;

import java.util.Scanner;

public class AnalisisTemperaturas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        float max, min;
        
        float[] tempmax = new float[7];
        float[] tempmin = new float[7];
        float[] tempmedia = new float[7];
        String[] dias = new String[7];
        
        //Ingreso de datos
        System.out.println("ANALISIS DE LAS TEMPERAURAS DE UNA SEMANA");
        System.out.println("============================================");
        for(int i = 0; i <= 7 - 1; i++){
            System.out.print("Ingrese el dia: ");
            dias[i] = sc.nextLine();
            System.out.print("Ingrese la temperatura maxima en grados: ");
            tempmax[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la temperatura minima en grados: ");
            tempmin[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("============================================");
        }
        
        for(int i = 0; i <= 7 - 1; i++){           
            tempmedia[i] = (tempmax[i] + tempmin[i]) / 2;           
            System.out.println("La temperatura media del dia " + dias[i] + " fue de " + tempmedia[i]);            
        }
         
        String diamax = null, diamin = null; 
        max = 0;
        for(int i = 0; i <= 7 - 1; i++){           
            max = tempmax[i];
            diamax = dias[i];           
            for(int z = 0; z <= 7 - 1; z++){           
                if(tempmax[z] > max){           
                    max = tempmax[z];               
                    diamax = dias[z];           
                }
            }        
        }
        
        System.out.println("El dia en que se registro la temperatura mas alta fue: " + diamax + " con "+ max);
        
        min = 0;
        
        for(int i = 0; i <= 7 - 1; i++){           
            min = tempmin[i];
            diamin = dias[i];            
            for(int z = 0; z <= 7 - 1; z++){           
                if(tempmin[z] < min){             
                    min = tempmin[z];               
                    diamin = dias[z];           
                }
            }       
        }
        System.out.println("El dia en que se registro la temperatura mas baja fue: " + diamin + " con "+ min);       
        for(int i = 0; i <= 7 - 1; i++){           
            float ayer = tempmedia[i];
            String dia = dias[i];
            for(int z = 0; z <= 7 - 1; z++){
                if(ayer - tempmedia[z] == 2 || ayer - tempmedia[z] == -2 ){               
                System.out.println("Los dias " + dia + " y " + dias[z] + " varian con ±2 de temperatura");
                }
            }
        }
    }
    
}