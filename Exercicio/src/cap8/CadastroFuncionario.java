package cap8;

public class CadastroFuncionario {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		Motorista m = new Motorista();
		Secretaria s = new Secretaria();
		Programador p = new Programador();
		
		f.setNome("Pedro");
		f.setIdade(24);
		f.setSalario(2000);
		
		System.out.println("Nome: " + f.getNome());
		System.out.println("Idade: " + f.getIdade());
		System.out.println("Sal�rio: " + f.getSalario());
		f.reajustarSalario(3000);
		System.out.println("Novo Sal�rio: " + f.getSalario());
		
		System.out.println("--------------------------------");
		
		m.setNome("M�rcia");
		m.setIdade(32);
		m.setSalario(1850);
		m.setNrCNH(425145241);
		m.setTempoDeExperiencia(3);
		
		System.out.println("Nome: " + m.getNome());
		System.out.println("Idade: " + m.getIdade());
		System.out.println("Sal�rio: " + m.getSalario());
		System.out.println("Experi�ncia: " + m.getTempoDeExperiencia() + " anos");
		m.dirigir();
		m.reajustarSalario(2100);
		System.out.println("Novo Sal�rio: " + m.getSalario());
		
		System.out.println("--------------------------------");
		
		s.setNome("Roberto");
		s.setIdade(32);
		s.setSalario(1900);
		s.setLinguaInglesa(true);
		s.setNrSrt(12);
		
		System.out.println("Nome: " + s.getNome());
		System.out.println("Idade: " + s.getIdade());
		System.out.println("Sal�rio: " + s.getSalario());
		System.out.println("Lingua estrangeira: " + s.isLinguaInglesa());
		s.atenderTelefone();
		s.reajustarSalario(2250);
		System.out.println("Novo Sal�rio: " + s.getSalario());
		
		System.out.println("--------------------------------");
		
		p.setNome("Junior");
		p.setIdade(24);
		p.setSalario(3000);
		p.setLinguagem("Java");
		
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
		System.out.println("Sal�rio: " + p.getSalario());
		System.out.println("Linguagem de Programa��o: " + p.getLinguagem());
		p.reajustarSalario(4000);
		System.out.println("Novo Sal�rio: " + p.getSalario());

	}

}
