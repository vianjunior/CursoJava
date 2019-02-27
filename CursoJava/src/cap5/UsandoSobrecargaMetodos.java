package cap5;

public class UsandoSobrecargaMetodos {
	
	public static void main(String[] args) {
		SobrecargaMetodos dados = new SobrecargaMetodos();
		
		dados.exibirInformacao("Junior");
		dados.exibirInformacao("Junior, ", "Vian");
		dados.exibirInformacao(24);
		dados.exibirInformacao('M');
		
	}

}
