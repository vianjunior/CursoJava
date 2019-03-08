package cap3;

import java.util.Scanner;

public class CalculandoAumentoDePreco {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o valor original: ");
		double valor = entrada.nextDouble();
		
		System.out.println("Informe a porcentagem de aumento: ");
		double porcentagem = entrada.nextDouble();
		
		double valorFinal = valor + ((valor * porcentagem) / 100);
		
		System.out.println("Valor Final: " + valorFinal);
		
		entrada.close();

	}

}
