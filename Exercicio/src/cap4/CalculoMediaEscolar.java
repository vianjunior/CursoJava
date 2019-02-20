package cap4;

import java.util.Scanner;

public class CalculoMediaEscolar {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("Informe a segunda nota: ");
		nota2 = entrada.nextDouble();
		System.out.println("Informe a terceira nota ");
		nota3 = entrada.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Média: " + media);
		
		if (media >= 7) {
			System.out.println("Aluno APROVADO");
		} else if (media <= 6.9 && media >= 5) {
			System.out.println("Aluno EM RECUPERAÇÃO");
		} else if (media <= 4.9 && media >= 0) {
			System.out.println("Aluno REPROVADO");
		} else {
			System.out.println("A média calculada não é válida.");
		}

		entrada.close();
	}

}
