package act1;

import java.util.Scanner;

public class Eje38_act3 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final String USUARIO = "admin";
		 final String PASS = "123456";
		 final int MAXIMO_INTENTOS = 3;
		 
		 String usuarioIngresado, passIngresada;
			boolean accesoConcedido = false;
			int contadorIntentos = 0;
			
			do {
				System.out.println("Ingrese usuario");
				usuarioIngresado = input.nextLine();
				System.out.println("Ingrese la contrasenia");
				passIngresada = input.nextLine();
				
				if(usuarioIngresado.equals(USUARIO) && passIngresada.equals(PASS)) {
					accesoConcedido = true;
					System.out.println("Acceso concedido " + accesoConcedido);
				} else {
					contadorIntentos++;
					System.out.println("Acceso concedido " + accesoConcedido + ". Intentos restantes: " + (MAXIMO_INTENTOS - contadorIntentos));
					if (contadorIntentos == 3) {
						System.out.println("Se ha bloqueado la cuenta");
					}
				}
				
			} while (contadorIntentos < 3 && !accesoConcedido);

	}

}
