package cap7;

public class Soma {

	public static void main(String[] args) {
		int soma = 0;
		int valor = 0;
		for (int i = 0; i < args.length; i++) {
			valor = Integer.parseInt(args[i]);
			soma += valor;
		}
		System.out.println("Soma: " + soma);

	}

}
