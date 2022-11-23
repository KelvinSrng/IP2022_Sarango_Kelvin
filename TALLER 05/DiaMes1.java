import java.util.Scanner;

public class DiaMes1 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);   
  
    byte num;
 
    System.out.print ("ingresa el numero de mes que quieres saber los dias: ");
    num=sc.nextByte();

    if(num==1 || num ==3 || num==5 || num ==7 || num==8 || num==10 || num==12) {
    	System.out.println("este mes tiene 31 dias");
    } else if (num==4 || num==6 || num==9 || num==11) {
        System.out.println("este mes tiene 30 dias");
    } else if (num==2) {
        System.out.println("este mes tiene 28 dias");
    } else {
        System.out.println("Este numero de mes es incorrecto");
     }   
  }
}