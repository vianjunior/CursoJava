package cap3;

public class OperadoresIncrementaisEDecrementais {
	public static void main(String [] args) {
		
		int x = 3;
		System.out.println("Resultado pr�-incremental: " + (++x + 2)); //aqui incremento +1 a x, antes da opera�ao de soma e impressao
		System.out.println("Valor de x: " + x);
		
		x = 3;
		
		System.out.println("Resultado p�s-incremental: " + (x++ + 2)); //aqui incremento depois da opera�ao de soma e impressao
		System.out.println("Valor de x: " + x);
		
		System.out.println("--------------------------------------------------------------");
		
		x = 3;
		
		System.out.println("Resultado pr�-decremental: " + (--x + 2));
		System.out.println("Valor de x: " + x);
		
		x = 3;
		
		System.out.println("Resultado p�s-decremental: " + (x-- + 2));
		System.out.println("Valor de x: " + x );
		
	}

}
