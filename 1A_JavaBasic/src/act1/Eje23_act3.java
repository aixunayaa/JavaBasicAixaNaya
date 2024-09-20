package act1;

import java.util.Scanner;

public class Eje23_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Ingrese un numero entero");
		n = Integer.parseInt(input.next()); 
		
		for (int i = 1; i <= 11; i++) {
			System.out.println(i*n);
		}

	}

}
