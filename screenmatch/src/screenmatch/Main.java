package screenmatch;

import br.com.alura.screenmatch.calculos.RecomendationFilter;
import br.com.alura.screenmatch.calculos.TimeCalculator;
import br.com.alura.screenmatch.modelos.Episode;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;

public class Main {
	public static void main(String[] args) {
				
		Movie movie1 = new Movie();
		movie1.setName("The Godfather");
		movie1.setIncluded(true);
		movie1.setYearOfRelease(1970);
		movie1.setDurationInMinutes(180);
		movie1.printTechnicalSheet();
		
		movie1.rate(8);
		movie1.rate(5);
		movie1.rate(10);
		System.out.println("Rating: " + movie1.getRating());
		System.out.println("Rating Count: " + movie1.getRatingCount());
		System.out.printf("Rating Average: " + movie1.ratingAverage(), "%2.f \n");
		
		
		Series serie1 = new Series();
		serie1.setName("Lost");
		serie1.setYearOfRelease(2000);
		
		serie1.setSeasons(10);
		serie1.setEpisodesPerSeason(10);
		serie1.setMinutesPerEpisode(50);
		serie1.printTechnicalSheet();
		
		System.out.println("Time to finish this serie: " + serie1.getDurationInMinutes() + " minutes.");
		
		TimeCalculator calculator = new TimeCalculator();
		calculator.include(movie1);
		calculator.include(serie1);
		System.out.println("You will need " + calculator.getTimeTotal() + " minutes to watch all the titles on your list.");
		
		RecomendationFilter filter = new RecomendationFilter();
		filter.filter(movie1);
		
		Episode episode = new Episode();
		episode.setNumber(1);
		episode.setSerie(serie1);
		episode.setTotalViews(300);
		filter.filter(episode);

	}
}
