package com.example.demo;

import org.springframework.stereotype.Repository;

/* Authored by Brandon Ward as a RESTful API test for @Paytomorrow. 5/31 */
// Hard coded storage for movies. Usually when hooked to a backend, this is where the application
// communicates with the backend.

@Repository
public class MoviesStorage {
	private static Movies list = new Movies();
	
	static {
		list.getMovieList().add(new Movie(
				1, "Tron", "Joseph Kosinski"));
		list.getMovieList().add(new Movie(
				2, "Friday The 13th", "Sean S Cunningham"));
		list.getMovieList().add(new Movie(
				3, "Halloween", "John Carpenter"));
		list.getMovieList().add(new Movie(
				4, "The Intern", "Nancy Meyers"));
		list.getMovieList().add(new Movie(
				5, "Legally Blonde", "Robert Luketic"));
		list.getMovieList().add(new Movie(
				6, "Star Wars: A New Hope", "George Lucas"));
		list.getMovieList().add(new Movie(
				7, "Star Trek", "J.J. Abrams"));
		list.getMovieList().add(new Movie(
				8, "Draft Day", "Ivan Reitman"));
		list.getMovieList().add(new Movie(
				9, "Mrs. Doubtfire", "Chris Columbus"));
		list.getMovieList().add(new Movie(
				10, "Three Amigos", "John Landis"));
	}
	
	public Movies getAllMovies() {
		return list;
	}
	
	public Movie getMovie(int id) {
		return list.getMovie(id);
	}
	
	public void addMovie(Movie movie) {
		list.getMovieList().add(movie);
	}
	
	public void changeMovie(int id, Movie movie) {
		list.setMovie(id, movie);
	}
	
	public void deleteMovie(int id) {
		list.delMovie(id);
	}
}
