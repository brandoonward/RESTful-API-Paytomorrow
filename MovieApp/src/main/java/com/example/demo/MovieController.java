package com.example.demo;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/* Authored by Brandon Ward as a RESTful API test for @Paytomorrow. 5/31 */
// REST Controller, where all GET, POST, PUT, and DELETE request logic is stored.

@RestController
@RequestMapping(path = "/movies")
public class MovieController {
	
	@Autowired
	private MoviesStorage movieStor;
	
	@GetMapping(path = "/", produces = "application/json")
	
	public Movies getMovies() {
		return movieStor.getAllMovies();
	}
	
	@GetMapping(path = "/{id}", produces = "application/json")
	Movie getSpecificMovie(@PathVariable int id) {

		return movieStor.getMovie(id);
	
	}
	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	
	public ResponseEntity<Object> addEmployee(@RequestBody Movie movie) {
		
		Integer id = movieStor.getAllMovies().getMovieList().size() + 1;
		
		movie.setID(id);
		movieStor.addMovie(movie);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(movie.getID()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping(path = "/{id}", produces = "application/json")
	public ResponseEntity<Object> editMovie(@PathVariable int id, @RequestBody Movie movie) {
		
		movieStor.changeMovie(id, movie);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(movie.getID()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping(path = "/{id}", produces = "application/json")
	public void delMovie(@PathVariable int id) {
		
		movieStor.deleteMovie(id);
		
	}
}
