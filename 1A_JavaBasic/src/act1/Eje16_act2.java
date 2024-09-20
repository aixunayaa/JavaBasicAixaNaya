package act1;

import java.util.Scanner;

public class Eje16_act2 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inscriptos, asientos, alcanzan;
		System.out.println("Ingrese la cantidad de inscriptos");
		inscriptos = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la cantidad de asientos");
		asientos = Integer.parseInt(input.nextLine());
		alcanzan = asientos - inscriptos;
		
		if(alcanzan >= 0) {
			System.out.println("Los asientos alcanzan");
		} else {
			System.out.println("Los asientos no alcanzan. Faltan " + (alcanzan*-1) + " asientos");
		}

	}

}
