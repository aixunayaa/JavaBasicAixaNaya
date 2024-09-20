package act1;

import java.util.Scanner;

public class Eje35_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, masJoven;
		int edad, minEdad = Integer.MAX_VALUE;
		
		System.out.println("Ingrese el nombre - Incluya un asterisco para salir");
		nombre = input.nextLine();
		masJoven = nombre;
		while (!nombre.equals("*")) {
			System.out.println("Ingrese la edad de " + nombre);
			edad = Integer.parseInt(input.nextLine());
			if(edad < minEdad) {
				minEdad = edad;
				masJoven = nombre;
				}
			System.out.println("Ingrese el nombre - Incluya un asterisco para salir");
			nombre = input.nextLine();

		};
		if (!masJoven.equals("*")) {			
			System.out.println("La persona mas joven es " + masJoven);
		} else {
			System.out.println("No se ingresaron datos");
		}

	}

}
