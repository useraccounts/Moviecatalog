package io.test.MoviesCatalag.MoviesCatalog;

public class MovieRating {

	public String movieId;
	public float rating;
	public MovieRating(String movieId, float rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
}
