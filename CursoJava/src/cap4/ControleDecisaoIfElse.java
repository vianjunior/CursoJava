package cap4;

import java.util.Scanner;

public class ControleDecisaoIfElse {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double valorCompra;
		double valorPagar;

		System.out.println("Informe o valor da Compra: ");
		valorCompra = entrada.nextDouble();

		if (valorCompra >= 1000 && valorCompra <= 9999) {
			valorPagar = valorCompra * 0.95;
		} else if (valorCompra >= 10000){
			valorPagar = valorCompra * 0.9;
		} else {
			valorPagar = valorCompra;
		}

		System.out.println("Valor Final: " + valorPagar);
		
		entrada.close();
	}

}
