package Taller2Condicionales;

import java.util.Scanner;

public class Ejercicio6 {

	private static Scanner in = new Scanner(System.in);
	private static Scanner inString = new Scanner(System.in);
	static String[] motos = { "Yamaha", "Suzuki", "Honda" };

	public static void main(String[] args) {

		int opcion = 0;

		opcion = menu();
		switch (opcion) {
		case 1:
			System.out.println("Usted registrará la " + motos[0]);
			observacion();
			break;
		case 2:
			System.out.println("Usted registrará la " + motos[1]);
			observacion();
			break;
		case 3:
			System.out.println("Usted registrará la " + motos[2]);
			observacion();
			break;
		default:
			System.out.println("Opción invalida");
		}

		System.out.println("Gracias");

	}

	static int menu() {
		System.out.println("¿Qué moto desea registrar?");
		System.out.println("1. " + motos[0]);
		System.out.println("2. " + motos[1]);
		System.out.println("3. " + motos[2]);
		System.out.println("4. Salir");
		return in.nextInt();
	}

	static void observacion() {
		int valor = 0;
		System.out.println("¿Desea realizar alguna observación?");
		System.out.println("Marque 1 para sí de lo contrario cualquiere otro número");
		valor = in.nextInt();
		if (valor == 1) {
			System.out.println("Escribala por favor:");
			String str = inString.nextLine();
		}
	}

}
