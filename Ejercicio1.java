package Taller3Ciclos;

public class Ejercicio1 {
	
	public static void main(String [] arg) {
		
		triangulo();
		
	}
	
	static void triangulo() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
