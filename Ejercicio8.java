package Taller2Condicionales;

import java.util.Scanner;

public class Ejercicio8 {
	
	private static Scanner in = new Scanner(System.in);
	private static Scanner inString = new Scanner(System.in);
	static String[] tortas = { "Leche", "Fresas", "Chocolate" };
	static int[] cantidad = { 10, 12, 15};
	static int[] pedidos = new int [3];
	static int[] ventas = new int [3];
	static int[] porciones = {1, 5, 10, 15};
	static boolean[] decoraciones = {true, false};

	public static void main(String[] args) {
		
		int opcion = 0;
	

		opcion = menu();
		switch (opcion) {
		case 1:
			System.out.println("Registre la cantidad de pedidos");
			System.out.println("Leche");
			pedidos[0] = in.nextInt();
			System.out.println("Fresas");
			pedidos[1] = in.nextInt();
			System.out.println("Chocolate");	
			pedidos[2] = in.nextInt();
			break;
		case 2:
			System.out.println("La cantidad de tortas disponibles son:");
			System.out.println(tortas[0]+": "+ cantidad[0]);
			System.out.println(tortas[1]+": "+ cantidad[1]);
			System.out.println(tortas[2]+": "+ cantidad[2]);
			break;
		case 3:
			System.out.println("Registre la cantidad de ventas:");
			System.out.println("Leche");
			ventas[0] = in.nextInt();
			System.out.println("Fresas");
			ventas[1] = in.nextInt();
			System.out.println("Chocolate");	
			ventas[2] = in.nextInt();
			int suma = sumar(ventas);
			System.out.println("La cantidad de ventas son: "+suma);
			break;
		default:
			System.out.println("Opción invalida");
		}

		System.out.println("Gracias");

	}
	
	static int menu() {
		System.out.println("Elija una opción");
		System.out.println("1. Registar pedidos");
		System.out.println("2. Consultar tortas disponibles");
		System.out.println("3. Registrar ventas diarias");
		return in.nextInt();
	}
	
	static int sumar(int[] A) {
		int suma = 0;
		for (int i = 0; i < A.length; i++) {
			suma += A[i];			
		}
		return suma;
	}

}
