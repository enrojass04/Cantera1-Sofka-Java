package Taller1Variables;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Escriba el nombre de una ciudad capital:");
		String ciudad = in.nextLine();
		System.out.println("Escriba el nombre del país:");
		String pais = in.nextLine();

		String c = ciudad(ciudad, pais);
		System.out.println(c);

	}

	static String ciudad(String ciudad, String pais) {
		return "La ciudad " + ciudad + ", es la capital del país " + pais;
	}

}