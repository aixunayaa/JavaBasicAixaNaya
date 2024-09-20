package act1;

import java.util.Scanner;

public class Eje17_act2 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		char genero;
		boolean puedeJubilarse = false;
		
		System.out.println("Ingrese su edad, entre 0 y 120");
		edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el genero (M / F)");
		genero = input.nextLine().charAt(0);
		
		if((genero == 'F' && edad >=60 && edad <= 120 ) || (genero == 'M' && edad >= 65 && edad <= 120 )) {
			puedeJubilarse = true;
		}
		if (puedeJubilarse) {
			System.out.println("Usted esta en condiciones de jubilarse");
		} else if ((genero == 'F' && edad >=1 && edad < 60) || (genero == 'M' && edad >=1 && edad < 65)) {
			System.out.println("Usted no esta en edad de jubilarse");
		} else {  
			System.out.println("Edad o genero invalido");
		}

	 }
	}

