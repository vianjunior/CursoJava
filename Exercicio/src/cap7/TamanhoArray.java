// A execução por linha de código não é limitado ao uso do args do main
package cap7;

public class TamanhoArray {

	public static void main(String[] args) {

		int tamanho = 10; // se não for inserido valor, o tamanho deverá ser 10
		
		if(args.length != 0) { // se o tamanho de args for diferente de zero, significa que algo foi digitado no prompt.
			tamanho = Integer.parseInt(args[0]);
		}

		int arrayNumeros[] = new int[tamanho];// o array deve ser do tamanho informado

		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = i * 2; // o valor do array será o dobro do seu índice
			System.out.println(arrayNumeros[i]);
		}
	}
}
