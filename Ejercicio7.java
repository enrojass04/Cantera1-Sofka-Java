package Taller3Ciclos;

import java.util.Scanner;

public class Ejercicio7 {
	
	private static Scanner in = new Scanner(System.in);
	private static Scanner inString = new Scanner(System.in);

	static String[] nombres = new String[5];
	static String[] telefonos = new String[5];
	static String[] marcas = new String[5];
	static String[] placas = new String[5];
	
	public static void main(String[] args) {
		int opcion = 0;
		int opcion2 = 0;
		int opcion3 = 0;

		while (opcion != 4) {
			opcion = menu();
			switch (opcion) {
			case 1:
				capturarDatos();
				break;
			case 2:
				opcion2 = menu2();
				buscar(opcion2);
				break;
			case 3:
				opcion3 = menu2();
				eliminar(opcion3);
				break;
			case 4:
				System.out.println("Adios");
				break;

			default:
				System.out.println("Opción invalida");
			}
		}

	}
	
	static void eliminarDatos(int opcion) {
		nombres[opcion-1] = "Sin registro";
		telefonos[opcion-1] = "Sin registro";
		marcas[opcion-1] = "Sin registro";
		placas[opcion-1] = "Sin registro";
		System.out.println("¡Auto eliminado!");
		
	}
	
	static void eliminar(int opcion) {
		switch (opcion) {
		case 1:
			eliminarDatos(opcion);
			break;
		case 2:
			eliminarDatos(opcion);
			break;
		case 3:
			eliminarDatos(opcion);
			break;
		case 4:
			eliminarDatos(opcion);
			break;
		case 5:
			eliminarDatos(opcion);
			break;
		default:
			System.out.println("Opción invalida");
		}

	}
	
	static void buscarDatos(int opcion) {
		System.out.println("Nombre: "+nombres[opcion-1]+" Teléfono: "+telefonos[opcion-1]+" Marca: "+ marcas[opcion-1]+" Placa: "+ placas[opcion-1]);;
		
	}

	static void buscar(int opcion) {
		switch (opcion) {
		case 1:
			buscarDatos(opcion);
			break;
		case 2:
			buscarDatos(opcion);
			break;
		case 3:
			buscarDatos(opcion);
			break;
		case 4:
			buscarDatos(opcion);
			break;
		case 5:
			buscarDatos(opcion);
			break;
		default:
			System.out.println("Opción invalida");
		}

	}

	static void capturarDatos() {
		for (int i = 0; i < 5; i++) {
			nombres[i] = capturarN();
			telefonos[i] = capturarTel();
			marcas[i] = capturaMarca();
			placas[i] = capturaPlaca();
			
			if (i==1) {
				while (placas[i-1].equals(placas[i])) {
					System.out.println("La placa ya está registrada");
					placas[i] = capturaPlaca();							
				}
			}			
			if (i==2) {						
				while (placas[i-2].equals(placas[i]) || placas[i-1].equals(placas[i])) {
					System.out.println("La placa ya está registrada");
					placas[i] = capturaPlaca();							
				}
			}			
			if (i==3) {						
				while (placas[i-3].equals(placas[i]) || placas[i-2].equals(placas[i]) || placas[i-1].equals(placas[i])) {
					System.out.println("La placa ya está registrada");
					placas[i] = capturaPlaca();							
				}
			}
			
			if (i==4) {						
				while (placas[i-4].equals(placas[i]) || placas[i-3].equals(placas[i]) || placas[i-2].equals(placas[i]) || placas[i-1].equals(placas[i])) {
					System.out.println("La placa ya está registrada");
					placas[i] = capturaPlaca();							
				}
			}
		}
	}

	static String capturarN() {
		System.out.println("Escriba el nombre");
		return inString.nextLine();
	}

	static String capturaMarca() {
		System.out.println("Escriba la marca");
		return inString.nextLine();
	}
	
	static String capturaPlaca() {
		System.out.println("Escriba la placa");
		return inString.nextLine();
	}

	static String capturarTel() {
		System.out.println("Escriba el telefono");
		return inString.nextLine();
	}

	static int menu() {
		System.out.println("Elija una opcion:");
		System.out.println("1. Agregar automovil");
		System.out.println("2. Buscar automovil");
		System.out.println("3. Eliminar automovil");
		System.out.println("4. Salir");
		return in.nextInt();
	}
	
	static int menu2() {
		System.out.println("¿Qué automovil quiere buscar?");
		System.out.println("1. automovil 1");
		System.out.println("2. automovil 2");
		System.out.println("3. automovil 3");
		System.out.println("4. automovil 4");
		System.out.println("5. automovil 5");
		return in.nextInt();
	}
	
	static int menu3() {
		System.out.println("¿Qué automovil quiere eliminar?");
		System.out.println("1. automovil 1");
		System.out.println("2. automovil 2");
		System.out.println("3. automovil 3");
		System.out.println("4. automovil 4");
		System.out.println("5. automovil 5");
		return in.nextInt();
	}

}
