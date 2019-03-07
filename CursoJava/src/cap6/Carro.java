package cap6;

public class Carro {

	String fabricante;
	String modelo;
	int ano;
	String cor;
	int nrPortas;
	
	// exemplo de construtor personalizado. Já passo os parâmetros e invoco os métodos dos atributos.
	// O construtor deve ser criado com o mesmo nome da classe.
	// Nota: Construtor não é método, portanto não possui retorno
	Carro(String fabricante, String modelo, int ano, String cor, int nPortas){
		setFabricante(fabricante);
		setModelo(modelo);
		setAno(ano);
		setCor(cor);
		setNrPortas(nPortas);
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNrPortas() {
		return nrPortas;
	}

	public void setNrPortas(int nrPortas) {
		this.nrPortas = nrPortas;
	}

	void movimento(double velocidade) {
		System.out.println("O carro está se movendo à volocidade de " + velocidade + " Km/h");
	}
	
	void exibirDados() {
		System.out.println("-------------------------");
		System.out.println("Dados inseridos");
		System.out.println("Fabricante: " + getFabricante());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Cor: " + getCor());
		System.out.println("Número de Portas: " + getNrPortas());
	}

}
