package act1;

import java.util.Scanner;

public class Eje21_act2 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, dom=1, lun=2, mar=3, mie=4, jue=5, vie=6, sab= 7;
		
		System.out.println("Ingrese un numero entre 1 y 7");
		num= Integer.parseInt(input.nextLine());
		
		switch (num){
		case 1: 
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3: 
			System.out.println("Martes");
			break;
		case 4: 
			System.out.println("Miercoles");
			break;
		case 5: 
			System.out.println("Jueves");
			break;
		case 6: 
			System.out.println("Viernes");
			break;
		case 7: 
			System.out.println("Sabado");
			break;
		default: 
			System.out.println("ERROR");
			}

	}

}
