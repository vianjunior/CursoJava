package cap3;

import java.util.Scanner;

public class UsandoScanner {

	public static void main(String[] args) {
		
		Scanner numeros = new Scanner(System.in);
		double resultado;
		
		System.out.println("Informe o primeiro n�mero: ");
		double num1 = numeros.nextDouble();
		
		System.out.println("Informe o segundo n�mero: ");
		double num2 = numeros.nextDouble();
		
		resultado = num1 + num2;
		
		System.out.println("A soma dos dois n�meros informados �: " + resultado);

	}

}
