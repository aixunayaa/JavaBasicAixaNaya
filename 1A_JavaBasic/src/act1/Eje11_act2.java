package act1;

import java.util.Scanner;

public class Eje11_act2 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 int num; final int CERO=0;
		  System.out.println("Ingrese un numero entero");
		  num= Integer.parseInt(input.nextLine());
		  if (num % 2 == CERO){
			  System.out.println("El numero " +num + " es par");
		  } else { 
			  System.out.println("El numero " +num + " es impar");
		  }


	}
	}

	
	
