package Taller2Condicionales;

import java.util.Scanner;

public class Ejercicio9 {
	
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;
		double area = 0.0;

		opcion = menu();
		switch (opcion) {
		case 1:
			area = rectangulo();
			System.out.println("El área es: "+area);
			break;
		case 2:
			area = triangulo();
			System.out.println("El área es: "+area);
			break;
		case 3:
			area = trapecio();
			System.out.println("El área es: "+area);
			break;
		default:
			System.out.println("Opción invalida");
		}

		System.out.println("Gracias");

	}
	
	static int menu() {
		System.out.println("Elija una opción");
		System.out.println("1. Calcular área de un rectángulo");
		System.out.println("2. Calcular área de un triángulo");
		System.out.println("3. Calcular área de un trapecio");
		System.out.println("4. Salir");
		return in.nextInt();
	}
	
	static double rectangulo() {
		System.out.println("Ingrese el lado del rectángulo:");
		double alto = in.nextDouble();
		System.out.println("Ingrese el ancho del rectángulo:");
		double ancho = in.nextDouble();
		double area = alto*ancho;
		return area;
	}

	static double triangulo() {
		System.out.println("Ingrese el ancho del triángulo:");
		double ancho = in.nextDouble();
		System.out.println("Ingrese el alto del triángulo:");
		double alto = in.nextDouble();
		double area = (alto*ancho)/2;
		return area;
	}
	
	static double trapecio() {
		System.out.println("Ingrese la base mayor del trapecio:");
		double basemenor = in.nextDouble();
		System.out.println("Ingrese la base menor del trapecio:");
		double basemayor = in.nextDouble();
		System.out.println("Ingrese la altura del trapecio:");
		double altura = in.nextDouble();
		double area = (basemenor+basemayor)*altura/2;
		return area;
	}
}
