package cap5;

public class Cachorro {
	
	String nome;
	String raca;
	int idade;
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	String getNome() {
		return nome;
	}
	
	void setRaca(String raca) {
		this.raca = raca;
	}
	
	String getRaca() {
		return raca;
	}
	
	void setIdade(int idade) {
		this.idade = idade;
	}
	
	int getIdade() {
		return idade;
	}
	
	void exibirDados() {
		System.out.println("Dados Inseridos");
		System.out.println("-------------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Raça: " + getRaca());
		System.out.println("Idade: " + getIdade());
	}

}
