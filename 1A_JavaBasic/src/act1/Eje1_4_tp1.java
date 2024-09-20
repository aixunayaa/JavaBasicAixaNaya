package act1;

import java.util.Scanner;

public class Eje1_4_tp1 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//**PEDIR VALOR POR HORA Y CANT HORAS DE TRABAJO**//
		//MOSTRAR SUELDO SEMANAL- SABADOS TRABAJA LA MITAD DE HORAS//
System.out.println("Ingrese su valor monetario por hora");
double valorHora;
valorHora= Integer.parseInt(input.next());

System.out.println("Ingrese su cantidad de horas diarias");
double cantHoras;
cantHoras = Integer.parseInt(input.next());

double salarioSemanal;
salarioSemanal = (cantHoras * valorHora * 5)+ (cantHoras * valorHora/2) ;
System.out.println("Su salario semanal es de " + salarioSemanal);

	}

}
