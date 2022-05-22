package Taller3Ciclos;

import java.util.Scanner;

public class Ejercicio6 {

	private static Scanner in = new Scanner(System.in);
	private static Scanner inString = new Scanner(System.in);

	static String[] nombres = new String[3];
	static String[] organizaciones = new String[3];
	static String[] telefonos = new String[3];

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
	
	static void eliminar(int opcion) {
		switch (opcion) {
		case 1:
			nombres[0] = "Sin registro";
			organizaciones[0] = "Sin registro";
			telefonos[0] = "Sin registro";
			System.out.println("¡Contacto eliminado!");
			break;
		case 2:
			nombres[1] = "Sin registro";
			organizaciones[1] = "Sin registro";
			telefonos[1] = "Sin registro";
			System.out.println("¡Contacto eliminado!");
			break;
		case 3:
			nombres[2] = "Sin registro";
			organizaciones[2] = "Sin registro";
			telefonos[2] = "Sin registro";
			System.out.println("¡Contacto eliminado!");
			break;
		default:
			System.out.println("Opción invalida");
		}

	}

	static void buscar(int opcion) {
		switch (opcion) {
		case 1:
			System.out.println("Nombre: "+nombres[0]+" Organización: "+ organizaciones[0]+" Teléfono: "+telefonos[0]);
			break;
		case 2:
			System.out.println("Nombre: "+nombres[1]+" Organización: "+ organizaciones[1]+" Teléfono: "+telefonos[1]);
			break;
		case 3:
			System.out.println("Nombre: "+nombres[2]+" Organización: "+ organizaciones[2]+" Teléfono: "+telefonos[2]);
			break;
		default:
			System.out.println("Opción invalida");
		}

	}

	static void capturarDatos() {
		for (int i = 0; i < 3; i++) {
			nombres[i] = capturarN();
			organizaciones[i] = capturarOrg();
			telefonos[i] = capturarTel();
			if (i==1) {
				while (telefonos[i-1].equals(telefonos[i])) {
					System.out.println("El teléfono ya está registrado");
					telefonos[i] = capturarTel();							
				}
			}			
			if (i==2) {						
				while (telefonos[i-2].equals(telefonos[i]) || telefonos[i-1].equals(telefonos[i])) {
					System.out.println("El teléfono ya está registrado");
					telefonos[i] = capturarTel();							
				}
			}
		}
	}

	static String capturarN() {
		System.out.println("Escriba el nombre");
		return inString.nextLine();
	}

	static String capturarOrg() {
		System.out.println("Escriba la organización");
		return inString.nextLine();
	}

	static String capturarTel() {
		System.out.println("Escriba el telefono");
		return inString.nextLine();
	}

	static int menu() {
		System.out.println("Agenda telefónica:");
		System.out.println("1. Agregar contacto");
		System.out.println("2. Buscar contacto");
		System.out.println("3. Eliminar contacto");
		System.out.println("4. Salir");
		return in.nextInt();
	}
	
	static int menu2() {
		System.out.println("¿Qué contacto quiere buscar?");
		System.out.println("1. contacto 1");
		System.out.println("2. contacto 2");
		System.out.println("3. contacto 3");
		return in.nextInt();
	}
	
	static int menu3() {
		System.out.println("¿Qué contacto quiere eliminar?");
		System.out.println("1. contacto 1");
		System.out.println("2. contacto 2");
		System.out.println("3. contacto 3");
		return in.nextInt();
	}

}
