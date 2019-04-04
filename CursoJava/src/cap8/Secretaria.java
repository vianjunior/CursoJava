package cap8;

public class Secretaria extends Funcionario{ // Herança
	
	private int nrSrt;
	private boolean linguaInglesa;
	
	public int getNrSrt() {
		return nrSrt;
	}
	public void setNrSrt(int nrSrt) {
		this.nrSrt = nrSrt;
	}
	public boolean isLinguaInglesa() {
		return linguaInglesa;
	}
	public void setLinguaInglesa(boolean linguaInglesa) {
		this.linguaInglesa = linguaInglesa;
	}
	
	public void atenderTelefone() {
		System.out.println("Atendendo ao telefone");
	}

}
