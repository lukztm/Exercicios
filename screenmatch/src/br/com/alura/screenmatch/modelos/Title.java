package br.com.alura.screenmatch.modelos;

public class Title {

	private String name;
	private int yearOfRelease;
	private boolean included;
	private double rating;
	private int ratingCount;
	private int durationInMinutes;
	
	public int getRatingCount() {
		return ratingCount;
	}
	
	public double getRating() {
		return rating;
	}
	
	public int getDurationInMinutes() {
		return durationInMinutes;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIncluded(boolean included) {
		this.included = included;
	}
	
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	
	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	
	public void printTechnicalSheet() {
		System.out.println("Name: " + name);
		System.out.println("Released: " + yearOfRelease);
		System.out.println("Duration in minutes: " + getDurationInMinutes() + " minutes");
	}
	
	public void rate(double grade) {
		rating += grade; 
		ratingCount ++;
	}
	
	public double ratingAverage() {
		return rating / ratingCount;
	}
	
}
