// A execu��o por linha de c�digo n�o � limitado ao uso do args do main
package cap7;

public class TamanhoArray {

	public static void main(String[] args) {

		int tamanho = 10; // se n�o for inserido valor, o tamanho dever� ser 10
		
		if(args.length != 0) { // se o tamanho de args for diferente de zero, significa que algo foi digitado no prompt.
			tamanho = Integer.parseInt(args[0]);
		}

		int arrayNumeros[] = new int[tamanho];// o array deve ser do tamanho informado

		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = i * 2; // o valor do array ser� o dobro do seu �ndice
			System.out.println(arrayNumeros[i]);
		}
	}
}
