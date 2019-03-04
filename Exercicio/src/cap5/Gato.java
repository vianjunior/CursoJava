package cap5;

public class Gato {

	private String nome;
	private String raca;
	private int idade;
	private String alimentacao;
	private boolean vacina;
	
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
	
	void setAlimentacao() {
		if (getIdade() <= 1) {
			this.alimentacao = "8 vezes ao dia";
		}else if(getIdade() < 8) {
			this.alimentacao = "6 vezes ao dia";
		}else {
			this.alimentacao = "3 vezes ao dia";
		}
	}
	
	String getAlimentacao() {
		return alimentacao;
	}
	
	void setVacina(boolean vacina) {
		this.vacina = vacina;
	}
	
	boolean getVacina() {
		return vacina;
	}
	
	void exibirDados() {
		System.out.println("Dados Inseridos");
		System.out.println("--------------------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Raça: " + getRaca());
		System.out.println("Idade: " + getIdade());
		System.out.println("Alimentação: " + getAlimentacao());
		System.out.println("======================================");
	}
	
	void exibirDados(boolean vacina) {
		if (vacina) {
			System.out.println(getNome() + " está com a vacina em dia.");
			System.out.println("=====================================");
		} else {
			System.out.println(getNome() + " precisa ser vacinado.");
			System.out.println("=====================================");
		}
	}

}
