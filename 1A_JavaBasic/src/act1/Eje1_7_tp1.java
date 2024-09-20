package act1;

import java.util.Scanner;

public class Eje1_7_tp1 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double largo; double ancho; double valorMetroCuad; double valorTotalTerreno; double cantAlambre;
		
		System.out.println("Ingrese el largo del terreno");
		largo= Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el ancho del terreno");
		ancho= Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el valor del metro cuadrado");
		valorMetroCuad= Integer.parseInt(input.nextLine());
		
		valorTotalTerreno= ancho * largo * valorMetroCuad;
		System.out.println("El valor total del terreno es de " +valorTotalTerreno);
		
		cantAlambre= (2*ancho+2*largo)*3;
		System.out.println("La cantidad de alambre que se necesita para cercarlo a tres alturas distintas es de "+cantAlambre);
		
		
	
	}

}
