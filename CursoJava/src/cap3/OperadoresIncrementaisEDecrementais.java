package cap3;

public class OperadoresIncrementaisEDecrementais {
	public static void main(String [] args) {
		
		int x = 3;
		System.out.println("Resultado pré-incremental: " + (++x + 2)); //aqui incremento +1 a x, antes da operaçao de soma e impressao
		System.out.println("Valor de x: " + x);
		
		x = 3;
		
		System.out.println("Resultado pós-incremental: " + (x++ + 2)); //aqui incremento depois da operaçao de soma e impressao
		System.out.println("Valor de x: " + x);
		
		System.out.println("--------------------------------------------------------------");
		
		x = 3;
		
		System.out.println("Resultado pré-decremental: " + (--x + 2));
		System.out.println("Valor de x: " + x);
		
		x = 3;
		
		System.out.println("Resultado pós-decremental: " + (x-- + 2));
		System.out.println("Valor de x: " + x );
		
	}

}
