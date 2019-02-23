package cap5;

public class Pessoa {
	
	String nome;
	int idade;
	char sexo;
	boolean estadoCivil;
	
	
	// este é um método void, pois nao retornará dados. Só executará uma açao
	void guardarNome(String n) {
		nome = n;
	}
	
	// é necessário definir o tipo do retorno do método. Neste caso é String
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
