package cap5;

public class Pessoa {
	
	String nome;
	int idade;
	char sexo;
	String estadoCivil;
	
	
	// este � um m�todo void, pois nao retornar� dados. S� executar� uma a�ao
	void setNome(String nome) {
		this.nome = nome;
	}
	
	// � necess�rio definir o tipo do retorno do m�todo. Neste caso � String
	String getNome() {
		return nome;
	}
	
	void setIdade(int idade) {
		this.idade = idade;
	}
	
	int getIdade() {
		return idade;
	}
	
	void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	char getSexo() {
		return sexo;
	}
	
	void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	String getEstadoCivil() {
		return estadoCivil;
	}
	
	void setDados(String nome, int idade, char sexo, String estadoCivil) {
		// poderia ser utilizado o this. mas desta maneira, estaria recriando o m�todo.
		// assim � poss�vel reaproveitar os Setters j� criados.
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setEstadoCivil(estadoCivil);
	}
	
	void mostrarDados(){
		System.out.println("Dados Inseridos");
		System.out.println("----------------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Estado Civil: " + getEstadoCivil());
	}

}
