package com.mkj.movieapp.movie.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.mkj.movieapp.movie.model.Movie;
import com.mkj.movieapp.movie.model.Review;

@Component
public class MovieDB {

	Map<Integer, Movie> allMovies;
	
	public MovieDB() {
		
		allMovies = new HashMap<>();
		
		allMovies.put(101, new Movie(101, "Terminal", 0));
		allMovies.put(102, new Movie(102, "Gravity", 0));
		allMovies.put(103, new Movie(103, "PK", 0));
		allMovies.put(104, new Movie(104, "Passenger", 0));
		allMovies.put(105, new Movie(105, "Forest Gump", 0));
		
		
	}
	
	public Movie setReview(int movieId,List<Review> movieReviews)
	{
		Movie movie = getMovieById(movieId);
		
		if(movie!=null)
		{
			movie.setMovieReview(movieReviews);
			return movie;
		}
		return null;
	}
	
	
	public Map<Integer, Movie> getAllMovies()
	{
		return allMovies;
	}
	
	public Movie getMovieById(int movieId)
	{
		return allMovies.get(movieId);
	}
	public Movie getMovieByName(String movieName)
	{
		Movie movie = null;
		
		for (Map.Entry<Integer, Movie> entry : allMovies.entrySet()) {
			Movie m = entry.getValue();
			if(m.getName().equalsIgnoreCase(movieName))
			{
				return m;
			}
		}
		
		
		return movie;
	}
}
