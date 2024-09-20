package act1;

import java.util.Scanner;

public class Eje12_act2 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1; int num2;
		System.out.println("Ingrese el primer numero entero");
		num1= Integer.parseInt(input.nextLine());
		System.out.println("Ingrese el segundo numero entero");
		num2= Integer.parseInt(input.nextLine());
		
		if (num1>num2){
			System.out.println("El numero "+num1+ " es el mayor");
		} else if (num2>num1){
			System.out.println("El numero "+num2+ " es el mayor");
			} else{
				System.out.println("Ambos numeros son iguales");
			}
		
		input.close();
	}}
