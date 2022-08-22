package com.mkj.movieapp.catalog.model;

public class Catalog {

	private int userId;
	private int movieId;
	public Catalog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Catalog(int userId, int movieId) {
		super();
		this.userId = userId;
		this.movieId = movieId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	@Override
	public String toString() {
		return "Catalog [userId=" + userId + ", movieId=" + movieId + "]";
	}
	
	
}
