package cap8;

public class Programador extends Funcionario{
	
	String linguagem;

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	public void reajustarSalario(double novoSalario) { // aqui existe um override de m�doto da classe pai. Exemplo de Polimorfismo
		setSalario(novoSalario + 200);
		// o cabe�alho do m�todo � o mesmo, por�m a opera�ao � diferente.
		
	}

}
