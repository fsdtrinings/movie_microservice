package com.mkj.movieapp.review.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mkj.movieapp.review.model.Review;

@Component
public class ReviewDB {
	
	List<Review> allReviews = new ArrayList<>();
	
	public ReviewDB() {
	
		allReviews = FileReadingService.allReviews;
	}

	public List<Review> getAllReviews() {
		return allReviews;
	}

	
	public List<Review> getReviewByMovies(int movieId)
	{
		List<Review> movieReview = new ArrayList<>();
		
		for (Review review : allReviews) {
			if(review.getMovieId() == movieId)
			{
				movieReview.add(review);
			}
		}
		
		return movieReview;
	}
	
	
	public float getAverageRaiting(int movieId)
	{
		float avgRating = 0;
		int totalOfReview = 0;
		int reviewCounts = 0;
		
		for (Review review : allReviews) {
			if(review.getMovieId() == movieId)
			{
				reviewCounts++;
				totalOfReview += review.getRating();
			}
		}
		
		
		avgRating = totalOfReview/reviewCounts;
		return avgRating;
	}
	
	
}
