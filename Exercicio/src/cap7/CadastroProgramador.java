package cap7;

public class CadastroProgramador {

	public static void main(String[] args) {
		
		Programador arrayProgramadores[] = { new Programador("Junior", "Java", 5000.00),
				new Programador("Marcelo", "Python", 4500.00), new Programador("Félix", "Delphi", 4000.00) };
		
		for (Programador p : arrayProgramadores) {
			p.mostrarDados();
		}

	}

}
