package cap5;

public class Cores {

	public static void main(String[] args) {
		
		
		// este c�digo deve ser executado pelo cmd. Para isto, deve-se entrar na pasta do projeto\bin
		// rodar o comando java nomeDoPacote.nomeDaClasse(Nome expl�cito) e passar as cores com espa�o, neste caso.
		// java cap5.Cores Branco Vermelho Preto Azul Amarelo Verde Cinza
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}

}
