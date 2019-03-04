package cap5;

public class TestaCalculo {

	public static void main(String[] args) {
		
		Calculo c = new Calculo();
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(c.somar(num1, num2));
		System.out.println(c.subtrair(num1, num2));
		System.out.println(c.multiplicar(num1, num2));
		System.out.println(c.dividir(num1, num2));

	}

}
