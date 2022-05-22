package Taller1Variables;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Escriba su nombre y apellido:");
		String nombre = in.nextLine();
		System.out.println("Escriba su nombre su papá:");
		String nombrePapa = in.nextLine();
		System.out.println("Escriba el apellido de su papá:");
		String apellidoPapa = in.nextLine();
		System.out.println("Escriba su nombre su mamá:");
		String nombreMama = in.nextLine();
		System.out.println("Escriba el apellido de su mamá:");
		String apellidoMama = in.nextLine();

		String m = mensaje(nombre, nombreMama, nombreMama);
		System.out.println(m);

	}

	static String mensaje(String nombre, String nombrePapa, String nombreMama) {
		return "Yo " + nombre + ", soy hijo de " + nombreMama + " y " + nombrePapa;
	}

}
