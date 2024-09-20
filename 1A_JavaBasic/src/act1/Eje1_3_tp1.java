package act1;

import java.util.Scanner;

public class Eje1_3_tp1 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//**PEDIR UN NUMERO Y MOSTRARLO *5 Y :2 **//
System.out.println("Ingrese un numero entero");
double num;
num = Integer.parseInt(input.next());
double multCinco;
multCinco = num * 5;
double diviDos;
diviDos = num / 2;

System.out.println("El numero multiplicado por cinco es " +multCinco + "; y el numero dividido por dos es " + diviDos );
	}

}
