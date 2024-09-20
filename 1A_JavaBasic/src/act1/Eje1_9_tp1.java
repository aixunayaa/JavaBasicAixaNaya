package act1;

import java.util.Scanner;

public class Eje1_9_tp1 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angulo1; int angulo2; int angulo3; final int TOTALGRADOS= 180; 
		System.out.println("Ingrese el valor del primer angulo");
		angulo1= Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el valor del segundo angulo");
		angulo2= Integer.parseInt(input.nextLine());
		
		angulo3= TOTALGRADOS - angulo1 - angulo2;
		System.out.println("El valor del angulo faltante es de "+ angulo3);

	}

}
