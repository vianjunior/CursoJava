package cap7;

public class UsandoVarArgs {

	public static void main(String[] args) {
		
		System.out.println("Resultado: " + somar(1, 2, 3, 4, 5)); // com VarArgs é possível passar quantos elementos eu quiser.
		System.out.println("Resultado: " + somar(4, 2)); // quantas vezes eu quiser.
		System.out.println("Resultado: " + somar(10, 2, 4, 1)); // 

	}
	
	public static int somar(int ... inteiros) { // os ... simbolizam o uso de VarArgs
		int resultado = 0;
		for (int i : inteiros) {
			resultado += i;
		}
		return resultado;
	}
	
	// só é possível ter apenas 1 VarArgs em cada método
	// se o método receber atributos de tipos diferentes, o VarArgs deve ser o último parâmetro declarado
	/*
	 * ex: void setDados(int a, float b, double c, String d, int ... inteiros){ 
	 * 
	 * }
	 */
	// VarArgs pode ser usado em métodos e construtores

}
