package act1;

import java.util.Scanner;

public class Eje36_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double promedio;
		int num,cont = 0, acum = 0;
		do {
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(input.nextLine());
			cont++;
			acum+=num;
			promedio = acum/cont;
		} while(promedio < 20);
		
		System.out.println("Cantidad de valores leidos: " + cont);

	}

}
