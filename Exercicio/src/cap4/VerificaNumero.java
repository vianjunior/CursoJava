package cap4;

import java.util.Scanner;

public class VerificaNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		int resto;
		
		System.out.println("Informe o n�mero: ");
		numero = entrada.nextInt();
		
		System.out.println("N�mero Informado: " + numero);
		
		resto = numero % 2;
		
		switch(resto) {
		case 0:
			System.out.println("N�mero Par");
			break;
		
		default:
			System.out.println("N�mero �mpar");
			break;
		}
		
		entrada.close();

	}

}
