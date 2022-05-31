package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/* Authored by Brandon Ward as a RESTful API test for @Paytomorrow. 5/31 */
// Movies class to define movie functions for interacting with the Storage Arraylist.

public class Movies {
	
	private List<Movie> movieList;
	
	public List<Movie> getMovieList() {
		if (movieList == null) {
			movieList = new ArrayList<>();
		}
		
		return movieList;
	}
	
	public Movie getMovie(int id) {
		if (movieList == null) {
			movieList = new ArrayList<>();
		}
		
		return movieList.get(id-1);
	}
	
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	
	public void setMovie(int id, Movie movie) {
		movieList.set(id-1, movie);
	}
	
	public void delMovie(int id) {
		movieList.remove(id-1);
	}
}
