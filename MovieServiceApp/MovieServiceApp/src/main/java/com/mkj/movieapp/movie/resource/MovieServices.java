package com.mkj.movieapp.movie.resource;

import java.util.Map;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mkj.movieapp.movie.dao.MovieDB;
import com.mkj.movieapp.movie.model.Movie;
import com.mkj.movieapp.movie.model.Review;

@RestController
@RequestMapping("/api/movie")
public class MovieServices {

	@Autowired
	MovieDB movieDB;
	
	@Autowired
	RestTemplate restTemplate;
	
	public MovieServices() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/list")
	public Collection<Movie> getAllMovies()
	{
		Map<Integer, Movie> allMovies = movieDB.getAllMovies();
		Collection<Movie> movieList = allMovies.values();
		return movieList;
	}
		
	@GetMapping("/{movieId}")
	public Movie getMovieById(@PathVariable int movieId)throws Exception
	{
		Movie m = movieDB.getMovieById(movieId);
		
		if(m != null)
		{
			
			String reviewServiceURL = "http://MOVIEREVIEWSERVICE/api/review/movie/rating/"+movieId; 
			float avgRating = restTemplate.getForObject(reviewServiceURL, Float.class);
			
			m.setStarRaiting((int)avgRating);
			
			
			String userMovieURL = "http://MOVIEREVIEWSERVICE/api/review/movie/"+movieId;
			List<Review> list = restTemplate.getForObject(userMovieURL, List.class);
			m.setMovieReview(list);
			
			return m;
		}
		else
		{
			throw new Exception("Invalid Movie Id");
		}
	}
}
