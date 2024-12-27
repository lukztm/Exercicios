package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classifiable;

public class Movie extends Title implements Classifiable{
	
	private String diretor;
	
	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getRanking() {
		return (int) getRating() / 2;
		
	}

}
