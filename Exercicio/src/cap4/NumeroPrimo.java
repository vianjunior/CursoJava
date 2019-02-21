package cap4;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		int resto;
		int cont = 0;

		System.out.println("Informe um n�mero:");
		numero = entrada.nextInt();
		System.out.println("O n�mero informado �: " + numero);

		if (numero == 1) {
			System.out.println("1 n�o � um n�mero primo, apesar de muitos pensarem que �.");
		} else {
			for (int i = numero; i >= 1; i--) {
				resto = numero % i;
				if (resto == 0) {
					cont += 1;
				}
			}

			switch (cont) {
			case 2:
				System.out.println(numero + " � primo. Divis�vel por " + cont + " n�meros");
				break;

			default:
				System.out.println(numero + " n�o � primo. Divis�vel por " + cont + " n�meros");
			}
		}
		
		entrada.close();

	}

}
