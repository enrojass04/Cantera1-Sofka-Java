package Taller2Condicionales;

import java.util.Scanner;

public class Ejercicio10 {
	
	private static Scanner in = new Scanner(System.in);
	private static Scanner inString = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese su nombre:");
		String nombre = inString.nextLine();
		int opcion = 0;
		double total = 1000.0;

		opcion = menu();
		switch (opcion) {
		case 1:
			ingresar(total);
			break;
		case 2:
			retirar(total);
			break;
		case 3:
			
			break;
		default:
			System.out.println("Opción invalida");
		}
		System.out.println();
		System.out.println("Feliz día Sr(a) "+ nombre);

	}

	static int menu() {
		System.out.println("Elija una opción");
		System.out.println("1. Ingresar dinero a su cuenta");
		System.out.println("2. Retirar dinero de su cuenta");
		System.out.println("3. Consultar dinero disponible en su cuenta");
		return in.nextInt();
	}
	
	static void ingresar(double a) {
		System.out.println("Ingrese el monto:");
		double valor = in.nextInt();
		if (valor > 0) {
			System.out.println("¡Dinero ingresado exitosamente!");
			a += valor;
			System.out.println("Ahora su balance total es de: "+ a);
		} else {
			System.out.println("¡Recuerde que no puede ingresar saldo negativo!");
			System.out.println("Su balance continua igual y es de: "+ a);			
		}		
	}
	
	static void retirar(double a) {
		System.out.println("Ingrese el monto:");
		double valor = in.nextInt();
		if (valor <= a) {
			System.out.println("¡Dinero retirado exitosamente!");
			a -= valor;
			System.out.println("Ahora su balance total es de: "+ a);
		} else {
			System.out.println("¡Lo sentimos, no tiene ese balance en su cuenta!");
			System.out.println("SSu balance es de: "+ a);			
		}
	}
}
