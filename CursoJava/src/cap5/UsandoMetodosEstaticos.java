package cap5;

public class UsandoMetodosEstaticos {

	public static void main(String[] args) {
		
		// MetodosEstaticos m = new MetodosEstaticos(); A cria��o de m�todos est�ticos, dispensa a inst�ncia de objeto
		// pois, ao ser instanciado, o m�todo / atributo passa a pertencer � classe num geral.
		// desta maneira, trocamos o objeto pelo pr�prio nome da classe.
		
		MetodosEstaticos.exibirInformacao("Junior");
		MetodosEstaticos.exibirInformacao(24);
		MetodosEstaticos.exibirInformacao(true);

	}

}
