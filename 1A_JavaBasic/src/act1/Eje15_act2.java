package act1;

import java.util.Scanner;

public class Eje15_act2 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final int EDAD_MINIMA = 6; final double ALTURA_MINIMA= 1.50; String nombre; int edad; double altura; boolean puedeEntrar;
					
					
					System.out.println("Ingrese su nombre");
					nombre = input.nextLine();
					System.out.println("Ingrese su edad");
					edad = Integer.parseInt(input.nextLine());
					System.out.println("Ingrese su altura");
					altura = Double.parseDouble(input.nextLine());
					
					
					puedeEntrar = edad > EDAD_MINIMA || altura > ALTURA_MINIMA;
					
				
					if(puedeEntrar) {
						System.out.println(nombre + " Puede entrar al juego");
					} else {
						System.out.println(nombre + " No puede entrar al juego");
					}

	}

}
