package Taller3Ciclos;

import java.util.Scanner;

public class Ejercicio5 {

	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion = 0;
		String nombre = "";
		while (opcion != 3) {
			opcion = menu();
			if (opcion == 1) {
				nombre = capturar();
			}
			if (opcion == 2  ) {
				if (nombre != "") {
					System.out.println("Hola "+nombre);
				} else {
					System.out.println("No hay nombre registrado.");
				}
			}
		}
		
		System.out.println("Gracias");
		
	}
	
	static int menu() {
		System.out.println("Menu de usuario:");
		System.out.println("1. Captura Nombre");
		System.out.println("2. Saludar persona");
		System.out.println("3. Salir");
		return in.nextInt();
	}
	
	static String capturar() {
		System.out.println("Escriba su nombre");		
		in.nextLine();
		return in.nextLine();
	}
	

}
