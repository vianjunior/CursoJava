package cap4;

import java.util.Scanner;

public class calculoIMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double altura, peso, imc;
		
		System.out.println("Informe a altura em Metros: ");
		altura = entrada.nextDouble();
		System.out.println("Informe o peso em Quilos");
		peso = entrada.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("O seu IMC é: " + imc);
		
		if (imc <= 18.5) {
			System.out.println("Abaixo do Peso Normal");
		} else if(imc > 18.5 && imc <= 25) {
			System.out.println("Peso Normal");
		} else if(imc > 25 && imc <= 30) {
			System.out.println("Acima do Peso Normal");
		} else if(imc > 30) {
			System.out.println("Obesidade");
		} else {
			System.out.println("Valor de IMC calculado é inválido");
		}
		
		entrada.close();

	}

}
