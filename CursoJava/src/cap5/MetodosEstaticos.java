package cap5;

public class MetodosEstaticos {
	
	static void exibirInformacao(String nome) {
		System.out.println("Nome: "  + nome);
	}
	
	static void exibirInformacao(int idade) {
		System.out.println("Idade: " + idade);
	}
	
	static void exibirInformacao(boolean estadoCivil) {
		if (estadoCivil) {
			System.out.println("Estado civil: Solteiro");
		} else {
			System.out.println("Estado civil: Casado");
		}
	}

}
