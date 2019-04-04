package cap8;

public class Pessoa {
	
	private String nome;
	private int idade;
	private char sexo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String toString() { //reescrevemos a classe toString, do Java.lang para mostrar o valor de cada atributo do objeto.
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + getSexo();
	}
	

}
