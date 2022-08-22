package com.mkj.movieapp.movie.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	private int id;
	private String name;
	private int starRaiting;
	private List<Review> movieReview;
	
	public Movie(int id, String name, int starRaiting) {
		super();
		this.id = id;
		this.name = name;
		this.starRaiting = starRaiting;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Review> getMovieReview() {
		return movieReview;
	}
	public void setMovieReview(List<Review> movieReview) {
		this.movieReview = movieReview;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStarRaiting() {
		return starRaiting;
	}
	public void setStarRaiting(int starRaiting) {
		this.starRaiting = starRaiting;
	}
	
	

}
