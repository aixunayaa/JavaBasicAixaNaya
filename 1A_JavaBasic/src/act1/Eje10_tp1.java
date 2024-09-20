package act1;
import java.util.Scanner;
public class Eje10_tp1 {
	private static Scanner input = new Scanner (System.in);
	Scanner sc = new Scanner (System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cap1; double cap2; double cap3;
		double porc1; double porc2; double porc3;
		String nombre1; String nombre2; String nombre3;
		double totalAportado;
		
		System.out.println("Ingrese su nombre");
		nombre1 = input.nextLine();
		System.out.println("Ingrese capital aportado");
		cap1 = Integer.parseInt(input.nextLine()) ;
		
		System.out.println("Ingrese su nombre");
		nombre2 = input.nextLine();
		System.out.println("Ingrese capital aportado");
		cap2 = Integer.parseInt(input.nextLine()) ;
		
		System.out.println("Ingrese su nombre");
		nombre3 = input.nextLine();
		System.out.println("Ingrese capital aportado");
		cap3 = Integer.parseInt(input.nextLine()) ;
		
		totalAportado = cap1 + cap2 + cap3;
		
		porc1= cap1*100/totalAportado;
		porc2= cap2*100/totalAportado;
		porc3= cap3*100/totalAportado;
		
		System.out.println("El total aportado es de " +totalAportado);
		System.out.println(nombre1+" aporto "+ cap1 + " que presenta el " + porc1+ "% del " +totalAportado);
		System.out.println(nombre2+" aporto "+ cap2 + " que presenta el  " +porc2 + "% del " +totalAportado);
		System.out.println(nombre3+" aporto "+ cap3 + " que presenta el " +porc3 + "% del " +totalAportado);
		System.out.printf("Porcentaje: %.2f\n", porc1);
		System.out.printf("Porcentaje: %.5f\n", porc1);
		//PARA GUARDAR CIERTA CANTIDAD DE DECIMALES**

		
input.close();
	}

}
