package cap5;

public class Vendedor {
	
	private static double premioEquipe = 100; //Variável de classe. Relativa à todos os objetos da classe
	private double premioIndividual = 200; //variável de instância. Relativa somente ao objeto.
	String nome;
	
	String getNome() {
		return nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	double getPremioEquipe() {
		return premioEquipe;
	}
	
	void setPremioEquipe(double premioEquipe) {
		Vendedor.premioEquipe += premioEquipe; //Boa prática, quando se trata de atributos estáticos
	}
	
	double getPremioIndividual() {
		return premioIndividual;
	}
	
	void setPremioIndividual(double premioIndividual) {
		this.premioIndividual += premioIndividual;
	}
	
	void mostraDados() {
		System.out.println("Dados Inseridos: ");
		System.out.println("----------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Prêmio Equipe: " + getPremioEquipe());
		System.out.println("Prêmio Individual: " + getPremioIndividual());
		System.out.println("============================");
	}

}
