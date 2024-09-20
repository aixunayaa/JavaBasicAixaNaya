package act1;

import java.util.Scanner;

public class Eje27_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad, acum = 0, cantMay18 =0;
		double promedio;
		final double CANTIDAD_EDADES = 5;
		
		for(int i = 0; i < CANTIDAD_EDADES ; i++) {
			System.out.println("Ingrese la edad " + (i+1));
			edad = Integer.parseInt(input.nextLine());
			acum += edad;
			if (edad > 18 && edad % 2 == 1) {
				cantMay18++;
			}
		}
		
		promedio = acum / CANTIDAD_EDADES ;
		
		System.out.println("Promedio edades " + promedio);
		System.out.println("Impares mayores de 18: " + cantMay18);
		

	}

}
