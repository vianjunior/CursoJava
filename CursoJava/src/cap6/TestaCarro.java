package cap6;

public class TestaCarro {

	public static void main(String[] args) {
		
		// Aqui j� instancio um objeto de Carro passando o valor de cada atributo por par�metro
		// E o construtor personalizado da classe Carro j� monta.
		Carro c = new Carro("Renault", "Sandero", 2011, "Branco", 4);
		c.exibirDados();
		c.movimento(100);

	}

}
