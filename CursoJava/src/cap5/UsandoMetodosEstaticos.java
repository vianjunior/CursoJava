package cap5;

public class UsandoMetodosEstaticos {

	public static void main(String[] args) {
		
		// MetodosEstaticos m = new MetodosEstaticos(); A criação de métodos estáticos, dispensa a instância de objeto
		// pois, ao ser instanciado, o método / atributo passa a pertencer à classe num geral.
		// desta maneira, trocamos o objeto pelo próprio nome da classe.
		
		MetodosEstaticos.exibirInformacao("Junior");
		MetodosEstaticos.exibirInformacao(24);
		MetodosEstaticos.exibirInformacao(true);

	}

}
