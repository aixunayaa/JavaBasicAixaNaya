package act1;

import java.util.Scanner;

public class Eje1_6_tp1 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double montoTotalVentas; double porcVentas; double sueldoTotal;
		final double SUELDO= 44000;
		
		System.out.println("Ingrese el mmonto de venta total del vendedor de este mes");
		montoTotalVentas= Integer.parseInt(input.nextLine());
		
		porcVentas= montoTotalVentas * 0.16;
		sueldoTotal = SUELDO + porcVentas;
		
		System.out.println("El sueldo a cobrar es de " +sueldoTotal);
		

	}

}
