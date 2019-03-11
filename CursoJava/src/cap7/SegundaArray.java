package cap7;

public class SegundaArray {

	public static void main(String[] args) {

		// forma habitual de definir array
		int numeros[] = new int[3];
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		// forma simplificada
		
		int simples[]= {10, 20, 30, 40, 50};
		
		for (int i = 0; i < simples.length; i++) {
			System.out.print(simples[i] + " ");
		}

	}

}
