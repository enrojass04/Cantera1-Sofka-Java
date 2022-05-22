package Taller2Condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		String[] peliculas = { "Toy Story", "El se�or de los anillos", "Piratas del Caribe" };

		try {
			
			int opcion = menu();

			switch (opcion) {
			case 1:
				menu2();
				int opcion1 = in.nextInt();
				String a = alquilar(opcion1, peliculas);
				System.out.println(a);
				break;

			case 2:
				menu3();
				break;
				
			case 3:
				menu4();
				int opcion3 = in.nextInt();				
				String b = recibir(opcion3);
				System.out.println(b);
				
				if (opcion3==1) {
					System.out.println("Desea realizar una anotaci�n 1 para SI, 2 para NO");
					int key = in.nextInt();
					
					if (key==1) {
						String notacion = capturar();
						System.out.println("Su anotaci�n fue registrada.");
					} else {
						System.out.println("Ha deicido no realizar anotaci�n");
					}

				}			
				break;

			default:
				System.out.println("Las opciones son entre 1 y 3");
				break;
			}

		} catch (InputMismatchException e) {
			System.err.println("Debes introducir un n�mero");
			in.nextLine();
		}

	}

	static int menu() {
		System.out.println("Elija una opci�n");
		System.out.println("1. Alquilar pelicula");
		System.out.println("2. Consultar pelicula");
		System.out.println("3. Recibir pelicula");
		return  in.nextInt();
	}

	public static void menu2() {
		System.out.println("Elija una pelicula");
		System.out.println("1. Toy Story");
		System.out.println("2. El se�or de los anillos");
		System.out.println("3. Piratas del Caribe");
	
	}
	
	static void menu3() {
		System.out.println("Las peliculas disponibles son");
		System.out.println("1. Toy Story");
		System.out.println("2. El se�or de los anillos");
		System.out.println("3. Piratas del Caribe");
	}

	static void menu4() {
		System.out.println("�Desea recibir la pel�cula en la tienda?");
		System.out.println("Presione 1 para SI � cualquier otro n�mero para NO.");
	}
	
	public static String alquilar(int key, String[] pelicula) {
		String str = "";
		switch (key) {
		case 1:
			str = "" + pelicula[0];
			break;

		case 2:
			str = "" + pelicula[1];
			break;

		case 3:
			str = "" + pelicula[2];
			break;

		default:
			str = "Opci�n no listada.";
			break;
		}
		return str;
	}

	static String recibir(int key) {
		String str = "";
		if (key == 1) {
			str = "La pelicula est� disponible para ser entregada.";
		} else {
			str = "Ha deicido no recoger la pelicula";
		}
		return str;
	}
	
	static String capturar() {
		System.out.println("Escribir su anotaci�n");		
		in.nextLine();
		return in.nextLine();
	}
	
	static void anotacion(int key, String anotacion) {
		if (key == 1) {
			System.out.println("Escribir su anotaci�n");
			System.out.println("Su anotaci�n fue registrada.");
		} else {
			System.out.println("Ha deicido no realizar anotaci�n");
		}

	}

}
