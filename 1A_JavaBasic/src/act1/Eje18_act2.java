package act1;

import java.util.Scanner;

public class Eje18_act2 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		boolean esDivisible = false;
		
		System.out.println("Ingrese un numero entero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo numero");
		num2 = Integer.parseInt(input.nextLine());
		
		if(num1 > num2) {
			esDivisible = num1%num2 == 0;
			System.out.println(num1 + " es divisible por " + num2 + " = " + esDivisible);
		} else {
			esDivisible = num2%num1 == 0;
			System.out.println(num2 + " es divisible por " + num1 + " = " + esDivisible);
		}

	}

}
