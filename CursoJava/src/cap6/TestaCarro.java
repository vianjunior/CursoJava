package cap6;

public class TestaCarro {

	public static void main(String[] args) {
		
		// Aqui j� instancio um objeto de Carro passando o valor de cada atributo por par�metro
		// E o construtor personalizado da classe Carro j� monta.
		Carro c = new Carro("Renault", "Sandero", 2011, "Branco", 4);
		c.exibirDados();
		c.movimento(100);
		
		Carro c2 = new Carro("Peugeot", 2010, 4);
		Carro c3 = new Carro("Fiat", "Uno", 2002);
		Carro c4 = new Carro("Fiat", 2009);
		
		c2.exibirDados();
		c2.movimento(90);
		
		c3.exibirDados();
		c3.movimento(140);
		
		c4.exibirDados();
		c4.movimento(110);

	}

}
