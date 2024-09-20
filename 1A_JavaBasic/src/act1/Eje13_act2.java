package act1;

import java.util.Scanner;

public class Eje13_act2 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1; int num2; int num3; 
		System.out.println("Ingrese el primer numero");
		num1= Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo numero");
		num2= Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el tercer numero");
		num3= Integer.parseInt(input.nextLine());
		
		if (num1==num2 && num2 == num3) {
			System.out.println("Los tres numeros son iguales");
	     } else if(num1> num2 && num1> num3){
	    	 System.out.println("El primer numero ("+num1+ ") es el mayor");
			} else if (num2>num1 && num2>num3){
				System.out.println("El segundo numero ("+num2+ ") es el mayor");
			} else if (num3>num1 && num3>num2){
				System.out.println("El tercer numero ("+num3+ ") es el mayor");
			}else {
			    System.out.println("Hay al menos dos números iguales");
			}
			
		input.close();
	}

}
