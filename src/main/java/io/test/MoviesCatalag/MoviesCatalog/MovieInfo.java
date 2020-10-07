package io.test.MoviesCatalag.MoviesCatalog;

import org.springframework.stereotype.Component;

@Component
public class MovieInfo {

	public String movieId;
	public String movieName;
	public String movieDesc;
	
	public MovieInfo() {}
	public MovieInfo(String movieId, String movieName, String movieDesc) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDesc = movieDesc;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDesc() {
		return movieDesc;
	}
	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}
	
	

}
