package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classifiable;

public class Episode implements Classifiable {
	
	private int number;
	private String name;
	private Series serie;
	private int totalViews;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Series getSerie() {
		return serie;
	}
	public void setSerie(Series serie) {
		this.serie = serie;
	}
	
	public int getTotalViews() {
		return totalViews;
	}
	public void setTotalViews(int totalViews) {
		this.totalViews = totalViews;
	}
	@Override
	public int getRanking() {
		if (totalViews > 100) {
			return 4;
		} else {
			return 2;
		}
	}

	
	
}
