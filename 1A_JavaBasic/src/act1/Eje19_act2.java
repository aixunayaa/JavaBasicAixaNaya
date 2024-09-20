package act1;

import java.util.Scanner;

public class Eje19_act2 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean esDeUnSoloDigito,esImpar,estaEnAmbosGrupos,noEstaEnNingunGrupo;
		
		System.out.println("Ingrese un numero entero");
		num = Integer.parseInt(input.nextLine());
		
		esImpar = num % 2 != 0;
		esDeUnSoloDigito = num >= -9 && num <10;
		estaEnAmbosGrupos = esImpar && esDeUnSoloDigito;
		noEstaEnNingunGrupo = !esImpar && !esDeUnSoloDigito;
		
		System.out.println("El numero ingresado es " + num);
		System.out.println("Es impar: " + esImpar);
		System.out.println("Es de un solo digito: " + esDeUnSoloDigito);
		System.out.println("Esta en ambos grupos: " + estaEnAmbosGrupos);
		System.out.println("No esta en ningun grupo: " + noEstaEnNingunGrupo);

	}

}
