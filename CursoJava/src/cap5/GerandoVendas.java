package cap5;

public class GerandoVendas {

	public static void main(String[] args) {
		
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();
		Vendedor v3 = new Vendedor();
		
		v1.setNome("Jo�o");
		v2.setNome("Maria");
		
		v1.mostraDados();
		v2.mostraDados();
		
		System.out.println("Vendedor Jo�o com valores Atribu�dos");
		v1.setPremioEquipe(250); //Qualquer atribui��o � uma vari�vel est�tica, ir� influenciar em todos os objetos.
		v1.setPremioIndividual(250);
		v1.mostraDados();
		
		System.out.println("Criando o objeto V3 e testando vari�vel de classe");
		
		v3.setNome("Juari");
		v3.setPremioEquipe(-300); //Qualquer atribui��o � uma vari�vel est�tica, ir� influenciar em todos os objetos.
		v3.setPremioIndividual(500);
		
		v1.mostraDados();
		v2.mostraDados();
		v3.mostraDados();

	}

}
