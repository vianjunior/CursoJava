package cap7;

public class ArrayAnonimo {
	
	public static void main(String[] args) {
		
		System.out.println(somar(1, 2, 3));
		System.out.println(somar(new double [] {4, 5, 6})); // este é um uso de array anônimo para passagem de atributos

	}
	
	static double somar(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}
	
	// método que vai receber um array anônimo como parâmetro
	static double somar(double numeros []) {
		int recebe = 0;
		for (double n : numeros) {
			recebe += n;
		}
		return recebe;
	}
	
	// Lembrando que o STATIC dispensa a instância do objeto da classe. 
	// Por isso é possível chamar os métodos diretamente.

}
