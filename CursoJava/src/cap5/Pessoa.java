package cap5;

public class Pessoa {
	
	String nome;
	int idade;
	char sexo;
	boolean estadoCivil;
	
	
	// este � um m�todo void, pois nao retornar� dados. S� executar� uma a�ao
	void guardarNome(String n) {
		nome = n;
	}
	
	// � necess�rio definir o tipo do retorno do m�todo. Neste caso � String
	String retornarNome() {
		return nome;
	}
	
	void guardarIdade(int i) {
		idade = i;
	}
	
	int retornarIdade() {
		return idade;
	}
	
	void guardarSexo(char s) {
		sexo = s;
	}
	
	char retornarSexo() {
		return sexo;
	}
	
	void guardarEstadoCivil(boolean estC) {
		estadoCivil = estC;
	}
	
	boolean retornarEstadoCivil() {
		return estadoCivil;
	}

}
