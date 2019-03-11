package cap7;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		String cidades [] [] = new String [3] [2];
		
		cidades [0] [0] = "São Paulo";
		cidades [0] [1] = "Curitiba";
		cidades [1] [0] = "Florianópolis";
		cidades [1] [1] = "Blumenau";
		cidades [2] [0] = "Itajaí";
		cidades [2] [1] = "Videira";
		
		for (int i = 0; i < cidades.length; i++) {
			for (int j = 0; j < cidades[i].length; j++) { //cidades[i].length para percorrer somente o tamanho do array principal
				System.out.println(cidades[i][j]);
			}
		}
		
		String municipios [] [] = {
				{"Videira", "Fraiburgo"},
				{"Treze Tílias", "Caçador"},
				{"Joaçaba", "Tangará"},
				{"Luzerna", "Piratuba"}
		};
		
		for (int i = 0; i < municipios.length; i++) {
			for (int j = 0; j < municipios[i].length; j++) {
				System.out.println(municipios[i][j]);
			}
		}
		
	}

}
