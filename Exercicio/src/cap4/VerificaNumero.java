package cap4;

import java.util.Scanner;

public class VerificaNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		int resto;
		
		System.out.println("Informe o número: ");
		numero = entrada.nextInt();
		
		System.out.println("Número Informado: " + numero);
		
		resto = numero % 2;
		
		switch(resto) {
		case 0:
			System.out.println("Número Par");
			break;
		
		default:
			System.out.println("Número Ímpar");
			break;
		}
		
		entrada.close();

	}

}
