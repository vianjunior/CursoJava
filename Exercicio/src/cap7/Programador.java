package cap7;

public class Programador {
	
	private String nome;
	private String linguagem;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	Programador(){}
	
	Programador(String nome, String linguagem, double salario){
		setNome(nome);
		setLinguagem(linguagem);
		setSalario(salario);
	}
	
	public void mostrarDados() {
		System.out.println("Nome do programador: " + getNome());
		System.out.println("Linguagem de programação: " + getLinguagem());
		System.out.println("Remuneração: " + getSalario());
		System.out.println("----------------------------------");
	}
	
	

}
