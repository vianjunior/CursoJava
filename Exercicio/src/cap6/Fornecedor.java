package cap6;

public class Fornecedor {
	
	private String nome;
	private String telefone;
	private String endereco;
	private String tipoProduto;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTipoProduto() {
		return tipoProduto;
	}
	
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	//construtores
	public Fornecedor(String nome, String telefone){
		setNome(nome);
		setTelefone(telefone);
	}
	
	public Fornecedor(String nome, String telefone, String tipoProduto){
		setNome(nome);
		setTelefone(telefone);
		setTipoProduto(tipoProduto);
	}
	
	public Fornecedor(String nome, String telefone, String endereco, String tipoProduto){
		setNome(nome);
		setTelefone(telefone);
		setEndereco(endereco);
		setTipoProduto(tipoProduto);
	}
	
	//quando existem construtores personalizados, 
	//e eu quero instanciar um objeto sem vincular ele a um construtor específico
	//devo criar outro construtor sem parâmetros
	public Fornecedor() {}
	
	public void mostrarDados() {
		System.out.println("Dados Inseridos");
		System.out.println("--------------------------");
		System.out.println("Nome Fornecedor: " + getNome());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Endereço: " + getEndereco());
		System.out.println("Tipo Produto: " + getTipoProduto());
		System.out.println("==========================");
	}
	

}
