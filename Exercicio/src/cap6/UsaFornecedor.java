package cap6;

public class UsaFornecedor {

	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor("Metasis LTDA", "(49) 3566 - 7417");
		Fornecedor f2 = new Fornecedor("InfoTec", "(49) 3533 - 2014", "Tecnologia");
		Fornecedor f3 = new Fornecedor("TransPortes", "(49) 3535 - 4121", "Rio das Pedras", "Fretes");
		Fornecedor f4 = new Fornecedor(); //Este é o construtor sem parâmetros da classe Fornecedor
		
		f4.setNome("Fornecedor Teste");
		f4.setTipoProduto("Serviços");
		
		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados();
		f4.mostrarDados();
		
	}

}
