package Taller3Ciclos;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		triangulo();

	}
	
	
	static void triangulo() {
		int i = 1;
		do {
			int j = 1;	int k = 1;	int l = 1;
			int m = 1;	int n = 1;	int x = 1;
			
			do {
				System.out.print(" ");
				j++;
			} while (j <= 12-i);
			
			if (i < 12) {
				do {
					System.out.print("*");
					k++;
				} while ( k <= i*2-1);
			} else {
				do {
					if (i <= 13 && l <= 9 ) {
						System.out.print(" ");
					}
					l++;
				} while (l <= i);
				do {
					if (i <= 13) {
						System.out.print("*");
					}
					m++;
				} while (m < 4);
				
				if (i > 13) {
					do {
						System.out.print(" ");
						n++;
					} while (n < 23-i);
					
					do {
						System.out.print("*");
						x++;
					} while (x < i*2-22);
				}
			}
			System.out.println();
			i++;
		} while (i <= 16);
	}

}
