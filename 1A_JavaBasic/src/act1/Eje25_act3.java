package act1;

import java.util.Scanner;

public class Eje25_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ancho,alto;
		
		System.out.println("Ingrese el alto de la matriz");
		alto = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el ancho de la matriz");
		ancho = Integer.parseInt(input.nextLine());
		
		for (var i = 1; i <= alto; i++) {
			for (var j = 1; j <= ancho; j++) {
				System.out.println('X');
			}
			System.out.println('\n');
		}

	}

}
