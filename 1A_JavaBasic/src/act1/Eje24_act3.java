package act1;

import java.util.Scanner;

public class Eje24_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		do {			
			System.out.println("Ingrese un numero entero");
			num1 = Integer.parseInt(input.nextLine());
			System.out.println("Ingrese otro numero entero");
			num2 = Integer.parseInt(input.nextLine());
		} while (num2 < num1);
		
		for (var i = num1+1; i < num2; i++) {
			System.out.println("excluyendo puntas " + i);
		}
		for (var i = num1; i <= num2; i++) {
			System.out.println("incluyendo puntas " + i);
		}

	}

}
