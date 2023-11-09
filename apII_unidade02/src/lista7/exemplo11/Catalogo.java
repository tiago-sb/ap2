package lista7.exemplo11;

import java.util.ArrayList;
public class Catalogo {
	ArrayList<Restaurante> restaurantes = new ArrayList<>();
	
	public void adicionarRestaurante(Restaurante restaurante) {
		if(restaurante.getNomeRestaurante() != null && restaurante.getNomeRestaurante().length() >= 1) {
			restaurantes.add(restaurante);
		}
	}
	public void listarRestaurante() {
		for(Restaurante restaurante : restaurantes) {
			System.out.println(restaurante.toString());
		}
	}
	public void listagemTipoAlimento(String tipoAlimento) {
		System.out.println("restaurantes que vendem " + tipoAlimento + ": ");
		for(Restaurante restaurante : restaurantes) {
			if(restaurante.getTipoComida() == tipoAlimento) {
				System.out.println(restaurante.toString());
			}
		}
	}
}
