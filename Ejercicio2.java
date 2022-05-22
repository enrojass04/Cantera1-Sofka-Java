package Taller4Arreglos;

import java.util.Scanner;

public class Ejercicio2 {
	
	private static Scanner in = new Scanner(System.in);
	static int[] numeros = new int[20];

	public static void main(String[] args) {

		vector();
		int n1 = contarPares(numeros);
		int n2 = contarImpares(numeros);
		int[] pares = new int[n1];
		int[] impares = new int[n2];
		int[] pares2 = llenarPares(pares);
		int[] impares2 = llenarImpares(impares);
		System.out.print("Números pares: ");
		imprimir(pares2);
		System.out.println();
		System.out.print("Números impares: ");
		imprimir(impares2);

	}
	
	static int[] llenarPares(int[] array){
		int count = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				array[count] = numeros[i];
				count++;
			}
		}
		return array;
	}
	
	static int[] llenarImpares(int[] array){
		int count = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				array[count] = numeros[i];
				count++;
			}
		}
		return array;
	}
	
	static void imprimir(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			System.out.print(array[i] + ", ");
			
		}
		System.out.print(array[array.length-1]);
		
	}
	
	static int [] vector() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()*100+1);			
		}
		return numeros;
	}
	
	static int contarPares(int[] array){
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (numeros[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	
	static int contarImpares(int[] array){
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (numeros[i] % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	

	

}
