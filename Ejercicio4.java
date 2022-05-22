package Taller3Ciclos;

import java.util.Scanner;

public class Ejercicio4 {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] arg) {
		
		System.out.println("Ingrese el número de tabla que quiere obtener:");
		int n = in.nextInt();
		tabla(n);
		
	}
	
	static void tabla(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + n*i);
		}
	}

}
