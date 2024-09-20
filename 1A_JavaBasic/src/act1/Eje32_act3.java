package act1;

import java.util.Scanner;

public class Eje32_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota;
		do {
			System.out.println("Ingrese la nota");
			nota = Integer.parseInt(input.nextLine());
		} while (nota !=2 && (nota < 4 || nota > 10));
		System.out.println("nota valida: " + nota);

	}

}
