package cap2;

public class EscopoDeVariaveis {
	public static void main(String[] args) {
		String nome = "Junior";
		int idade = 24;
		
		{ //inicio de um escopo / bloco de codigo
			char sexo = 'M';
			System.out.println("Nome = " + nome);
			System.out.println("Idade = " + idade);
			System.out.println("Sexo = " + sexo);
		}
		
		// System.out.println("Sexo = " + sexo); variável declada dentro de um escopo, não pode ser usada fora dele
	}

}
