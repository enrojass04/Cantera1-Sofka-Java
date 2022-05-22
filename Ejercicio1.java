package Taller4Arreglos;

import java.util.Scanner;

public class Ejercicio1 {
	
	private static Scanner in = new Scanner(System.in);
	static int[] numeros = new int[5];

	public static void main(String[] args) {

		vector();
		imprimir(numeros);

	}
	
	
	static void imprimir(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("["+i+"]"+" = "+ array[i]);
			
		}
	}
	
	static int [] vector() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] =  capturar();			
		}
		return numeros;
	}
	
	static int capturar() {
		System.out.println("Escriba el numero la posición ");
		return in.nextInt();
	}

}
