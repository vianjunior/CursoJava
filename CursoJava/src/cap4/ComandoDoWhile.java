package cap4;

public class ComandoDoWhile {
	public static void main(String[] args) {
		int i = 5;
		do {
			System.out.println(i + " � menor que 10");
			i++;
		} while (i < 10);
		
		// o do-while garante que a instru��o seja executada pelo menos uma vez, mesmo sendo falsa.
		// primeiro executa, depois valida.
		int j = 5;
		do {
			System.out.println(j + " � maior que 10");
			j++;
		} while (j > 10);
	}

}
