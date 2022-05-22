package Taller4Arreglos;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		String [][] M = {{"01","02","03","04","05"},
						{"06","07","08","09","10"},
						{"11","12","13","14","15"},
						{"16","17","18","20","20"}};
		
		imprimir(M);

	}
	
	static String [][] imprimir(String [][] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (i % 2 == 0) {
					System.out.print(array[i][j] + " ");
				} else {
					System.out.print(array[i][4-j] + " ");
				}
			}
			System.out.println();
		}
		return array;
	}

}
