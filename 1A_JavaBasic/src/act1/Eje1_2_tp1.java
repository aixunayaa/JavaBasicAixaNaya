package act1;

import java.util.Scanner;

public class Eje1_2_tp1 {
private static Scanner input = new Scanner (System.in);
Scanner sc = new Scanner (System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//***PEDIR TRES NOTAS Y CALCULAR EL PROMEDIO***//
		
System.out.println("Ingrese su primer nota");
double nota1;
nota1 = Integer.parseInt(input.next());
System.out.println("Ingrese su segunda nota");
double nota2;
nota2 = Integer.parseInt(input.next());
System.out.println("Ingrese su tercer nota");
double nota3;
nota3 = Integer.parseInt(input.next());

double promedio;
promedio = (nota1 + nota2 + nota3)/3;

System.out.println("El promedio de las tres notas es de "+ promedio);
	}

}
