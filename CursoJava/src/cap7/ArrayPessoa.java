package cap7;

public class ArrayPessoa {

	public static void main(String[] args) {
		
		// método tradicional
		Pessoa guardaPessoa [] = new Pessoa[3];
		
		guardaPessoa[0] = new Pessoa();
		guardaPessoa[1] = new Pessoa();
		guardaPessoa[2] = new Pessoa();
		
		guardaPessoa[0].setNome("Junior");
		guardaPessoa[1].setNome("Anderson");
		guardaPessoa[2].setNome("Guilherme");
		
		for(int i = 0; i < guardaPessoa.length; i++) {
			System.out.println(guardaPessoa[i].getNome());
		}
		
		//método simplificado
		
		Pessoa guardaPessoa2 [] = {new Pessoa(), new Pessoa(), new Pessoa(), new Pessoa()};
		
		guardaPessoa2[0].setNome("Altair");
		guardaPessoa2[1].setNome("Ellen");
		guardaPessoa2[2].setNome("Paulo");
		guardaPessoa2[3].setNome("Dayane");
		
		for(int i = 0; i < guardaPessoa2.length; i++) {
			System.out.print(guardaPessoa2[i].getNome() + " ");
		}

	}

}
