package com.mkj.movieapp.movie.model;

import org.springframework.stereotype.Component;

@Component
public class Review {

	private int movieId;
	private int userId;
	private float rating;
	private String comment;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(int movieId, int userId, float rating, String comment) {
		super();
		this.movieId = movieId;
		this.userId = userId;
		this.rating = rating;
		this.comment = comment;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Review [movieId=" + movieId + ", userId=" + userId + ", rating=" + rating + ", comment=" + comment
				+ "]";
	}
	
	
	
}
