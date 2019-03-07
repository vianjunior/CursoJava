package cap5;

public class Cores {

	public static void main(String[] args) {
		
		
		// este código deve ser executado pelo cmd. Para isto, deve-se entrar na pasta do projeto\bin
		// rodar o comando java nomeDoPacote.nomeDaClasse(Nome explícito) e passar as cores com espaço, neste caso.
		// java cap5.Cores Branco Vermelho Preto Azul Amarelo Verde Cinza
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}

}
