package act1;

import java.util.Scanner;

public class Eje28_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int cant, num, max = Integer.MIN_VALUE, auxPos = 0;
		
		
		do {
			
			System.out.println("Ingrese la cantidad");
			cant = Integer.parseInt(input.nextLine());
			
		} while (cant <= 0);

		for (int i=0; i < cant; i++) {
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(input.nextLine());
			if (num > max) {
				max = num;
				auxPos = i+1;
			}
			
		}
		
		System.out.println("El numero mayor es " + max + " en la posicion " + auxPos);

	}

}
