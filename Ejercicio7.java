package Taller2Condicionales;

import java.util.Scanner;

public class Ejercicio7 {
	
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Ingrese su peso en (Kg):");
		double peso = in.nextDouble();
		System.out.println("Ingrese su estura en (m):");
		double estura = in.nextDouble();
		encontrarIMC(peso, estura);

	}

	static void encontrarIMC(double peso, double estatura) {

		double imc = peso / (estatura * estatura);

		if (imc < 18.5) {
			System.out.println("Su IMC es de " + imc + " y está bajo de peso");
		} else if (imc >= 18.5 & imc < 25.0) {
			System.out.println("Su IMC es de " + imc + " y está en peso normal");
		} else if (imc >= 25.0 & imc < 35.0) {
			System.out.println("Su IMC es de " + imc + " y está en sobrepeso");
		} else {
			System.out.println("Su IMC es de " + imc + " y está obeso");
		}
	}
}
