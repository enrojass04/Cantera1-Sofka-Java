package Taller4Arreglos;

public class Ejercicio3 {

	public static void main(String[] args) {

		String primos = primos(1000);
		System.out.println(primos);

	}
	
	static String primos(int n) {
		String str = "";
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}					
			}
			
			if (count == 2) {
				str += i +" ";
			}
		}
		return str;
		
	}

}
