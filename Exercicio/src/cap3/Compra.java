package cap3;

import java.util.Scanner;

public class Compra {
	public static void main(String[] args) {
		
		Scanner entradas = new Scanner (System.in);
		
		System.out.println("Informe o valor total da venda: ");
		double valor = entradas.nextDouble();

		double valorDesconto = (valor <= 1000 ? 0 : (valor >= 1001 && valor <= 3000 ? 5 : 10));
		System.out.println("Valor Original: " + valor);
		System.out.println("Valor com Desconto : " + (valor - ((valor * valorDesconto) / 100)));
	}

}
