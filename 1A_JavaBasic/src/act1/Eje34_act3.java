package act1;

import java.util.Scanner;

public class Eje34_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double altura,acum =0, promedio;
		int cont = 0;
		
		System.out.println("Ingrese la altura, 0 para salir");
		altura = Double.parseDouble(input.nextLine());
		while (altura != 0) {
			cont++;
			acum+= altura;
			System.out.println("Ingrese la altura, 0 para salir");
			altura = Double.parseDouble(input.nextLine());
		}
		promedio = acum/cont;
		System.out.println("La altura promedio de los jugadores es: " + promedio);

	}

}
