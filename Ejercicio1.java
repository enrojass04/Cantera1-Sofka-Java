package Taller2Condicionales;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Escriba su edad:");
	    int edad = in.nextInt(); 
	    
	    String e = esMayor(edad);
	    System.out.println(e);
	}
	
	static String esMayor(int edad) {
		String str ="";
		if (edad >= 18) {
			str = "Usted es mayor de edad";
		}
		return str;
	}

}
