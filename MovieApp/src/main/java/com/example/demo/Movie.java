package com.example.demo;

/* Authored by Brandon Ward as a RESTful API test for @Paytomorrow. 5/31 */
// Movie class, defines what a movie is and what composes it.

public class Movie {
	public Movie() {};
	
	private int id;
	private String title;
	private String director;
	
	public Movie(Integer id, String title, String director) {
		this.id = id;
		this.title = title;
		this.director = director;
	};
	
	public int getID() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "Movie [id: " + id + ", Title: " + title + ", Director: " + director + "]";
	}
}
