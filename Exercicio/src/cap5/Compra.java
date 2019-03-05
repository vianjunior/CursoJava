package cap5;

public class Compra {

	private String nomeCliente;
	private double valorCompra;
	private double valorPagar;

	void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	String getNomeCliente() {
		return nomeCliente;
	}

	void setValorCompra(double valorCompra) {
		if (valorCompra >= 1000) {
			this.valorCompra = valorCompra;
		} else {
			System.out.println("O valor mínimo de compra é R$1000,00. Venda Encerrada.");;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.exit(0);
		}
	}

	double getValorCompra() {
		return valorCompra;
	}

	void setValorPagar(double valorCompra) {
		if (valorCompra == 1000) {
			this.valorPagar = valorCompra;
		} else if (valorCompra >= 1001 && valorCompra <= 3000) {
			this.valorPagar = valorCompra - (valorCompra * 0.05);
		} else {
			this.valorPagar = valorCompra - (valorCompra * 0.10);
		}
	}

	double getValorPagar() {
		return valorPagar;
	}

	void exibirValores() {
		System.out.println("Valores Inseridos");
		System.out.println("-------------------------");
		System.out.println("Nome Cliente: " + getNomeCliente());
		System.out.println("Valor da Compra: " + getValorCompra());
		System.out.println("Total com Desconto: " + getValorPagar());
	}

}
