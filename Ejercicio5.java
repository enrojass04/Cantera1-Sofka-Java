package Taller2Condicionales;
import java.util.Scanner;

public class Ejercicio5 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		String[] medicamentos = { "Dolex", "Ibuprofeno", "Acetaminofen"};
		int[] precios = {800, 900, 1000};
		
		int opcion = menu();
		
		switch (opcion) {
		case 1:
			menu2(medicamentos);
			int opcion1 = in.nextInt();
			String a = comprar(opcion1, medicamentos);
			System.out.println(a);
			break;

		case 2:
			menu3(medicamentos);
			int opcion2 = in.nextInt();
			String b = consultar(opcion2, medicamentos, precios);
			System.out.println(b);
			break;
			
		case 3:
			menu4(medicamentos);
				
			break;

		default:
			System.out.println("Las opciones son entre 1 y 3");
			break;
		}
		
		
				
	}
	
	private static int menu() {
		System.out.println("Elija una opción");
		System.out.println("1. Comprar");
		System.out.println("2. Consultar precios");
		System.out.println("3. Realizar devolución");
		return in.nextInt();
	}
	
	static void menu2(String[] medicamento) {
		System.out.println("¿Qué medicamento quiere comprar?");
		System.out.println("1. "+ medicamento[0]);
		System.out.println("2. "+ medicamento[1]);
		System.out.println("3. "+ medicamento[2]);
	}
	
	static void menu3(String[] medicamento) {
		System.out.println("¿Qué precio del medicamento quiere consultar?");
		System.out.println("1. "+ medicamento[0]);
		System.out.println("2. "+ medicamento[1]);
		System.out.println("3. "+ medicamento[2]);
	}
	
	static void menu4(String[] medicamento) {
		System.out.println("¿Qué medicamento quiere devolver?");
		System.out.println("1. "+ medicamento[0]);
		System.out.println("2. "+ medicamento[1]);
		System.out.println("3. "+ medicamento[2]);
	}
	
	static void listamed() {
		
	}
	
	static String comprar(int key, String[] med) {
		String str = "";
		switch (key) {
		case 1:
			str = "Usted llevará " + med[0];
			break;

		case 2:
			str = "Usted llevará " + med[1];
			break;

		case 3:
			str = "Usted llevará " + med[2];
			break;

		default:
			str = "Opción no listada.";
			break;
		}
		return str;
	}
	
	static String consultar(int key, String[] med, int[] precio) {
		String str = "";
		switch (key) {
		case 1:
			str = med[0] + " tiene un costo de " + precio[0];
			break;

		case 2:
			str = med[0] + " tiene un costo de " + precio[1];
			break;

		case 3:
			str = med[0] + " tiene un costo de " + precio[2];
			break;

		default:
			str = "Opción no listada.";
			break;
		}
		return str;
	}
	

}
