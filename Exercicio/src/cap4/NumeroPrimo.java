package cap4;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		int resto;
		int cont = 0;

		System.out.println("Informe um número:");
		numero = entrada.nextInt();
		System.out.println("O número informado é: " + numero);

		if (numero == 1) {
			System.out.println("1 não é um número primo, apesar de muitos pensarem que é.");
		} else {
			for (int i = numero; i >= 1; i--) {
				resto = numero % i;
				if (resto == 0) {
					cont += 1;
				}
			}

			switch (cont) {
			case 2:
				System.out.println(numero + " é primo. Divisível por " + cont + " números");
				break;

			default:
				System.out.println(numero + " não é primo. Divisível por " + cont + " números");
			}
		}
		
		entrada.close();

	}

}
