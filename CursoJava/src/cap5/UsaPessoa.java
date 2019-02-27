package cap5;

import java.util.Scanner;

public class UsaPessoa {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		/*
		 * System.out.println(p); System.out.println(p.nome);
		 * System.out.println(p.idade); System.out.println(p.sexo);
		 * System.out.println(p.estadoCivil); // quando os atributos nao possuem
		 * valores, o compilador mostra o retorno padrao de cada um.
		 * 
		 * p.nome = "Junior"; p.idade = 24; p.sexo = 'M'; p.estadoCivil = "Solteiro";
		 * 
		 * System.out.println(p); System.out.println(p.nome);
		 * System.out.println(p.idade); System.out.println(p.sexo);
		 * System.out.println(p.estadoCivil);
		 */
		
		
		// usando metodos para acessar os atributos da classe
		
		/*
		 * System.out.println("Informe seu nome:"); p.setNome(entrada.next());
		 * System.out.println("Informe sua idade:"); p.setIdade(entrada.nextInt());
		 * System.out.println("Informe seu sexo:"); p.setSexo(entrada.next().charAt(0));
		 * System.out.println("Informe seu estado civil");
		 * p.setEstadoCivil(entrada.next()); entrada.close();
		 * 
		 * System.out.println("**********************************");
		 */
		
		/*
		 * System.out.println("Nome: " + p.getNome()); System.out.println("Idade: " +
		 * p.getIdade()); System.out.println("Sexo: " + p.getSexo());
		 * System.out.println("Estado Civil: " + p.getEstadoCivil());
		 */
		
		p.setDados("Bruna", 24, 'F', "Solteira");
		
		p.mostrarDados();
		
		entrada.close();
		
	}

}
