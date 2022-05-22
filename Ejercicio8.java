package Taller3Ciclos;

import java.util.Scanner;

public class Ejercicio8 {

	private static Scanner in = new Scanner(System.in);
	private static Scanner inString = new Scanner(System.in);

	static String[] nombres = new String[8];
	static double[] notas = new double[8];
	static boolean[] asistencias = new boolean[8];

	public static void main(String[] args) {
		int opcion = 0;

		while (opcion != 4) {
			opcion = menu();
			switch (opcion) {
			case 1:
				capturarDatos();
				break;
			case 2:
				calculoNotas(notas);
//				buscar(opcion2);
				break;
			case 3:
//				opcion3 = menu2();
//				eliminar(opcion3);
				break;
			case 4:
				System.out.println("Adios");
				break;

			default:
				System.out.println("Opción invalida");
			}
		}

	}
	
	static void calculoNotas(double[] A) {
		System.out.println("Lista de usuarios con nota que presentaron el curso:");
		for (int i = 0; i < notas.length; i++) {
			if (asistencias[i]) {
				System.out.print(nombres[i]+": Nota:"+notas[i]);
				if (notas[i]>=3.0) {
					System.out.println(" Aprobó");
				} else {
					System.out.println(" No aprobó");
				}
			}
			
		}
	}
	

	static void capturarDatos() {
		for (int i = 0; i < 8; i++) {
			nombres[i] = capturarN();
			asistencias[i] = capturaAsistencia();
			if (asistencias[i]) {
				notas[i] = capturarNotas();
			}

		}
	}

	static String capturarN() {
		System.out.println("Escriba el nombre");
		return inString.nextLine();
	}

	static double capturarNotas() {
		System.out.println("Escriba la nota");
		return in.nextDouble();
	}

	static boolean capturaAsistencia() {
		System.out.println("Escriba la Asistencia (true o false)");
		return in.nextBoolean();
	}

	static int menu() {
		System.out.println("Elija una opcion:");
		System.out.println("1. Registrar usuario");
		System.out.println("2. Consultar resultados");
		System.out.println("3. Salir");
		return in.nextInt();
	}

}
