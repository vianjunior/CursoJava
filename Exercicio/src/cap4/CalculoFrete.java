package cap4;

import java.util.Scanner;

public class CalculoFrete {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int codigo = 1;
		int quantidade;
		double totalLivros = 0, totalCelulares = 0, totalTablets = 0, totalGames = 0, totalEletronicos = 0,
				totalOutros = 0, totalGeralFrete;
		double custoLivros = 3.5, custoCelulares = 4.5, custoTablets = 5.5, custoGames = 6.5, custoEletronicos = 7.5,
				custoOutros = 10;

		while (codigo != 0) {
			System.out.println("Informe o código da categoria do produto (1 a 6). 0 para sair. ");
			codigo = entrada.nextInt();

			if (codigo != 0) {
				if (codigo >= 1 && codigo <= 6) {
					System.out.println("Informe a quantidade vendida: ");
					quantidade = entrada.nextInt();

					switch (codigo) {

					case 1:
						totalLivros += (quantidade * custoLivros);
						break;

					case 2:
						totalCelulares += (quantidade * custoCelulares);
						break;

					case 3:
						totalTablets += (quantidade * custoTablets);
						break;

					case 4:
						totalGames += (quantidade * custoGames);
						break;

					case 5:
						totalEletronicos += (quantidade * custoEletronicos);
						break;

					case 6:
						totalOutros += (quantidade * custoOutros);
						break;

					}
				} else {
					System.out.println("Código inválido ou não encontrado.");
				}
			}

		}

		totalGeralFrete = totalLivros + totalCelulares + totalEletronicos + totalGames + totalTablets + totalOutros;

		System.out.println("Total Frete Livros: " + totalLivros + " -- " + (totalLivros / custoLivros) + " Unidades -- "
				+ custoLivros + " Unitário");
		System.out.println("Total Frete Celulares: " + totalCelulares + " -- " + (totalCelulares / custoCelulares)
				+ " Unidades -- " + custoCelulares + " Unitário");
		System.out.println("Total Frete Tablets: " + totalTablets + " -- " + (totalTablets / custoTablets)
				+ " Unidades -- " + custoTablets + " Unitário");
		System.out.println("Total Frete Games: " + totalGames + " -- " + (totalGames / custoGames) + " Unidades -- "
				+ custoGames + " Unitário");
		System.out.println("Total Frete Eletronicos: " + totalEletronicos + " -- "
				+ (totalEletronicos / custoEletronicos) + " Unidades -- " + custoEletronicos + " Unitário");
		System.out.println("Total Frete Outros: " + totalOutros + " -- " + (totalOutros / custoOutros) + " Unidades -- "
				+ custoOutros + " Unitário");
		System.out.println("----------------------------------");
		System.out.println("Total Geral: " + totalGeralFrete);

		entrada.close();
	}

}
