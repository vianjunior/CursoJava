package cap3;

public class OperadorTernario {

	public static void main(String[] args) {

		int x = 10, y = 2;

		String resultado = (x / y < 2 ? "Sim" : "Não");
		System.out.println(resultado);

		// ou
		System.out.println(x / y > 2 ? "Sim" : "Não");

	}

}
