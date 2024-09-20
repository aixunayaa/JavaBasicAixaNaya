package act1;

import java.util.Scanner;

public class Eje33_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		final int CORTE = 0;
		
		do {
			System.out.println("Ingrese un numero, 0 para salir");
			num = Integer.parseInt(input.nextLine());
			
			if (num < min && num != CORTE) {
				min = num;
			} else if (num > max && num != CORTE) {
				max = num;
			}
			
		} while(num != 0);
		
		

	}}


