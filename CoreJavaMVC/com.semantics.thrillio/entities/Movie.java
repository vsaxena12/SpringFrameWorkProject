package entities;

public class Movie extends BookMarks{
	private int releaseyear;
	private String[] cast;
	private String[] directors;
	private String genre;
	private double IMDB;
	public int getReleaseyear() {
		return releaseyear;
	}
	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}
	public String[] getCast() {
		return cast;
	}
	public void setCast(String[] cast) {
		this.cast = cast;
	}
	public String[] getDirectors() {
		return directors;
	}
	public void setDirectors(String[] directors) {
		this.directors = directors;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getIMDB() {
		return IMDB;
	}
	public void setIMDB(double iMDB) {
		IMDB = iMDB;
	}
	
}
