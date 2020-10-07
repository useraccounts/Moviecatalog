package io.test.MoviesCatalag.MoviesCatalog;

public class Movie {

	public String movieName;
	public String rating;
	public String movieId;
	public Movie(String movieName, String rating, String movieId) {
		this.movieName = movieName;
		this.rating = rating;
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
	
}
