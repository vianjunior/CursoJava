package cap7;

public class Pessoa {
	
	private String nome;
	private double altura;
	private double peso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Altura: " + getAltura());
		System.out.println("Peso: " + getPeso());
	}	

}
