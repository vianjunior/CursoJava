package cap2;

public class PromocaoDeTiposPrimitivos {

	public static void main(String[] args) {
		byte b = 10;
		short s = b;
		System.out.println("Valor de S = " + s);
		
		//----------------------------------------------
		
		// uma variável byte não poderia receber um valor short, pois byte é menor que short.
		// neste caso, é necessário forçar com um (byte) antes da variável que está sendo atribuída
		// isto se chama Promoção por Coerção, ou typecast explícito
		short ss = 12;
		byte bb = (byte)ss;
		
		System.out.println("Valor de BB = " + bb);

	}

}
