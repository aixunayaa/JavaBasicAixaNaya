package act1;

import java.util.Scanner;

public class Eje1_5_tp1 {
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//**PEDIR DOS VALORES E INTERCAMBIAR SU VALOR DE LA VARIABLE**//
		
		System.out.println("Ingrese un valor entero");
		int valor1;
		valor1 = Integer.parseInt(input.next()) ;
		
		System.out.println("Ingrese un segundo valor entero");
		int valor2;
		valor2 = Integer.parseInt(input.next()) ;
		
		int aux;
		
		aux= valor1;
		valor1=valor2;
		valor2=aux;
		
		System.out.println("Los valores ahora son "+ valor1 +" y "+ valor2);
		
		
		

	}

}
