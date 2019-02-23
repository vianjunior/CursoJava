package cap4;

import java.util.Scanner;

public class RecolhimentoIR {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double salario, aliquota, deducao, IR;

		System.out.println("Informe o seu Salário: ");
		salario = entrada.nextDouble();
		System.out.println("Salário: " + salario);

		if (salario <= 1903.88) {
			aliquota = 0;
			deducao = 0;
			IR = (salario * (aliquota / 100)) - deducao;
			System.out.println("Valor do IR a recolher: " + IR);
		} else if (salario >= 1903.99 && salario <= 2826.65) {
			aliquota = 7.5;
			deducao = 142.8;
			IR = (salario * (aliquota / 100)) - deducao;
			System.out.println("Valor do IR a recolher: " + IR);
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			aliquota = 15;
			deducao = 354.8;
			IR = (salario * (aliquota / 100)) - deducao;
			System.out.println("Valor do IR a recolher: " + IR);
		} else if (salario >= 3751.06 && salario <= 4664.68) {
			aliquota = 22.5;
			deducao = 636.13;
			IR = (salario * (aliquota / 100)) - deducao;
			System.out.println("Valor do IR a recolher: " + IR);
		} else {
			aliquota = 27.5;
			deducao = 869.36;
			IR = (salario * (aliquota / 100)) - deducao;
			System.out.println("Valor do IR a recolher: " + IR);
		}

		entrada.close();

	}

}
