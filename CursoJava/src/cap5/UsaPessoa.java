package cap5;

public class UsaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		System.out.println(p);
		System.out.println(p.nome);
		System.out.println(p.idade);
		System.out.println(p.sexo);
		System.out.println(p.estadoCivil);
		// quando os atributos nao possuem valores, o compilador mostra o retorno padrao de cada um.
		
		p.nome = "Junior";
		p.idade = 24;
		p.sexo = 'M';
		p.estadoCivil = false;
		
		System.out.println(p);
		System.out.println(p.nome);
		System.out.println(p.idade);
		System.out.println(p.sexo);
		System.out.println(p.estadoCivil);
		
		
		// usando metodos para acessar os atributos da classe
		
		Pessoa p2 = new Pessoa();
		
		p2.guardarNome("Juari");
		System.out.println("Nome: " + p2.retornarNome());
		
		p2.guardarIdade(24);
		System.out.println("Idade: " + p2.retornarIdade());
		
		p2.guardarSexo('M');
		System.out.println("Sexo: " + p2.retornarSexo());
		
		p2.guardarEstadoCivil(false);
		System.out.println("Estado Civil: " + p2.retornarEstadoCivil());
		
	}

}
