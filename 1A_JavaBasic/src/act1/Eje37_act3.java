package act1;

import java.util.Scanner;

public class Eje37_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int CANT_SUELDOS = 12;
		final int MINIMO_SUELDO = 0;
		int contMeses = 1;
		double salario = 0, acumSalario = 0;
		
		
		System.out.println("Ingrese su sueldo del mes " + contMeses);
		salario = Double.parseDouble(input.nextLine());
		
		while (contMeses < CANT_SUELDOS && salario >= MINIMO_SUELDO) {
			acumSalario += salario;
			contMeses++;
			System.out.println("Ingrese su sueldo del mes " + contMeses);
			salario = Double.parseDouble(input.nextLine());
			
			if (contMeses == CANT_SUELDOS) {
				acumSalario += salario;
			}
		}
		if (acumSalario > 0) {
			System.out.println("El total del anio es " + acumSalario);
		} else  {
			System.out.println("Este anio no se cobro nada");
		}

	}

}
