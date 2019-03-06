package cap5;

public class GerandoVendas {

	public static void main(String[] args) {
		
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();
		Vendedor v3 = new Vendedor();
		
		v1.setNome("João");
		v2.setNome("Maria");
		
		v1.mostraDados();
		v2.mostraDados();
		
		System.out.println("Vendedor João com valores Atribuídos");
		v1.setPremioEquipe(250); //Qualquer atribuição à uma variável estática, irá influenciar em todos os objetos.
		v1.setPremioIndividual(250);
		v1.mostraDados();
		
		System.out.println("Criando o objeto V3 e testando variável de classe");
		
		v3.setNome("Juari");
		v3.setPremioEquipe(-300); //Qualquer atribuição à uma variável estática, irá influenciar em todos os objetos.
		v3.setPremioIndividual(500);
		
		v1.mostraDados();
		v2.mostraDados();
		v3.mostraDados();

	}

}
