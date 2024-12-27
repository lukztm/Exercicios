package br.com.alura.screenmatch.calculos;

public class RecomendationFilter {
	
	public void filter(Classifiable classifiable) {
		if (classifiable.getRanking() >= 4) {
			System.out.println("This movie is one of the most watched now.");
		} else if (classifiable.getRanking() >= 2){
			System.out.println("Good rate.");
		} else {
			System.out.println("Watch later.");
		}
	}

}
