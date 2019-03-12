// TAMB�M CONHECIDO COMO FOR EACH

package cap7;

public class ForAprimorado {

	public static void main(String[] args) {
		
		Pessoa guardaPessoa [] = {new Pessoa(), new Pessoa(), new Pessoa(), new Pessoa()};
		
		guardaPessoa[0].setNome("Altair");
		guardaPessoa[1].setNome("Ellen");
		guardaPessoa[2].setNome("Paulo");
		guardaPessoa[3].setNome("Dayane");
		
		
		int numeros [] = {10, 20, 30, 40, 50, 60};
		// exemplos de FOR aprimorado para percorrer um array ou cole��o de dados
		// onde: int n(DECLARA��O) � a declara��o da vari�vel que vai receber os elementos do array ou conjunto
		//       e numeros(EXPRESS�O) ser� o conjunto ou array que ser� percorrido
		for(int n : numeros) { 
			System.out.print(n + " ");
		}
		
		System.out.println("");
		
		String nomes [] = {"Junior", "Marcelo", "Douglas", "Bruno", "Denise"};
		for (String n : nomes) {
			System.out.print(n + " ");
		}
		
		System.out.println(" ");
		
		// FOR aprimorado para percorrer array do tipo Pessoa
		for (Pessoa p : guardaPessoa) {
			p.mostrarDados();
		}
		
		//array multidimensional (matriz)
		String municipios [] [] = {
				{"Videira", "Fraiburgo"},
				{"Treze T�lias", "Ca�ador"},
				{"Joa�aba", "Tangar�"},
				{"Luzerna", "Piratuba"}
		};
		
		//FOR aprimorado para percorrer uma matriz.
		for (String [] m : municipios) { //para cada Array do tipo String (alias m) dentro de municipios
			for(String m2: m) { // para cada String (alias m2) dentro de m(Array do tipo String FOR principal)
				System.out.print(m2 + " "); // imprima m2(cada String dentro do Array do tipo String do FOR principal)
			}
		}

	}

}
