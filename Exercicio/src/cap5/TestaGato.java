package cap5;

public class TestaGato {

	public static void main(String[] args) {
		
		Gato g = new Gato();
		Gato g2 = new Gato();
		
		g.setNome("Félix");
		g.setRaca("Siamês");
		g.setIdade(5);
		g.setAlimentacao(g.getIdade());
		g.setVacina(true);
		
		g2.setNome("Patinhas");
		g2.setRaca("Angorá");
		g2.setIdade(1);
		g2.setAlimentacao(g2.getIdade());
		g2.setVacina(false);
		
		g.exibirDados();
		g.exibirDados(g.getVacina());
		
		g2.exibirDados();
		g2.exibirDados(g2.getVacina());

	}

}
