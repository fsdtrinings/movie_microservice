package com.mkj.movieapp.review.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkj.movieapp.review.dao.ReviewDB;
import com.mkj.movieapp.review.model.Review;

@RestController
@RequestMapping("/api/review")
public class ReviewService {
	
	@Autowired
	ReviewDB reviewDB;
	
	@GetMapping("/all")
	public List<Review> getAllReviews()
	{
		return reviewDB.getAllReviews();
	}
	
	@GetMapping("/movie/{movieId}")
	public List<Review> getAllReviewsByMovieId(@PathVariable int movieId)
	{
		return reviewDB.getReviewByMovies(movieId);
	}
	
	@GetMapping("/movie/rating/{movieId}")
	public float getMovieRaiting(@PathVariable int movieId)
	{
		return reviewDB.getAverageRaiting(movieId);
	}
	
	
	
}//end class
