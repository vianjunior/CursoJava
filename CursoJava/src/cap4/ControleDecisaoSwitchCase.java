package cap4;


import java.util.Scanner;

public class ControleDecisaoSwitchCase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe uma vogal: ");
		char vogal = entrada.next().charAt(0);
		char vogalUper = Character.toUpperCase(vogal);
		
		switch (vogalUper) {
		case 'A':
			System.out.println("\"A\" de Avião");
			break;
		case 'E':
			System.out.println("\"E\" de Escola");
			break;
		case 'I':
			System.out.println("\"I\" de Indispensável");
			break;
		case 'O':
			System.out.println("\"O\" de Origem");
			break;
		case 'U':
			System.out.println("\"U\" de Urso");
			break;
		default:
			System.out.println("A letra informada não corresponde a uma vogal conhecida.");
		}
		
		entrada.close();
		
	}

}
