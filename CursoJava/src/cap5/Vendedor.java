package cap5;

public class Vendedor {
	
	private static double premioEquipe = 100; //Vari�vel de classe. Relativa � todos os objetos da classe
	private double premioIndividual = 200; //vari�vel de inst�ncia. Relativa somente ao objeto.
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
		Vendedor.premioEquipe += premioEquipe; //Boa pr�tica, quando se trata de atributos est�ticos
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
		System.out.println("Pr�mio Equipe: " + getPremioEquipe());
		System.out.println("Pr�mio Individual: " + getPremioIndividual());
		System.out.println("============================");
	}

}
