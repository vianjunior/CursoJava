package cap7;

public class Calculo {
	
	public static double somar(double ... numeros) {
		double resultado = 0;
		for(double n : numeros) {
			resultado += n;
		}
		return resultado;
	}

}
