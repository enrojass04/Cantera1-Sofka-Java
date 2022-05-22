package Taller1Variables;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escriba su nombre:");
		String nombre = in.nextLine();
		System.out.println("Escriba sus apellidos:");
		String apellidos = in.nextLine();		
		System.out.println("Escriba su edad:");
		int edad = in.nextInt();
		System.out.println("Escriba su estatura:");
		double estatura = in.nextDouble();

	}



}
