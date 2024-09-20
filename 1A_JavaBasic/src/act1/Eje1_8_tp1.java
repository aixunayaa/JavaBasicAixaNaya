package act1;

import java.util.Scanner;

public class Eje1_8_tp1 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double num1; double num2; double suma; double resta; double mult; double divi; 
		
		 System.out.println("Ingrese el primer numero");
		 num1= Integer.parseInt(input.nextLine());
		 System.out.println("Ingrese el segundo numero");
		 num2= Integer.parseInt(input.nextLine());
		 
		 suma= num1 + num2;
		 resta= num1 - num2;
		 mult= num1 * num2;
		 divi= num1/num2;
		  System.out.println("La suma es de " + suma);
		  System.out.println("La resta es de " + resta);
		  System.out.println("La multiplicacion es de " + mult);
		  System.out.println("La division es de " + divi);
		  
	}

}
