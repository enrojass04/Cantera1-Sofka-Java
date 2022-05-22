package Taller3Ciclos;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		triangulo();

	}
	
	static void triangulo() {
		int i = 1;
		while (i <= 10) {
			int j = 1;
			int k = 1;			
			while (j <= 10-i) {
				System.out.print(" ");
				j++;
			}			
			while (k <= i) {
				System.out.print("*");
				k++;
			}
			i++;
			System.out.println();			
		}
	}

}
