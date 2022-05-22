package Taller4Arreglos;

import java.util.Scanner;

public class Ejercicio5 {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] A = new int[10][10];
		llenarMatriz(A);
		System.out.println();
	}

	static void llenarMatriz(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				A[i][j] = (i+1)*(j+1);
				if (i < 9) {
					System.out.print((j + 1) + " x " + (i + 1) + "   ");
				} else {
					System.out.print((j + 1) + " x " + (i + 1) + "  ");
				}

			}
			System.out.println();
		}
		System.out.println("Escriba la fila");
		int fila = in.nextInt();
		System.out.println("Escriba la columna");	
		int columna = in.nextInt();
		System.out.println("El resultado de "+ fila +"x"+columna+ " es:");
		System.out.println(A[fila-1][columna-1]);
	}


}
