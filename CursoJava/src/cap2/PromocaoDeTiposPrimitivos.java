package cap2;

public class PromocaoDeTiposPrimitivos {

	public static void main(String[] args) {
		byte b = 10;
		short s = b;
		System.out.println("Valor de S = " + s);
		
		//----------------------------------------------
		
		// uma vari�vel byte n�o poderia receber um valor short, pois byte � menor que short.
		// neste caso, � necess�rio for�ar com um (byte) antes da vari�vel que est� sendo atribu�da
		// isto se chama Promo��o por Coer��o, ou typecast expl�cito
		short ss = 12;
		byte bb = (byte)ss;
		
		System.out.println("Valor de BB = " + bb);

	}

}
