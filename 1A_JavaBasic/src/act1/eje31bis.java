package act1;

import java.util.Scanner;

public class eje31bis {
	static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char continuar;
		
	System.out.println("Desea continuar? S/N");
		continuar = input.nextLine().charAt(0);
		
	while(Character.toLowerCase(continuar) == 's' || Character.toLowerCase(continuar)=='n') {
		System.out.println("Desea continuar? S/N");
		continuar = input.nextLine().charAt(0);
}
	}

}
