package cap5;

public class SobrecargaMetodos {
	
	// Sobrecarga: � poss�vel criar v�rios m�todos com o memso nome, desde que os atributos sejam diferentes.
	void exibirInformacao(String nome) {
		System.out.println("O nome �: " + nome);
	}
	
	void exibirInformacao(int idade) {
		System.out.println("A idade �: " + idade);
	}
	
	void exibirInformacao(char sexo) {
		System.out.println("O sexo �: " + sexo);
	}
	
	void exibirInformacao(String nome, String sobrenome) {
		System.out.println("Nome: " + nome + " " + "Sobrenome: " + sobrenome);
	}

}
