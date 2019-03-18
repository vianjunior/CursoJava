package cap7;

public class ArrayNumeros {

	public static void main(String[] args) {
		
		int numeros [] = new int[10];
		
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		numeros[5] = 6;
		numeros[6] = 7;
		numeros[7] = 8;
		numeros[8] = 9;
		numeros[9] = 10;
		
		// for aprimorado
		for(int n : numeros) {
			System.out.print(n + " ");
		}
		
		System.out.println("");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}
