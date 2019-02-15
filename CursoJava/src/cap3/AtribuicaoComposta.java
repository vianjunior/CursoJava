package cap3;

public class AtribuicaoComposta {

	public static void main(String[] args) {
		
		int x = 12;
		x = x + 4; //Sem atribuição composta
		System.out.println(x);
		
		// Soma-------------------------------------
		x += 5; //Atribuição composta
		
		System.out.println(x);
		
		// Subtracao--------------------------------
		x -= 3;
		
		System.out.println(x);
		
		// Divisao----------------------------------
		x /= 4;
		
		System.out.println(x);
		
		//Multiplicacao-----------------------------
		x *= 10;
		
		System.out.println(x);

	}

}
