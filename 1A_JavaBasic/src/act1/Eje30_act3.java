package act1;

import java.util.Scanner;

public class Eje30_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;
		char operando;
		
		do {
			System.out.println("Ingrese el operando, F para salir");
			operando = input.nextLine().charAt(0);
			//poner un while
			System.out.println("Ingrese un numero entero");
			num1 =  Double.parseDouble(input.nextLine());
			System.out.println("Ingrese un segundo numero entero");
			num2 = Double.parseDouble(input.nextLine());
			
		
			switch (operando) {
				case '+':
					System.out.println("suma: " + (num1+num2));
					break;
				case '-':
					System.out.println("resta: " + (num1-num2));
					break;
				case '*':
					System.out.println("multiplicacion: " + (num1*num2));
					break;
				case '/':
					if (num2 == 0) {
						System.out.println("No se puede dividir por 0");
					} else {
						System.out.println("division: " + (num1/num2));
					};
					break;
				default:
					break;
			}
		} while (Character.toUpperCase(operando) != 'F');
		
		//toLowerCase()
		

	}

}
