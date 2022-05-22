package Taller1Variables;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Escriba el nombre de la mascota:");
		String nombreMascota = in.nextLine();
		System.out.println("Escriba la edad de la mascota:");
		int edad = in.nextInt();
		in.nextLine();
		System.out.println("Escriba el tipo de la mascota:");
		String tipo = in.nextLine();
		System.out.println("Escriba su nombre completo:");
		String nombre = in.nextLine();
		String n = mascota(nombreMascota, edad, tipo, nombre);
		System.out.println(n);

	}

	static String mascota(String nombreMascota, int edad, String tipo, String nombre) {
		return nombreMascota + " es un(a) " + tipo + ", el cual, tiene " + edad + " años de edad y " + nombre
				+ " es actualmente su dueño(a).";
	}

}
