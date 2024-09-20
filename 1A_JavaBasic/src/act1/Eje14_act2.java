package act1;

import java.util.Scanner;

public class Eje14_act2 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre; double altura = 0; int edad; final int EDAD_MIN = 7; final double ALTURA_MIN = 150;
		
		
		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese su altura");
		altura = Double.parseDouble(input.nextLine());
		
		if (altura >= ALTURA_MIN && edad >= EDAD_MIN){
			System.out.println("Puede ingresar, diviertase :)");
		} else{
			System.out.println("No cumple con los requisitos minimos para entrar, mildis");
		}
		
	}
}
