package cap8;

public class UsaPessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Junior");
		p.setIdade(24);
		p.setSexo('M');
		
		System.out.println(p); // Ao imprimir o alias do objeto, serão exibidos os atributos definidos no método toStrign
	}

}