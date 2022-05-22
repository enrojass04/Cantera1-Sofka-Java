package Final;

import java.util.Scanner;

	/**
	 * 
	 * @author Eduwin Rojas
	 *
	 */

public class CalculadoraBasica {

	/**
	 * Entrada por teclado.
	 */
	private static Scanner in = new Scanner(System.in);

	/**
	 * Entrada por teclado para caracteres.
	 */
	private static Scanner inString = new Scanner(System.in);

	public static void main(String[] args) {

		calculadora();

	}

	/**
	 * Mestra el menu principal
	 */
	static void menu() {
		System.out.println("Calculadora");
		System.out.println("Para finalizar presione ||  =  ||");
	}
	
	/**
	 * Solicita ingresar la operacion a realizar (suma, resta, producto, division entera o modulo).
	 * @return Devuelve un String correspondiente a la operación seleccionada.
	 */
	static String capturarOperacion() {
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::        ¿Qué operación desea realizar?            ::");
		System.out.println(":: suma '+'   ||  resta '-'   || multiplicacion '*' ::");
		System.out.println("::        division '/'  ||   modulo '%'             ::");
		System.out.println("::           para salir presione  =                 ::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		return inString.next();
	}
	
	/**
	 * Solicita ingresar un número. 
	 * @return Devuelve un double corresponidente al número ingresado.
	 */
	static double capturarNumero() {
		System.out.println("Ingrese un número");
		return in.nextDouble();
	}
	
	/**
	 * Muestra el resultado acumulado de la calculadora.
	 */
	static void resultado(double resultado) {
		System.out.println("Acumulado: " + resultado);
	}
	
	/**
	 * Realiza ciclo para continuar con las operaciones o salir
	 */
	static void calculadora() {
		double numero, total;
		String operacion = "";
		menu();
		total = capturarNumero();
		resultado(total);
		while (!operacion.equals("=")) {

			operacion = capturarOperacion();

			if (operacion.equals("+")) {
				numero = capturarNumero();
				total += numero;
			} else if (operacion.equals("-")) {
				numero = capturarNumero();
				total -= numero;
			} else if (operacion.equals("*")) {
				numero = capturarNumero();
				total *= numero;
			} else if (operacion.equals("/")) {
				numero = capturarNumero();
				if (numero == 0) {
					System.out.println("No es posible dividir por 0");
				} else {
					total /= numero;
				}
			} else if (operacion.equals("%")) {
				numero = capturarNumero();
				if (numero == 0) {
					System.out.println("No existe el modulo de 0");
				} else {
					total %= numero;
				}
			} else {
				System.out.println("Información no valida");
			}
			resultado(total);
		}

	}

}
