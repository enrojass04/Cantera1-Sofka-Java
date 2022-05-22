package Taller2Condicionales;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Escriba su nombre completo:");
	    String nombre = in.nextLine(); 
		System.out.println("Escriba su edad:");
	    int edad = in.nextInt(); 
	    
	    String e = esMayor(nombre, edad);
	    System.out.println(e);
	}
	
	static String esMayor(String nombre, int edad) {
		String str ="";
		if (edad >= 18) {
			str = nombre + " usted es mayor de edad, por lo tanto puede entrar a la fiesta.";
		}
		else {
			str = nombre + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.";
		}
		return str;
	}

}