package cap5;

import java.util.Scanner;

public class TestaCompra {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Compra c = new Compra();
		
		System.out.println("Informe o nome do cliente: ");
		c.setNomeCliente(entrada.nextLine());
		System.out.println("Informe o valor da compra: ");
		c.setValorCompra(entrada.nextDouble());
		
		c.setValorPagar(c.getValorCompra());
		c.exibirValores();
		
		entrada.close();

	}

}
