package cap5;

public class SobrecargaMetodos {
	
	// Sobrecarga: é possível criar vários métodos com o memso nome, desde que os atributos sejam diferentes.
	void exibirInformacao(String nome) {
		System.out.println("O nome é: " + nome);
	}
	
	void exibirInformacao(int idade) {
		System.out.println("A idade é: " + idade);
	}
	
	void exibirInformacao(char sexo) {
		System.out.println("O sexo é: " + sexo);
	}
	
	void exibirInformacao(String nome, String sobrenome) {
		System.out.println("Nome: " + nome + " " + "Sobrenome: " + sobrenome);
	}

}
