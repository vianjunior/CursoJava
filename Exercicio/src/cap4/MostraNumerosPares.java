package cap4;

public class MostraNumerosPares {

	public static void main(String[] args) {
		
		int i;
		
		for (i = 1; i <= 100; i++) {
			int resto = i % 2;
			
			switch(resto) {
			case 0 :
				System.out.println(i);
				break;
			}
		}

	}

}
