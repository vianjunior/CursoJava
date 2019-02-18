package cap3;

public class Compra {
	public static void main(String[] args) {
		double valor = 1000;
		
		double valorDesconto = (valor <= 1000 ? 0 : (valor >= 1001 && valor <= 3000 ? 5 : 10));
		System.out.println("Valor Original: " + valor);
		System.out.println("Valor com Desconto : " + (valor - ((valor * valorDesconto) / 100)));
	}

}
