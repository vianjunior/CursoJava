package cap8;

public class Motorista extends Funcionario{
	
	private int nrCNH;
	private int tempoDeExperiencia;
	
	public int getNrCNH() {
		return nrCNH;
	}
	public void setNrCNH(int nrCNH) {
		this.nrCNH = nrCNH;
	}
	public int getTempoDeExperiencia() {
		return tempoDeExperiencia;
	}
	public void setTempoDeExperiencia(int tempoDeExperiencia) {
		this.tempoDeExperiencia = tempoDeExperiencia;
	}
	
	public void dirigir() {
		System.out.println("Dirigindo...");
	}

}
